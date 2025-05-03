# Stroeer Challenge

## Overview
The Stroeer Challenge is a Kotlin-based application that provides a RESTful API for fetching user comments from a remote service. The application is built using the Micronaut framework, which allows for efficient and scalable microservices.

## Features
* Fetch user details and their associated comments.
* Handle user not found scenarios gracefully.
* Logging for tracking API calls and responses.

## Technology
* **Language:** Kotlin 2.1.20 with Kotlin Coroutines 1.10.2
* **Framework:** Micronaut 4.8.2
* **Build Tool:** Gradle 8.3.6
* **Logging:** SLF4J 1.7.30 with Logback 1.2.3
* **Test Framework:** Kotest

## Logging
The project is using logback for logging configured in the file `logback.xml`.

## Running the Application
To run the application, use the following command:
```
./gradlew run
```
To run the tests, execute:
```
./gradlew test
````
## API Endpoints
### 1. Retrieve a single user's details and comments
```
GET /comments/{userId}
```

## Logic
The application's logic is based on the following steps:
1. Fetch user details from the remote service.
2. Concurrently, fetch comments associated with the user from the remote service.
3. Combine the user details and comments into a single response.
4. Return the combined response as a HTTP response.
5. Handle exceptions that may occur during the process; e.g., no data is available for the given user id.
6. Log the API calls and responses for tracking purposes.

## Security
The application does not implement any form of authentication or authorization.
That means that anyone can access the API endpoints without any authentication or authorization.

Such mechanisms can be easily implemented to make the application more secure using basic [Micronaut Security](https://micronaut-projects.github.io/micronaut-security/latest/guide/) techniques, such as [JWT tokens](https://micronaut-projects.github.io/micronaut-security/latest/guide/#jwt) or [Basic Auth](https://micronaut-projects.github.io/micronaut-security/latest/guide/#basicAuth).

## Copyright
Copyright &copy; 2025 Kareem Elzayat
