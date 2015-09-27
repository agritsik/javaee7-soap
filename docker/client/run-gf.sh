#!/usr/bin/env bash

CONTAINER="jaxws-client"

docker build -t agritsik/$CONTAINER docker/_images/glassfish-4.1/

docker rm -f -v $CONTAINER
docker run -d -p 4850:4848 -p 8082:8080 --name $CONTAINER agritsik/$CONTAINER

#docker logs -f $CONTAINER