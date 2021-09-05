package Java.Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class connectToDataBase 
{	
	@Test
	public void connectDB() throws SQLException
	{
		String host="localhost";
		String port="3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QaDBT", "root", "admin");
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select name, id, age, location from employeeinfo");
		while (rs.next())
		{
			System.out.println(rs.getString("name")+" "+rs.getString("id")+" "+rs.getString("age")+" "+rs.getString("location"));
		}
		
		con.close();
		
	}

}
