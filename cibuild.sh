#!/bin/bash
git pull
mvn clean package
docker-compose down
docker-compose up -d
docker image rm s2g3:latest
docker commit soft2group3 s2g3
sudo docker login --username=100012527846 ccr.ccs.tencentyun.com
lyg123456
sudo docker tag s2g3 ccr.ccs.tencentyun.com/lyg_learn_docker/lyg_cd:latest
sudo docker push ccr.ccs.tencentyun.com/lyg_learn_docker/lyg_cd:latest