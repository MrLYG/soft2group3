#!/bin/bash
git pull
mvn clean package
docker-compose down
docker-compose up -d
docker image rm s2g3
docker commit soft2gropu3 s2g3
