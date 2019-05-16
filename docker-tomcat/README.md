# Containerization of Tomcat 

If you use Linux based operation system e.g. Ubuntu you can simply setup Tomcat server as a docker container. 
To find needed image just visit [Docker Hub](https://hub.docker.com/_/tomcat) and find command to pull tomcat image to your local registry.

## Pull new image
On the page you find description about Tomcat. Description about command ull find here: [docker pull](https://docs.docker.com/engine/reference/commandline/pull/)
`docker pull tomcat` 
Docker container is based on layers (layer can be another image) which can be reusable by other images. 
So in our case, if you execute the command it could happen that you already have needed layers and it pulls only meta-data.

Process of pulling image from docker registry take a while becouse it must pull each layer of image. If everything goes ok you should see below info:

> Status: Downloaded newer image for debian:latest

## Check image
To check pulled image just type:
`docker images`

>REPOSITORY                   TAG                 IMAGE ID            CREATED             SIZE

>tomcat                       latest              3639174793ba        21 hours ago        463MB

This image shoulde be avaliable as repository `tomcat` with tag `latest`, docker engine use default tag in docker which is `latest`. 

## Run docker image

The run command:
- `docker run -it --rm -p 8888:8080 tomcat:8.0`

Tomcat will be avaliable under this address:
http://localhost:8888

But if you want to go to manager of Tomcat you will be provide credentials.

By default in Tomcat directory called `conf` consist `tomcat-users.xml` file which contains configuration about:
- roles
- users.

> <user username="tomcat" password="<default-password>" roles="roles"/>
 

## Prepare new tomcat-users.xml and run dokcer
To be able to get to the manager of Tomcat to upload .war files you need to change `tomcat-users.xml` file to contain proper configuration:

> <role rolename="manager-script"/>
> <role rolename="manager-jmx"/>
> <role rolename="manager-status"/>
> <role rolename="manager-gui"/>
> <user username="tomcat" password="tomcat" roles="manager-gui,manager-script,manager-jmx,manager-status"/>

Stop container by command:
docker stop <container-id>
and the type:
docker run -it -p 8888:8080 -v {absolute-path}/tomcat-users.xml:{absolute-path}/conf/tomcat-users.xml tomcat

- `{absolute-path}/tomcat-users.xml` path to new file on your computer
- `{absolute-path}/conf/tomcat-users.xml` target path for Tomcat  

To check if a file in the container was changed, execute the command within running container. To do that get id of your container:
-`docker container ps` 
and type:
-`docker exec -it <container-is> cat {absolute-path}/conf/tomcat-users.xml`

## Restart container

At the end try to restart docker container by execute two commands and previos container id:
- `docker stop <docker-container>`
- `docker start <docker-container>`

Now, you are able to access to manager and uplaod .war fiels.

