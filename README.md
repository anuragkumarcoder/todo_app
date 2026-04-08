Todo Application
A full-stack Todo Management system built using Java, Spring Boot, and Thymeleaf. This application allows users to create, track, and manage their daily tasks with a clean, responsive web interface styled with Bootstrap.

🚀 Features
Task Creation: Quickly add new tasks through a simple web form.

Persistent Storage: All tasks are saved in a MySQL database, ensuring data persists after server restarts.

Task Management:

Toggle Completion: Click a button to switch a task's status between "Complete" and "Incomplete".

Visual Feedback: Completed tasks are automatically displayed with a strikethrough effect for easy tracking.

Deletion: Easily remove tasks from your list with a single click.

🛠 Tech Stack
Backend: Java 21 with Spring Boot 4.0.5.

Database: MySQL.

ORM: Spring Data JPA with Hibernate for database interactions.

Frontend: Thymeleaf templates with Bootstrap 5.3.3 for responsive design.

Utilities: Lombok to reduce boilerplate code (Getters, Setters, etc.).

📋 Prerequisites
Before running the application, ensure you have the following installed:

Java Development Kit (JDK): Version 21 or higher.

Maven: For dependency management and building the project.

MySQL Server: Running on your local machine.

⚙️ Setup and Installation
Configure Database:

Open your MySQL terminal or MySQL Workbench.

Create a database named todo_db:

SQL
CREATE DATABASE todo_db;
Update Configuration:

Navigate to src/main/resources/application.properties.

Ensure the spring.datasource.username and spring.datasource.password match your local MySQL credentials.

Build the Project:

In your terminal, navigate to the project root directory and run:

Bash
./mvnw clean install
Run the Application:

Start the application using:

Bash
./mvnw spring-boot:run
The server will start at http://localhost:8080.

📖 Usage
Access the main task list at http://localhost:8080/tasks.

Enter a task name in the input box and click Add to save it to the database.

Use the Toggle button to mark tasks as finished.

Click Delete to permanently remove a task.
