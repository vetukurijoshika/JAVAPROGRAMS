package Demoproject1;
import java.sql.*; 

public class Sqlconfig {
	static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	static String DB_URL = "jdbc:mysql://localhost:3306/Userinfo";
	static  String DB_USERNAME = "root";
	static String DB_PASSWORD = "Joshika@#04";
	
	static Connection getCon() throws Exception{
		Class.forName(DB_DRIVER);
		Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD); 
		if(con!=null) {
			System.out.println("connection done successfully"); 
		}else {
			System.out.println("connection not done"); 
		}
		return con; 
	}
}
