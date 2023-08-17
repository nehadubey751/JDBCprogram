package Jdbcexample;
import java.sql.*;

public class preparedstatementex1 {

	public static void main(String[] args) throws Exception {

//		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
//
//		String query ="insert into emplyoee(employee_id,first_name,last_name,email) values (?,?,?,?)";
//				
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, 15);
//		ps.setString(2, "ABCD");
//		ps.setString(3, "PQRS");
//		ps.setString(4, "PRS@gmail.com");
//		
//		ps.execute();
//		if(ps != null)
//			System.out.println("insert sucessfully");
//		else
//			System.out.println(" not insert sucessfully");
		
		int employee_id =15;
		String query ="select * from emplyoee where employee_id =?";
		PreparedStatement ps = con.prepareStatement(query);
	    ps.setInt(1, employee_id);
	    ResultSet  rs= ps.executeQuery();
	    
	    while(rs.next()) {
	    	System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
	    	
	    }

			con.close();
		
		
	}

}
