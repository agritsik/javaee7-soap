#!/usr/bin/env bash

mvn clean -f server/pom.xml && mvn package -DskipTests -Pdocker-dev -f server/pom.xml
cp server/target/server-1.0-SNAPSHOT.war docker/_images/glassfish-4.1/target/app.war