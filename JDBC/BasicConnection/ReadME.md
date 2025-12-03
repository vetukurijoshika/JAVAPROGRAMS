This BasicConnectivity folder will walk you through the steps in JDBC and also how to use insert,update,delete and select queries inside java code 
--JDBC MUST KNOWS-- 
1) Java Database Connectivity connects our java programs to the database and this is done by API'S and Drivers(converts java code to database understandable queries). Each database has it's own driver and depending upon our database type we have to install the Driver
2) The database software i am using is Mysql . For mysql install mysql connector
3) After installing the driver, extract the zip folder
4) In Eclipse, create a new java project and right click that. Click on build path> cofigure buildpath> libraries> classpath> add external JARs. Now add the sql connector jar file and click on Apply and Close
5) Now in mysql workbench(if you are using Mysql DBMS) create a database, set that database as default schema, and create a table
6) In Eclipse create a package and start writing JDBC related programs, try to do all manipulations the table and see whether the changes are seen inside the table 

