DOCKER

Docker image it's simply system file.

The instance od images is container.

To see list of images pulled or created by you on your OS type:
	- docker images

Command 'docker images -q' return docker images id's. Parameter 
'q' tells that we want only images id's.

Command 'docker inspect <name of images>' tells us information about images e.g layers, images id etc.

Each image contains:
	-TAG − This is used to logically tag images e.g respsitory/name:tag
		--default tag is 'latest'
		--images can have more than one tag
		--docker hub helps to list tag's for image
		--
	-Image ID − This is used to uniquely identify the image.
	-Created − The number of days since the image was created.
	-Virtual Size − The size of the image 

Layers of images:
	- image can consist many of layers
	- layer it's just another image
	- each image consist base layer
	- layer it's read only 

Docker file: 

Container works as a process which is pass in command 'docker run'. To container you can refer by name or container id.
To check short container id by type: 'docker ps' or long container id by 'docker inspect <name of image>'.  To check stopped containers:
	- docker ps -a,
	- docker container ls -a

Find docker container by 'docker container ls -s'. To start container 'docker start <containerID>' to stop conatiner 'docker stop <containerID>'.

Inject additional process to running container 'docker exec <containerID> <comand>'.

Remove stopped containers 'docker rm <containerID>'.

If you want to remove local images it will not be able for running or stopped containers. 
