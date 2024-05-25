# Auth-API *** springboot3.3-JWT-app

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)
- [Maven 4 - beta 2](https://maven.apache.org/docs/4.0.0-alpha-2/release-notes.html)
- [MYSQL 8](https://dev.mysql.com/downloads/installer/)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.vp.auth_api.AuthApiApplication` class from your IDE.

Alternatively you can use VSCODE with Maven build to run the project like so:

```shell
mvn spring-boot:run
```

```shell
vscode launch.json
{
    "configurations": [
        {
            "type": "java",
            "name": "Spring Boot-AuthApiApplication<auth-api>",
            "request": "launch",
            "cwd": "${workspaceFolder}",
            "mainClass": "com.vp.auth_api.AuthApiApplication",
            "projectName": "auth-api",
            "args": "",
            "vmArgs": "-Dspring.profiles.active=LOCAL",
            "envFile": "${workspaceFolder}/.env"
        }
    ]
}

```