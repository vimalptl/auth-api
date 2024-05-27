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

##Change Logs:

```shell
1.  Basic Shell - Springboot 3.3 + MySQL 8 + Spring Security
2.  Add /signup and /login (Authentication and Authorization)
3.  Login Returns JTW Token, create UserController /users/me  /users/all to test out token.
4.  On Failure you get http code, fix this to generalize exception.  Test with wrong password in /login
5.  (TODO)  Role base authentication
    - Create new entity roles
    - Store predefined roles in DB
5a. (TODO)  Save token into 
6.  (TODO)  Token Refresh on expiration
7.  (TODO)  Logout function to invalidate token

```

## Error Handling
There are different authentications we want to return a more explicit message. Let’s enumerates them:

- Bad login credentials: thrown by the exception BadCredentialsException, we must return the HTTP Status code 401.
- Account locked: thrown by the exception AccountStatusException, we must return the HTTP Status code 403.
- Not authorized to access a resource: thrown by the exception AccessDeniedException, we must return the HTTP Status code 403.
- Invalid JWT: thrown by the exception SignatureException, we must return the HTTP Status code 401.
- JWT has expired: thrown by the exception ExpiredJwtException, we must return the HTTP Status code 401.
