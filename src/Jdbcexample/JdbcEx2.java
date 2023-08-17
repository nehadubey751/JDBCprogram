package Jdbcexample;
import java.sql.*;
public class JdbcEx2 {

	public static void main(String[] args) throws Exception {
  
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","root");
		
		Statement st=con.createStatement();
		String query = "Insert INTO emplyoee (employee_id,first_name,last_name,email) VALUES  (11,'swati','khadu','swati@gmail.com')";
         boolean result =st.execute(query);  //execute in statement type.
		System.out.println(result);
		
		
		
		con.close();

	}

}
