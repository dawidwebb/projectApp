# Docker - Interview questions

## Table of Contents
| Simple topics: | 
| -------------|
|[*Docker image*](#docker-image)|
|[*Docker container*](#docker-container)|
|[*Docker volumes*](#docker-volumes)|
|[*Tags version and tagging*](#tags-version-and-tagging)|
|[*Docker registry*](#docker-registry)|
|[*Dockerfile*](#dockerfile)|
|[*Exposing port*](#exposing-port)|

### Docker image

Image is a template for creating an environment of your e.g app.

***Image is a snapshots**.You can build multiple snapshots, e.g version of your image and you can point on whatever version you want at the particular time.

Has everything need to run your apps. Operation system, required dependencies, and code.

**[⬆ Back to Top](#table-of-contents)**

### Docker container

Running instance of an **Image**.

**[⬆ Back to Top](#table-of-contents)**

### Docker volumes
Allows sharing of data. Files and folder, between host and container. Between containers.

**[⬆ Back to Top](#table-of-contents)**

### Tags version and tagging

Allows you to control image version.
Avoid breaking changes.
Safe.
You have control on mage version.

**[⬆ Back to Top](#table-of-contents)**

### Docker registry

Higly scalable server side application that stores and lest you distribute Docker images.
Used in yout CD/CI pipeline
Run your application

**[⬆ Back to Top](#table-of-contents)**

### Dockerfile

**Dockerfile** - list of steps how to create image.

**[⬆ Back to Top](#table-of-contents)**

### Exposing port

Command **docker ps** we get PORT: 0.0.0.0:8080->80/tcp for newly started nginx.

Map localhost 8080 **0.0.0.0:8080** to port 80/tcp inside this container.

**[⬆ Back to Top](#table-of-contents)**
