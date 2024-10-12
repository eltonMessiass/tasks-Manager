# Spring Boot "Tasks App" project

This is a Java / Maven / Spring Boot application that can be used to write tasks

## How to Run

This application is package as a war which has Tomcat 8 embedded. No Tomcat or JBoss is necessary. You run it using the ```java -jar``` command

* Clone this repository
* Make sure you a using jdk 21 or higher
* You can build the project and run tests by running ```mvn clean package```
* Once successfully built, you can run the service by ibe if these methods


## About the App

The app is just a simple REST service. It uses postgres database to store the data

Here a some endpoints you can call:

### Create a task

```
POST /api/tasks
Accept: application/json
Content-Type: application/json

{
"title" : "new task",
"description" : "new task desc"
"status" : "PENDING",
"date" : 20/10/2024
}
```

### Retrieve a list of tasks

```
http://localhost:8080/tasks

Response: HTTP 200
```

### Update a task

```
PUT /api/task//1
Accept: application/json
Content-Type: application/json

{
"title" : "new task",
"description" : "new task desc"
"status" : "PENDING",
"date" : 20/10/2024
}

RESPONSE: HTTP 204 (No Content)
```