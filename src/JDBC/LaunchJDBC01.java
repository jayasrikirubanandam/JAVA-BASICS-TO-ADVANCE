package JDBC;

import java.sql.*;


public class LaunchJDBC01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		 //load and register the drivers
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drivers are loaded");
		
		//establish connection
		String url= "jdbc:mysql://localhost:3306/mySql_Learning" ;
		String userName= "root";
		String password= "BeStrong23!";
		Connection connect =DriverManager.getConnection(url, userName, password);
		System.out.println("Connection has been established");
		
		//create a statement -> to carry the query to the DB
		Statement stmnt = connect.createStatement();
		System.out.println("Statement has been created");
		
		
		//execute query
		String query ="SELECT * from student_info";
		ResultSet rs =stmnt.executeQuery(query);
		
		
		System.out.println("StudID \tStudName \tStudAge \tStudGender");
		while(rs.next()) {
			System.out.println(rs.getInt(1) +"\t" +rs.getString(2)+"\t\t" +rs.getInt(3) +"\t\t" +rs.getString(4));
		}
		
		
		//this is just for checking purpose that multiple query can be run in one connection
		Statement stmnt1 = connect.createStatement();
		System.out.println("Statement1 has been created");
		
		//execute query
				String query1 = "INSERT into student_info(stud_id,stud_name,stud_age,stud_gender)"
						+"VALUES(10,'lia',2,'F')";
				int rs1 =stmnt.executeUpdate(query1);
				
				if(rs1 !=0) {
					System.out.println("check the DB");
				}else {
					System.out.println("Failed to insert");
				}
				
		//close all the resources
		rs.close();
		stmnt.close();
		connect.close();
		
		System.out.println("Connection closed");
		

	}

}
