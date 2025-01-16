# Student Database Retrieval

This is a simple Java program to retrieve and display student data from a MySQL database using JDBC.

## Features
- Connects to a MySQL database using JDBC.
- Retrieves all rows from the "students" table.
- Displays data in a clean, formatted way.

## Technologies Used
- **Java**
- **JDBC** (Java Database Connectivity)
- **MySQL**

## Prerequisites
- MySQL Database with a table named `students` containing the following columns:
  - `CMS_ID` (int): Student ID
  - `name` (varchar): Student name
  - `university` (varchar): University name
  - `UNI_FEEs` (double): University fees

- JDBC Driver (`com.mysql.cj.jdbc.Driver`) installed.
- Database connection details:
  - Host: `localhost`
  - Port: `3306`
  - Database: `students`
  - Username: `root`
  - Password: `root177`

## How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/<your-username>/Student-Database-Retrieval.git
Open the project in your favorite IDE (e.g., IntelliJ, Eclipse, VS Code).
Update the database connection details in the RetrieveData.java file if necessary.
Compile and run the program:
bash
Copy code
javac RetrieveData.java
java RetrieveData
