
# Docker healthcheck problems

## A service is up but healthcheck says that is unhealthy

### Symptoms of a "docker" disease 
I had an issue while implementing my [microservice project](https://github.com/witosh/astro-microservices) and setup healthcheck for each service to be sure that my services are up to without a problem. 

Docker [doc](https://docs.docker.com/engine/reference/builder/#healthcheck) says:
< "tells Docker how to test a container to check that it is still working."

```
healthcheck:
      test: ["CMD","curl","-f","http://localhost:8888/actuator/health"]
      interval: 1m
      timeout: 3s
      retries: 5
```
(This is my configuration of healthcheck in docker-compose.yml, of course, it could be in Dockerfile, but it depends on what's developer want to achieve and on his motivation)

The project consists a couple of important services (I mean base microservice architecture services such as config-service, discovery-service, gateway-service, etc.) they communicate each other and share configuration files discovery register services and so on. So it looks that everything is ok but my health check in docker says something different, that services are unhealthy!!!

When run docker command:
- docker ps

```
CONTAINER ID        IMAGE                                     COMMAND                  CREATED             STATUS                   PORTS               NAMES
ddce09a0d4db        astro/discovery-service:Github-SNAPSHOT   "java -Djava.securit…"   2 minutes ago       Up 2 minutes (unhealthy)   8761/tcp            discovery-service
c3c163b12c53        astro/config-service:Github-SNAPSHOT      "java -Djava.securit…"   2 minutes ago       Up 2 minutes (unhealthy)   8888/tcp            config-service
```
### Don't waste your time just inspect!!!
I spent some time to solve this issue. I have tried:
 - new configuration, 
 - restarting services, 
 - expand retries, timeout, and intervals in the healthcheck, 
 - change ports and publish them, 
 - change Dockerfile etc.

but what's important I totally forgot about very useful command in docker tools:

- [docker inspect](https://docs.docker.com/engine/reference/commandline/inspect/) (provides a very usefull information about container)

and also the thing that instruction defined in healthcheck container executes inside of them.

So, when I have run my services again and the healthchecks said the same again I decide to inspect my container.
```
Status": "unhealthy",
                "FailingStreak": 0,
                "Log": [
                    {
                        "Start": "2019-05-23T19:17:29.819913428+02:00",
                        "End": "2019-05-23T19:17:30.596789782+02:00",
                        "ExitCode": 0,
                        "Output": "OCI runtime exec failed: exec failed: (…) executable file not found in $PATH": unknown"
                    },

```
(It is quite big JSON file with all desciption about container)

My container was not able to execute this command from healthcheck and that's why they always said that service in **unhealthy** even if they have been run **UP** and  be able to communicated to each other.

In, my cases to solve this problem was change of base image in DOckerfile that's couse my container was be able to run healthcheck instruction.  

After that command which says about running container:
```
CONTAINER ID        IMAGE                                     COMMAND                  CREATED             STATUS                        PORTS               NAMES
ddce09a0d4db        astro/discovery-service:Github-SNAPSHOT   "java -Djava.securit…"   35 minutes ago      Up About a minute (healthy)   8761/tcp            discovery-service
c3c163b12c53        astro/config-service:Github-SNAPSHOT      "java -Djava.securit…"   35 minutes ago      Up About a minute (healthy)   8888/tcp            config-service

```
and logs form insaide of container:
```
           "Health": {
                "Status": "healthy",
                "FailingStreak": 0,
                "Log": [
                    {
                        "Start": "2019-05-23T19:19:30.858024552+02:00",
                        "End": "2019-05-23T19:19:31.093584523+02:00",
                        "ExitCode": 0,
                        "Output": "  % Total    % Received % Xferd  Average Speed   Time    Time     Time  Current\n                                 Dload  Upload   Total   Spent    Left  Speed\n\r  0     0    0     0    0     0      0      0 --:--:-- --:--:-- --:--:--     0\r100    15    0    15    0     0    928      0 --:--:-- --:--:-- --:--:--  1000\n{\"status\":\"UP\"}"
                    },

```