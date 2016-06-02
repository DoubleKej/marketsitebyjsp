package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnector {
	
	public static boolean ConnDB(String username, String pass){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		Connection conn = null;
		Statement stm = null;
		ResultSet rs = null;
		boolean tmp = false;
		
		try {
			conn = DriverManager.getConnection("jdbc:sql://localhost:3306/bigexercise", "", "");
			stm = conn.createStatement();
			rs = stm.executeQuery("SELECT * FROM user WHERE username = '"
			+username+"' AND pass = '"+pass+"'");
			tmp = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tmp;
	}
	
}
