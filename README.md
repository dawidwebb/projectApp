
# Docker cheat sheet

## A couple useful commands

### Remove/kill command
- [docker rmi](https://docs.docker.com/engine/reference/commandline/rmi/)   remove an image
- [docker rmi $(docker images -q)](https://docs.docker.com/engine/reference/commandline/rmi/)   remove all images based on ID
- [docker kill](https://docs.docker.com/engine/reference/commandline/kill/)   kill a container
- [docker conatiner rm](https://docs.docker.com/engine/reference/commandline/container_rm/)   remova container
- [docker conatiner rm $(docker container -a -q)](https://docs.docker.com/engine/reference/commandline/container_rm/) remove all containers
- [docker network prune](https://docs.docker.com/engine/reference/commandline/network_prune/)   remove unused networks
- [docker network rm](https://docs.docker.com/engine/reference/commandline/network_rm/)   remove network

### Shows images/conatiners/networks/logs
- [docker images](https://docs.docker.com/engine/reference/commandline/images/)   display all images
- [docker container ls -a]()   shows all conatiners
- [docker-compose logs](https://docs.docker.com/compose/reference/logs/)   shows container logs based on name of service
- [docker-compose logs -f service-name](https://docs.docker.com/compose/reference/logs/)   shows container logs follow logs
- [docker network ls](https://docs.docker.com/engine/reference/commandline/network/)   shows all networks
- [docker ps](https://docs.docker.com/engine/reference/commandline/ps/)   shows running containers
### Create image/container/network
- [docker build](https://docs.docker.com/engine/reference/commandline/build/)   create an image from Dockerfile
- [docker network create](https://docs.docker.com/engine/reference/commandline/network_create/)   create network based on name
- [docker-compose build](https://docs.docker.com/compose/reference/build/)   rebuild or create images

### Create/starts images/contaiers
- [docker exec](https://docs.docker.com/engine/reference/commandline/exec/) execute command within running container
- [docker-compose up](https://docs.docker.com/compose/reference/up/)   starts containers
- [docker-compose down](https://docs.docker.com/compose/reference/down/)   stop containers  
- [docker-compose restart](https://docs.docker.com/compose/reference/restart/)  restarting docker conatiners
- [docker start](https://docs.docker.com/engine/reference/commandline/start/)   starts stopped container
- [docker run](https://docs.docker.com/engine/reference/commandline/run/)     create container from image and start
- [docker stop](https://docs.docker.com/engine/reference/commandline/stop/)   stop running container
- [docker build](https://docs.docker.com/engine/reference/commandline/build/)     build image from Dockerfile

## [Docker cheat-sheet](https://github.com/wsargent/docker-cheat-sheet)

## [Docker architecture](https://docs.docker.com/engine/docker-overview/)

## Advantage of docker
 - the quick app development cycle
   -- lack of compatibility problems between environments,
   -- everything in one place (docker container consists file system, dependencies, libraries, etc.),
 - the division of responsibility
   -- application is implemented by developers,
   -- runtime environment for the app is build separately (Infrastructure as a Code)
 - docker is portability
   -- we built an image on server A and run it on other servers,
 - scalability
   -- add new docker containers and hosts is very easy (**Docker Engine**)
