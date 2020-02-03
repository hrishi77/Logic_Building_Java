//JDBC.java

//step 1
import java.sql.*;
import java.io.*;

public class JDBC
{
	public static void main(String arg[]) throws SQLException
	{
        	String url="jdbc:mysql://localhost:3306/Marvellous";
		String uname="root";
		String pass="";//blank for password

		String cmd = "select *from Student";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try
		{	//step 2
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class Loaded Sucessfully");
			
			//step 3
			con = DriverManager.getConnection(url,uname,pass);
			System.out.println("Connection established");
			

			//step 4
			stmt = con.createStatement();
			System.out.println("Statement Object Created Sucessfully");
			
			//step 5
			rs = stmt.executeQuery(cmd);
			System.out.println("Query execute sucessfully");

			//step 6
			System.out.println("Data from Student table");
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.println(rs.getString(3));
			}

		}//End Of Try
		catch(Exception e)
		{
			 System.out.println("Exception Occured");
			 System.out.println(e);
			// System.out.println(e.printStackTrace());
			 e.printStackTrace();
		}
		finally
		{
			rs.close();
			stmt.close();
			con.close();
		}
	}
}
	




			

				

