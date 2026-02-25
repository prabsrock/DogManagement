 
# Dog-Distribution System.

This project is built using Spring Boot and REST APIs, demonstrating CRUD (Create, Read, Update, Delete) operations.

## Features

•	Dog Management:
            Add, retrieve, update, and delete dogs.

•	Dog Validation:
            Create a validation framework from input fields.

•	RESTful APIs: 
            Provides clean and modular endpoints for seamless integration with third-party applications.

•	Postman Testing: 
            Includes APIs for testing.

• Database Integration: 
            Persistent storage with a relational database PostgreSQL.

## Tech Stack

•	Springboot: Backend framework for building scalable applications.

•	Spring Data JPA: For simplified data access.

•	Spring Web : for RESTful APIs

•	Springboot DevTools : for hot reloading (optional)

•	Maven : Builds, manages dependencies and project lifecycle.

•	Postman: For testing and validating API endpoints.

•	Thymeleaf : Server-side Java template engine viewing dynamic HTML

•	Docker: Package app into container for deployment in render.com.

•	Render.com: Cloud platform deploying web apps, databases.

•	PostgreSQL : For storing data in relational database.
           
## API Reference

#### Get all dogs

```http
  https://dogmanagement-ystu.onrender.com/api/dogs
```

#### Get dog

```http
  GET /api/dogs/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | **Required**. Id of dog to fetch |


#### CRUD API for Dogs

This project implements a simple CRUD API for managing dogs. The application allows you to create, read, update, and delete dogs.

## Api Endpoints

Dog Endpoints

    Get All Dogs: GET /api/dogs
    Get Dog by ID: GET /api/dogs/{id}
    Create Dog: POST /api/dogs
    Update Dog: PUT /api/dogs/{id}
    Delete Dog: DELETE /api/dogs/{id}


### Dog CRUD

1. **POST /api/dogs**
   - Create a new dog.
   - **Request Body:**
     ```json
      {
        "dogBreed": "spaniel",
        "dogType": "cocker"
      }
     ```

2. **GET /api/dogs/{id}**
   - Fetch a dog by ID.
   - **Example:**
     ```http
     GET http://localhost:8080/api/dogs/1
     ```
   - **Example:**
     ```http
     GET https://dogmanagement-ystu.onrender.com/api/dogs/1
     ```

3. **PUT /api/dogs/{id}**
   - Update a dog by ID.
   - **Request Body:**
     ```json
      {
        "dogBreed" : "Retriver",
        "dogType" : "Golden"
      }
     ```

4. **DELETE /api/dogs/{id}**
   - Delete a deog by ID.
   - **Example:**
     ```http
     DELETE http://localhost:8080/api/dogs/1
     ```
   - **Example:**
     ```http
     DELETE https://dogmanagement-ystu.onrender.com/api/dogs/1
     ```



## Project Setup

### Prerequisites

- **JDK 17  or higher**
- **Maven** (for building the project)
- **IDE** (e.g., IntelliJ IDEA, VS Code, or STS)

### Steps to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/prabsrock/DogManagement.git
2. ***Navigate into the project directory:**
    ```bash
    cd dog
3. **Build the project using Maven:**
    ```bash
    mvn clean install
4. **Run the test cases of the project using Maven:**
    ```bash
    mvn test
5. **Run the application:**
    ```bash
    mvn spring-boot:run
The application will start on port 8080 by default.


## Project Structure

Model: Defines dog data.

Repository: Interfaces for database operations using Spring Data JPA.

Service: Contains business logic for validation operations.

Exception: Contains business error logic.

Config: Classes to static values and messages.

Controller: Exposes REST endpoints for external interaction.


## Conclusion

This API provides endpoints for creating, retrieving, updating, and deleting dogs. Use the examples provided to make requests to the API and manage your data.

You can also launch the application’s graphical user interface (GUI) to interact with its features. 

The cold start initialization process may require several minutes before the application becomes fully operational.

  ```https
      https://dogmanagement-ystu.onrender.com
