# How to create own docker images

## Dockerfile

To create docker images we need to define file calls **Dockerfile**. It's configuration file consist of instructions (steps) which take part in image build.

Description and gal of each layer:
- **FROM**
  - every single proper image must start with the instruction `FROM` as a parent image, in this case, it's `openjdk:8-jre-alpin`. We sets java jdk to be able run springboot microservice.
- **ARG** variable that can be use in built-time in Dockerfile. In this case we set variable `VERSION` for a target build of microservice.
- **VOLUME** as documentation says it's a mount point, so it means. This is mechanism for persist data ganarated by container in this case /tmp directory is needed for Tomcat. Even if we remove container we can use volume created before by -v command. 
- **EXPOSE** indicate that container listen on specific port.
- **ADD** add files to the filesystem of the image. We adding it to the `add.jar`.
- **RUN** it run execute commands in a image layer. Update timestamp and make sure that file is exists.
- **ENTRYPOINT** take part in process of creating container as an executable.

[Dockerfile commands](https://docs.docker.com/engine/reference/builder)

### How to run
Firstly, execute: 
- `mvn clean install`
to build project and get /target directory. 

Then build docker image.
- `docker build -t "docker-microservice:dockerfile" .`

If everything goes ok should be see this message:
`Successfully tagged docker-microservice:dockerfile`

To create container from image just type:
- `docker run docker-microservice:dockerfile`

Microservice shoulde be avaliable under this location:
 - http://localhost:8089


**[⬆ Back to manu](#https://github.com/witosh/docker-cheat-sheet#table-of-contents)**
