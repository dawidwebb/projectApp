# How to create own docker images TODO

## Dockerfile

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
