# Docker cheat sheet

## Docker images
Docker image it's simply system file.

Every docker image contains layers:
- image can consist many of layers,
- layer it's just another image,
- each image consist base layer,
- layer it's read only. 

It's pattern for creating container so the instance od images is container. So if we build image it can be stored on Docker Hub or local registry. 

To see list of images pulled or created by you on your OS type **docker images**. Command **docker images -q** return docker images id's. Parameter **q** tells that we want only images id's. Command **docker inspect [name of image]** tells us information about images e.g layers, images, long id etc.

Each image contains:
1. tag  
 - used to logically tag images e.g respsitory/name:tag
 - default tag is 'latest'
 - images can have more than one tag
 - docker hub helps to list tag's for image
2. image id
 - used to uniquely identify the image.
3. created 
 − the number of days since the image was created.
4. virtual size 
 - the size of the image 

To create docker images we need to define file calls **Dockerfile**. It's configuration file consist instructions (steps) which take part in image build.

Strcture of this file:
**FROM**
 - describe base image,
 
 **RUN**
 - describe command to be executed 

Container works as a process which is pass in command 'docker run'. To container you can refer by name or container id.
To check short container id by type: 'docker ps' or long container id by 'docker inspect <name of image>'.  To check stopped containers:
	- docker ps -a,
	- docker container ls -a

Find docker container by 'docker container ls -s'. To start container 'docker start <containerID>' to stop conatiner 'docker stop <containerID>'.

Inject additional process to running container 'docker exec <containerID> <comand>'.

Remove stopped containers 'docker rm <containerID>'.

If you want to remove local images it will not be able for running or stopped containers. 
