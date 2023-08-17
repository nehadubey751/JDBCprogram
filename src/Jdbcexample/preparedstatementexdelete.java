package Jdbcexample;
import java.sql.*;
public class preparedstatementexdelete {

	public static void main(String[] args)throws Exception  {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		String query ="delete from emplyoee where employee_id =?" ;
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, 1);
		int result = ps.executeUpdate();
		if(result<=1) 
			System.out.println("update successfully");
			else
				System.out.println(" not update successfully");
		
		con.close();



	}

}
