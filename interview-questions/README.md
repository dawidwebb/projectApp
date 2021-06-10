# Docker - Interview questions

## Table of Contents
| Topics: | 
| -------------|
|[*Docker image*](#docker-image)|
|[*Docker container*](#docker-container)|
|[*Run docker container*](#run-docker-container)|
|[*Exposing port*](#exposing-port)|
|[*Exposing multiple ports*](#exposing-multiple-port)|

### Docker image

Image is a template for creating an environment of your e.g app.

***Image is a snapshots**.You can build multiple snapshots, e.g version of your image and you can point on whatever version you want at the particular time.

Has everything need to run your apps. Operation system, required dependencies, and code.

**[⬆ Back to Top](#table-of-contents)**

### Docker container

Running instance of an Image.

**[⬆ Back to Top](#table-of-contents)**

### Run docker container

Let's pull image from docker registry in this case docker hub:
- [docker pull nginx](https://hub.docker.com/_/nginx) - pull nginx image

Check if image is availabe right know:
- [docker images | grep nginx]() - viewing pulled image

Then we pass:
- [docker run nginx:latest]() - running a nginx container

Check if conatiner is running:
- [docker container ls]() - view running nginx container

Add a flag -d:
- [docker run -d  nginx:latest]() - run the container in detached mode
 
**[⬆ Back to Top](#table-of-contents)**

### Exposing port

Stop the container if is running:
- [docker stop <container_id>]() - stops a container

We want to expose hostport tcp/80 to map that port localhost 8080:
[docker run -d -p 8080:80  nginx:latest]() - expose port to localhost

If we exec **docker ps** we get PORT: 0.0.0.0:8080->80/tcp for newly started nginx.

Map localhost 8080 **0.0.0.0:8080** to port 80/tcp inside this container.

**[⬆ Back to Top](#table-of-contents)**


### Exposing multiple port

Just add another -p flag:
[[docker run -d -p 8080:80  -p 3000:80 nginx:latest]() - expose port to localhost]()

**[⬆ Back to Top](#table-of-contents)**
