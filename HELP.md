# Library Management System API

This is a RESTful API built using Spring Boot that allows users to perform CRUD operations on a library's book inventory. It includes features such as input validation, exception handling, security using Basic Authentication, and persistence using Hibernate with an SQL database.

---

## Features

- **CRUD Operations**: Manage books with endpoints to create, read, update, and delete.
- **Validation**: Ensures all fields are correctly formatted and required data is provided.
- **Security**: Secured using Spring Security with Basic Authentication.
- **Persistence**: Data stored using Hibernate and SQL database.
- **Exception Handling**: Graceful error handling with meaningful error responses.
- **DTO Layer**: Decouples API request/response from database entities.

---

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java**: JDK 17 or later
- **Maven**: 3.8 or later
- **SQL Datab


## Configure the Database

- Open the src/main/resources/application.properties file.

Update the following properties with your database details:

 **properties**
spring.datasource.url=jdbc:mysql://localhost:3306/library_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

- If using a different database, update the spring.datasource.url accordingly.

## Build the Project

- mvn clean install
- Run the Application

- mvn spring-boot:run
Access the API The application will start at http://localhost:3000.

