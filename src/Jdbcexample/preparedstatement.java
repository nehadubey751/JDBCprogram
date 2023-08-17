package Jdbcexample;
import java.sql.*;
public class preparedstatement {

	public static void main(String[] args)throws Exception {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		String query ="select * from emplyoee " ;
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet  rs= ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getString(3)+" ");
			System.out.println(rs.getString(4)+" ");
			
		}

	}

}
