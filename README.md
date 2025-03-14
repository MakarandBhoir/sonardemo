# Simple Todo Java Web Project

This is a simple Todo application built with Java and Spring Boot. The application allows users to create, read, update, and delete todo items.

## Project Structure

```
simple-todo-java-web
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── todo
│   │   │               ├── App.java
│   │   │               ├── controller
│   │   │               │   └── TodoController.java
│   │   │               ├── model
│   │   │               │   └── Todo.java
│   │   │               └── service
│   │   │                   └── TodoService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── todo
│                       └── AppTest.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone https://github.com/yourusername/simple-todo-java-web.git
   ```

2. **Navigate to the project directory:**
   ```
   cd simple-todo-java-web
   ```

3. **Build the project using Maven:**
   ```
   mvn clean install
   ```

4. **Run the application:**
   ```
   mvn spring-boot:run
   ```

## Usage

Once the application is running, you can access the Todo API at `http://localhost:8080/todos`. You can perform the following operations:

- **GET /todos**: Retrieve all todo items.
- **POST /todos**: Create a new todo item.
- **PUT /todos/{id}**: Update an existing todo item.
- **DELETE /todos/{id}**: Delete a todo item.

## Known Issues

- The application lacks proper error handling in the main method.
- User input is not validated in the TodoController, which may lead to vulnerabilities.
- The Todo model uses public fields instead of private fields with getters and setters.
- The TodoService contains hardcoded values that could be exploited.
- Unit tests in AppTest do not cover all edge cases.

Feel free to contribute to the project by fixing these issues or adding new features!#   s o n a r d e m o  
 