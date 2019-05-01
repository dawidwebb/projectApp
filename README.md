# Docker cheat sheet

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
**FROM**
 - describes base image,
 **RUN**
 - describes command to be executed in new layer on top of current image,
**CMD**
 - desribes default command to be executed after container will be created,
 - it's not executed in creating the process of the image build,
 - appears only once in **DOCKERFILE** if there will be more than one only the latest will be to act on,
 - could be changed in starting process of container,
**EXPOSE**
 - describe Docker that the container listens on the specified network ports at runtime,
 **ENTRYPOINT**
  - CMD and ENTRYPOINT they are not the same instructions
  - describe command which allows container to be run as an executable 
 
 Docker image is a pattern for creating a container so the instance of images is a container. If we build image it can be stored on Docker Hub or local registry. 

Container works as a process which is pass in command 'docker run'. To container you can refer by name or container id.
To check short container id by type: **docker ps** or long container id by **docker inspect name of image' **.  To check stopped containers:
	- docker ps -a,
	- docker container ls -a

Find docker container by **docker container ls -s**. To start container **docker start 'container id'** to stop conatiner **docker stop 'container id'**.

Inject additional process to running container **docker exec <containerID> command'**.

Remove stopped containers **docker rm 'container id'**.

If you want to remove local images it will not be able for running or stopped containers. 

> CHeat sheet not completed !!!
