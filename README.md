
# Docker cheat sheet

## A couple useful commands

### Remove/kill command
- [docker rmi](https://docs.docker.com/engine/reference/commandline/rmi/)   remove an image
- [docker rmi $(docker images -q)](https://docs.docker.com/engine/reference/commandline/rmi/)   remove all images based on ID
- [docker rmi $(docker images -q | head -n +2)](https://docs.docker.com/engine/reference/commandline/rmi/)   remove 2 recently created images based on ID
- [docker rmi $(docker images -q | tail -n +2)](https://docs.docker.com/engine/reference/commandline/rmi/)   remove 2 the most oldest created images based on ID
- [docker kill](https://docs.docker.com/engine/reference/commandline/kill/)   kill a container
- [docker container rm](https://docs.docker.com/engine/reference/commandline/container_rm/)   remove container
- [docker container rm $(docker container ls -a -q)](https://docs.docker.com/engine/reference/commandline/container_rm/) remove all containers
- [docker network prune](https://docs.docker.com/engine/reference/commandline/network_prune/)   remove unused networks
- [docker network rm](https://docs.docker.com/engine/reference/commandline/network_rm/)   remove network
- [docker image prune](https://docs.docker.com/engine/reference/commandline/image_prune/)   remove unused imges
- [docker volume prune](https://docs.docker.com/engine/reference/commandline/volume_prune/)   remove unused volumes
- [docker volume rm](https://docs.docker.com/engine/reference/commandline/volume_rm/)	remove volume

### Shows images/conatiners/networks/logs
- [docker images](https://docs.docker.com/engine/reference/commandline/images/)   display all images
- [docker container ls -a]()   shows all conatiners
- [docker network ls](https://docs.docker.com/engine/reference/commandline/network/)   shows all networks
- [docker ps](https://docs.docker.com/engine/reference/commandline/ps/)   shows running containers
- [docker volume ls](https://docs.docker.com/engine/reference/commandline/volume_ls/)	shows local volumes
- [docker-compose logs](https://docs.docker.com/compose/reference/logs/)   shows container logs based on name of service
- [docker-compose logs -f](https://docs.docker.com/compose/reference/logs/)   shows container logs follow logs

### Create image/container/network
- [docker build](https://docs.docker.com/engine/reference/commandline/build/)   create an image from Dockerfile
- [docker network create](https://docs.docker.com/engine/reference/commandline/network_create/)   create network based on name
- [docker-compose build](https://docs.docker.com/compose/reference/build/)   rebuild or create images
- [docker-compose ps](https://docs.docker.com/compose/reference/ps/)	shows running containers by docker-compose

### Create/starts images/contaiers
- [docker exec](https://docs.docker.com/engine/reference/commandline/exec/) execute command within running container
- [docker start](https://docs.docker.com/engine/reference/commandline/start/)   starts stopped container
- [docker run](https://docs.docker.com/engine/reference/commandline/run/)     create container from image and start
- [docker stop](https://docs.docker.com/engine/reference/commandline/stop/)   stop running container
- [docker build](https://docs.docker.com/engine/reference/commandline/build/)     build image from Dockerfile
- [docker restart](https://docs.docker.com/engine/reference/commandline/restart/)	restart container 
- [docker-compose restart](https://docs.docker.com/compose/reference/restart/)	restart continer base on name of container
- [docker-compose up](https://docs.docker.com/compose/reference/up/)   starts containers
- [docker-compose down](https://docs.docker.com/compose/reference/down/)   stop containers  

## [Docker cheat-sheet](https://github.com/wsargent/docker-cheat-sheet)

## [Docker architecture](https://docs.docker.com/engine/docker-overview/)
