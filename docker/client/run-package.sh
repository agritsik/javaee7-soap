#!/usr/bin/env bash

# generate java classes using wsdl file
# wsimport http://192.168.59.103:8081/app/ProductWSService?wsdl -keep -d client/src/main/java -p com.agritsik.samples.boundary.ws

# package and copy the client war to docker image
mvn clean -f client/pom.xml && mvn package -DskipTests -Pdocker-dev -f client/pom.xml
cp client/target/client-1.0-SNAPSHOT.war docker/_images/glassfish-4.1/target/app.war