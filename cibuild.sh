#!/bin/bash
git pull
mvn clean package
docker-compose down
docker-compose up -d
docker image rm s2g3
docker commit soft2gropu3 s2g3
sudo docker login --username=100012527846 ccr.ccs.tencentyun.com
lygtyc521
sudo docker tag s2g3 ccr.ccs.tencentyun.com/lyg_learn_docker/lyg_cd: