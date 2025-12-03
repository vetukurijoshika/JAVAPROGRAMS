package Demoproject1;
import java.sql.*; 
import java.util.*; 

public class Jdbcdemomain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection con = Sqlconfig.getCon(); 
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<10;i++) {
//			System.out.println("Enter the id of the user to add into the database"); 
//			int idadd = sc.nextInt(); 
//			sc.nextLine(); 
//			System.out.println("Enter the name of the user to add into the database"); 
//			String unameadd = sc.nextLine(); 
//			System.out.println("Enter the password of the user to add into the database"); 
//			String upasswordadd = sc.nextLine(); 
//			String query = "insert into user1 values(?,?,?)"; 
//			PreparedStatement ps = con.prepareStatement(query);
//			ps.setInt(1, idadd);
//			ps.setString(2, unameadd);
//			ps.setString(3,upasswordadd); 
//			int j= ps.executeUpdate(); 
//			if(j>0) {
//				System.out.println("successfully inserted record"+" "+i); 
//			}else {
//				System.out.println("insertion not done at record"+" "+i);
//			}
//		}
//		sc.close();
		/*String query2 = "update user1 set upassword=? where id=9"; 
		PreparedStatement ps2 = con.prepareStatement(query2); 
		ps2.setString(1, "chris@2004");
		int k = ps2.executeUpdate(); 
		if(k>0) {
			System.out.println("updation done successfully"); 
		}else {
			System.out.println("updation not done"); 
		}*/ 
		
		/*String query3 = "select * from user1"; 
		PreparedStatement ps3 = con.prepareStatement(query3); 
		ResultSet rs = ps3.executeQuery(); 
		while(rs.next()) {
			System.out.println("user id: "+" "+rs.getInt(1)+"username: "+rs.getString(1)+"user password: "+" "+rs.getString(2));
		}*/ 
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
