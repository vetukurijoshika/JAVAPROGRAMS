package Demoproject1;
import java.sql.*; 
import java.util.*; 

public class Jdbcdemomain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// to establish connection to the database and con is an object of Connection class, we are calling the method of Sqlconfig class
		Connection con = Sqlconfig.getCon(); 
		Scanner sc = new Scanner(System.in);
		// we are running a loop to insert 10 records into the table user1 
		for(int i=0;i<10;i++) {
			System.out.println("Enter the id of the user to add into the database"); 
			int idadd = sc.nextInt(); 
			sc.nextLine(); 
			System.out.println("Enter the name of the user to add into the database"); 
			String unameadd = sc.nextLine(); 
			System.out.println("Enter the password of the user to add into the database"); 
			String upasswordadd = sc.nextLine(); 
			//query to insert values into the table
			String query = "insert into user1 values(?,?,?)"; 
			//a statement is prepared which sends the query to the database and database runs the SQL query 
			//use PreparedStatement which allows for safer way of inserting sql queries, when we have dymanic values and also prevents sql injection 
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, idadd);
			ps.setString(2, unameadd);
			ps.setString(3,upasswordadd); 
			int j= ps.executeUpdate(); 
			if(j>0) {
				System.out.println("successfully inserted record"+" "+i); 
			}else {
				System.out.println("insertion not done at record"+" "+i);
			}
		}
		sc.close();
		//this is how you update a row in the table using executeUpdate()
		String query2 = "update user1 set upassword=? where id=9"; 
		PreparedStatement ps2 = con.prepareStatement(query2); 
		ps2.setString(1, "chris@2004");
		int k = ps2.executeUpdate(); 
		if(k>0) {
			System.out.println("updation done successfully"); 
		}else {
			System.out.println("updation not done"); 
		}
		
		// the below code shows how to traverse through the select query result which is stored inside the ResultSet and we can see the records using getters that appears on the console and to return a ResultSet we use executeQuery() method and it can only be used for select queries 
		String query3 = "select * from user1"; 
		PreparedStatement ps3 = con.prepareStatement(query3); 
		ResultSet rs = ps3.executeQuery(); 
		while(rs.next()) {
			System.out.println("user id: "+" "+rs.getInt(1)+"username: "+rs.getString(1)+"user password: "+" "+rs.getString(2));
		}
		//the below code shows how to update a row in the table inside the database 
		String query4 = "delete from user1 where id=9"; 
		PreparedStatement ps4 = con.prepareStatement(query4); 
		int l = ps4.executeUpdate(); 
		if(l>0) {
			System.out.println("deleted the row successfully"); 
		}else {
			System.out.println("deletion not done"); 
		}
		
		
		

	}

}


