API_VERSION=$(shell cat api_version)
SDK_VERSION=$(shell cat sdk_version)
USER_ID=$(shell id -u)
GROUP_ID=$(shell id -g)
#OPENAPI_IMG=openapitools/openapi-generator:cli-latest-release
OPENAPI_IMG=outscale/openapi-generator:java-awsv4-signature
SHELL := /bin/bash

all: help

.PHONY: help
help:
	@echo "help:"
	@echo "- make gen   : regenerate SDK"
	@echo "- make test  : run all tests"

.PHONY: gen
gen: clean osc-generate

.PNONY: openapi-generator-help
openapi-generator-help:
	docker run -v $(PWD):/sdk --rm $(OPENAPI_IMG) config-help -g java

.PHONY: osc-generate
osc-generate: osc-api/outscale.yaml
	@echo start generating SDK...
	rm -rf .sdk || true
	mkdir .sdk
	docker run -v $(PWD):/sdk --rm $(OPENAPI_IMG) generate -i /sdk/osc-api/outscale.yaml -g java -c /sdk/gen.yml -o /sdk/.sdk
	docker run -v $(PWD):/sdk --rm $(OPENAPI_IMG) sed -i "s%setUserAgent(\".*\");%setUserAgent(\"osc-sdk-java/$(SDK_VERSION)\");%" /sdk/.sdk/src/main/java/com/outscale/osc_sdk_java/client/ApiClient.java
	docker run -v $(PWD):/sdk --rm $(OPENAPI_IMG) chown -R $(USER_ID).$(GROUP_ID) /sdk/.sdk
	@echo SDK generated
	mv .sdk/src ./
	mv .sdk/docs ./
	git apply ./.osc-patches/*

osc-api/outscale.yaml:
	@echo getting osc-api description...
	git clone https://github.com/outscale/osc-api.git && cd osc-api && git checkout -b $(API_VERSION) $(API_VERSION)
	cd osc-api && git apply ../.osc-api-patches/outscale-yaml.patch

.PHONY: clean
clean:
	@echo cleaning build artifacts...
	rm -rf .sdk osc-api src docs || true

.PHONY: test
test: reuse-test examples-test regen-test
	@echo all tests OK...

.PHONY: reuse-test
reuse-test:
	@echo testing licensing with reuse...
	docker run --rm --volume $(PWD):/data fsfe/reuse:0.11.1 lint

.PHONY: local-deploy
local-deploy:
	mvn clean install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true

.PHONY: examples-test
examples-test: example-ak example-volumes example-region example-vm example-config_file example-config_env example-password_auth
	@echo examples are OK

.PHONY: example-ak
example-ak: local-deploy
	@echo testing examples/ak example...
	make -C examples/ak build run

.PHONY: example-volumes
example-volumes: local-deploy
	@echo testing examples/volumes example...
	make -C examples/volumes build run

.PHONY: example-region
example-region: local-deploy
	@echo testing examples/region example...
	make -C examples/region build run

.PHONY: example-vm
example-vm: local-deploy
	@echo testing examples/vm example...
	make -C examples/vm build run

.PHONY: example-config_file
example-config_file: local-deploy
	@echo testing examples/config_file example...
	make -C examples/config_file build run

.PHONY: example-config_env
example-config_env: local-deploy
	@echo testing examples/config_env example...
	make -C examples/config_env build run

.PHONY: example-password_auth
example-password_auth: local-deploy
	@echo testing examples/password_auth example...
	make -C examples/password_auth build run
# try to regen, should not have any difference
.PHONY: regen-test
regen-test: gen
	@echo SDK regeneration test...
	git add src
	git diff --cached -s --exit-code
	git diff -s --exit-code

# Used by bot to auto-release
# GH_TOKEN and SSH_PRIVATE_KEY are needed
.PHONY: auto-release
auto-release: auto-release-cleanup osc-api-check release-check-duplicate release-build release-push release-pr
	@echo OK

.PHONY: auto-release-cleanup
auto-release-cleanup:
	rm -rf .auto-release-abort || true

.PHONY: osc-api-check
osc-api-check:
	bash .github/scripts/osc-api-check.sh

.PHONY: release-check-duplicate
release-check-duplicate:
	bash .github/scripts/release-check-duplicate.sh

.PHONY: release-build
release-build:
	bash .github/scripts/release-build.sh

.PHONY: release-push
release-push:
	bash .github/scripts/release-push.sh

.PHONY: release-pr
release-pr:
	bash .github/scripts/release-pr.sh
