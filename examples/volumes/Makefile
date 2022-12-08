build: target/volumes-1.0-SNAPSHOT-jar-with-dependencies.jar

target/volumes-1.0-SNAPSHOT-jar-with-dependencies.jar:
	mvn clean compile assembly:single

run: target/volumes-1.0-SNAPSHOT-jar-with-dependencies.jar
	java -jar target/volumes-1.0-SNAPSHOT-jar-with-dependencies.jar
