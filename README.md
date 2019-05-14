# Docker cheat sheet

### A couple useful commands
- [docker images](https://docs.docker.com/engine/reference/commandline/images/)   display all images
- [docker rmi](https://docs.docker.com/engine/reference/commandline/rmi/)   remove an image
- [docker rmi $(docker images -q)](https://docs.docker.com/engine/reference/commandline/rmi/)   remove all images based on ID
- [docker build](https://docs.docker.com/engine/reference/commandline/build/)   create an image
- [docker ps](https://docs.docker.com/engine/reference/commandline/ps/)   shows running containers
- [docker kill](https://docs.docker.com/engine/reference/commandline/kill/)   kill a container

- [docker container ls -a]()   shows all conatiners
- [docker conatiner rm](https://docs.docker.com/engine/reference/commandline/container_rm/)   remova container
- [docker conatiner rm $(docker container -a -q)](https://docs.docker.com/engine/reference/commandline/container_rm/) remove all containers
- [docker container logs](https://docs.docker.com/engine/reference/commandline/container_logs/) shows logg of container

- [docker network create](https://docs.docker.com/engine/reference/commandline/network_create/)   create network based on name
- [docker network ls](https://docs.docker.com/engine/reference/commandline/network/)   shows all networks
- [docker network prune](https://docs.docker.com/engine/reference/commandline/network_prune/)   remove unused networks
- [docker network rm](https://docs.docker.com/engine/reference/commandline/network_rm/)   remove network

- [docker-compose logs](https://docs.docker.com/compose/reference/logs/)   shows container logs based on name of service
- [docker-compose logs -f service-name](https://docs.docker.com/compose/reference/logs/)   shows container logs follow logs
- [docker-compose build](https://docs.docker.com/compose/reference/build/)   rebuild or create images
- [docker-compose up](https://docs.docker.com/compose/reference/up/)   starts containers
- [docker-compose down](https://docs.docker.com/compose/reference/down/)   stop containers  
- [docker-compose restart](https://docs.docker.com/compose/reference/restart/)  restarting docker conatiners

 ## [Docker cheat-sheet](https://github.com/wsargent/docker-cheat-sheet)

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

## Docker images
Docker image it's simply system file.

Every docker image contains layers:
- image can consist one or many of layers,
- layer it's just another image,
- each image consist base layer,
- layer it's read only. 

To see list of images pulled or created by you on your OS type **docker images**. Command **docker images -q** return docker images ids. Parameter **q** tells that we want only images ids. Command **docker inspect [name of the image]** tells us information about images e.g layers, images, long id, etc.

Each image contains:
- tag  
  - used to logically tag images e.g respsitory/name:tag
  - default tag is 'latest'
  - images can have more than one tag
  - docker hub helps to list tag's for image
- image id
  - used to uniquely identify the image.
- created 
  - the number of days since the image was created.
- virtual size 
  - the size of the image 

To create docker images we need to define file calls **Dockerfile**. It's configuration file consist of instructions (steps) which take part in image build.

Structure of this file:
- **FROM**
  - describes base image,
- **RUN**
  - describes command to be executed in new layer on top of current image,
- **CMD**
  - desribes default command to be executed after container will be created,
  - it's not executed in creating the process of the image build,
  - appears only once in **DOCKERFILE** if there will be more than one only the latest will be to act on,
  - could be changed in starting process of container,
- **EXPOSE**
  - describe Docker that the container listens on the specified network ports at runtime,
- **ENTRYPOINT**
  - CMD and ENTRYPOINT they are not the same instructions
  - describe command which allows container to be run as an executable 
 
 Docker image is a pattern for creating a container so the instance of images is a container. If we build image it can be stored on Docker Hub or local registry. 

Container works as a process which is pass in command 'docker run'. To container you can refer by name or container id.
To check short container id by type: **docker ps** or long container id by **docker inspect name of image' **.  To check stopped containers:
 - **docker ps -a**,
 - **docker container ls -a**

Find docker container by **docker container ls -s**. To start container **docker start 'container id'** to stop conatiner **docker stop 'container id'**.

Inject additional process to running container **docker exec 'container ids' 'command'**.

Remove stopped containers **docker rm 'container id'**.

If you want to remove local images it will not be able for running or stopped containers. 

> Cheat sheet not completed !!!
