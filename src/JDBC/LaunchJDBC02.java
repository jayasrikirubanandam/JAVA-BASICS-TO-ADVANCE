package JDBC;

import java.sql.*;

public class LaunchJDBC02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url= "jdbc:mysql://localhost:3306/mySql_Learning" ;
		String userName= "root";
		String password= "BeStrong23!";
		Connection connect = DriverManager.getConnection(url, userName, password);
		
		Statement stmnt = connect.createStatement();
		
		//String query = "UPDATE student_info SET stud_name ='srinath' where stud_id= 3";
		String query = "DELETE FROM student_info where stud_id = 7 ";
		int rowsAffected = stmnt.executeUpdate(query);
		
		if(rowsAffected !=0) {
			System.out.println("Updated successfully, check DB ");
		}
		else {
			System.out.println("failed to update");
		}
		
		stmnt.close();
		connect.close();
	}

}
