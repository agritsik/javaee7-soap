#!/usr/bin/env bash

CONTAINER="jaxws-server"

docker build -t agritsik/$CONTAINER docker/_images/glassfish-4.1/

docker rm -f -v $CONTAINER
docker run -d -p 4849:4848 -p 8081:8080 --name $CONTAINER agritsik/$CONTAINER

#docker logs -f $CONTAINER