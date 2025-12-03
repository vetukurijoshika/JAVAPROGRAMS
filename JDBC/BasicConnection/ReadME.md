BasicConnectivity – JDBC MUST KNOWS

This folder will walk you through the essential steps of JDBC (Java Database Connectivity) and demonstrate how to perform INSERT, UPDATE, DELETE, and SELECT operations from Java.

 What is JDBC?

JDBC (Java Database Connectivity) connects Java applications to databases.
It works using:

APIs → Java interface to work with DB

Drivers → Convert Java calls into SQL understandable by the database

Every database has its own driver.
Since we are using MySQL, we need the MySQL Connector/J driver.

 --SETUP AND REQUIREMENTS--
1)Install the MySQL JDBC Driver

2)Download MySQL Connector/J

3)Extract the ZIP file

4) Add Driver JAR to Eclipse

Right-click your Java project

Select Build Path > Configure Build Path

Go to Libraries tab

Click Add External JARs

Choose the MySQL Connector JAR file

Click Apply and Close

 --DATABASE SETUP(MySQL WORKBENCH)--

Open MySQL Workbench

Create a new database (schema)

Set it as default schema

Create a table inside it

This table will be used for JDBC operations

 --JAVA SETUP--

In Eclipse, create a new package

Write Java programs demonstrating:

Connecting to the database

Inserting records

Updating records

Deleting records

Selecting (reading) records

Run each program and confirm that:

The changes appear correctly in MySQL Workbench

Errors (if any) are fixed through debugging

--WHAT YOU WILL LEARN--

How Java communicates with databases

How to use JDBC classes:

DriverManager

Connection

PreparedStatement

ResultSet

How to perform all CRUD operations

How SQL and Java work together
