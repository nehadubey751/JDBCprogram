package Jdbcexample;

import java.sql.*;
public class jdbcex1update {

	public static void main(String[] args) throws Exception {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		String query="update emplyoee set first_name='xywz' where employee_id=1";
		
		Statement st=con.createStatement();
		int result =st.executeUpdate(query);
		System.out.println(result);
		
		con.close();


	}

}
