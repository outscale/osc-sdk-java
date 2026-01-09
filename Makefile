API_VERSION=$(shell cat api_version)
SDK_VERSION=$(shell cat sdk_version)
USER_ID=$(shell id -u)
GROUP_ID=$(shell id -g)
OPENAPI_IMG=openapitools/openapi-generator-cli:v7.17.0
#OPENAPI_IMG=outscale/openapi-generator:java-awsv4-signature
SHELL := /bin/bash

all: help

.PHONY: help
help:
	@echo "help:"
	@echo "- make test  : run all tests"
	@echo "- make build : build"

.PHONY: clean
clean:
	@echo cleaning build artifacts...
	mvn clean

.PHONY: test
test: reuse-test examples-test regen-test
	@echo all tests OK...

.PHONY: build
build: 
	@echo all tests OK...
	mvn clean compile

.PHONY: reuse-test
reuse-test:
	@echo testing licensing with reuse...
	docker run --rm --volume $(PWD):/data fsfe/reuse:6.2 lint

.PHONY: examples-test
examples-test: example-volumes example-region example-vm example-config_file example-config_env example-password_auth
	@echo examples are OK

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

.PHONY: local-deploy
local-deploy:
	mvn clean install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Dgpg.skip
