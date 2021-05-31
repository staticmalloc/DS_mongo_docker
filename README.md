# Demo project for using spring-boot and mongo with docker-compose
### Running project
To run project in docker you need to execute `docker-compose up` in docker directory.
### Building
To rebuild project you need:
* Run build: `./gradlew clean build`
  

* Move builded jar file to docker: `cp libs/demo-0.0.1-SNAPSHOT-plain.jar docker/libs/demo-0.0.1-SNAPSHOT-plain.jar`

* Remove old image docker-spring-boot-mongo from Docker

* Run `docker-compose up` in docker directory

### Examples of requests to server

* POST request to save user data: `curl --header "Content-Type: application/json" \
--request POST \
--data '{"firstName":"Aleksandr","lastName":"Chmil"}' \
http://localhost:8080/users`
  
* GET request to get all users data: `curl http://localhost:8080/users`

* GET request to find user by id: `curl http://localhost:8080/users/{id}`