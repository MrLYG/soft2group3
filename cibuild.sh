#!/bin/bash
git pull
mvn clean package
docker-compose down
docker-compose up -d
docker image rm s2g3:latest
docker commit soft2group3 s2g3
sudo docker login --username=北城17云计算李沅罡 registry.cn-shanghai.aliyuncs.com
expect "password:"
send "lyg123456"
sudo docker tag s2g3 registry.cn-shanghai.aliyuncs.com/lyg_leran_docker/lyg_cd:latest
sudo docker push registry.cn-shanghai.aliyuncs.com/lyg_leran_docker/lyg_cd:latest