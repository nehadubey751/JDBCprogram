package Jdbcexample;
import java.sql.*;

public class preparedstatementexupdate {

	public static void main(String[] args) throws Exception{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		
	String query ="update emplyoee set first_name =?,last_name=?,email=? where employee_id =?" ;
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setString(1, "Manisha");
		ps.setString(2, "Dautpure");
		ps.setString(3, ",mani@gmail.com");
		ps.setInt(4, 1);
		
		int result = ps.executeUpdate();
		if(result<=1) 
			System.out.println("update successfully");
			else
				System.out.println(" not update successfully");
		
		con.close();
		}

}
