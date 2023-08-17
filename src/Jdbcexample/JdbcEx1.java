package Jdbcexample;
import java.sql.*;
public class JdbcEx1 {
	public static void main(String[] args)  {
		try {
//			1.load the driver
			
		Class.forName("com.mysql.jdbc.Driver");
		
//		2.get connection
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
			
//		check connection done or not
	if(con!= null)
			System.out.println("connection Done");
	else
			System.out.println("not connected");
	
	Statement Statement =con.createStatement();
	int employee_id=4;
	
	String query="select * from emplyoee where employee_id =" +employee_id+ " ";
	ResultSet rs= Statement.executeQuery(query); //executequery in statement type
	
	while(rs.next()){
		System.out.println("employee_id =" +rs.getInt(1) + "   " +"first_name=" +rs.getString(2)+"   "+ "last_name=" + rs.getString(3)+"   " + "email="+rs.getString(4));
	}

	//close connection
	 con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
   
	}
}
