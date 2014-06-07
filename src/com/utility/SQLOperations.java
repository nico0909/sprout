package com.utility;


import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.model.*;
import com.utility.SQLCommands;


public class SQLOperations implements SQLCommands{
	public static ResultSet login(String userName,String password,Connection connection){
		ResultSet rs=null;
	
		try{
			PreparedStatement pstmt=connection.prepareStatement(login);
		
			pstmt.setString(1, userName);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			if(rs.wasNull()){
				System.out.println("Result Set was not null Login Failed");
				
			}else{
				System.out.println("Login Successfull");
				
				return rs;
			}
		}catch(SQLException e){
			System.out.println("SQL Exception "+e.getMessage());
		}
		return rs;
	}
	public static boolean user_register(String email,String userName,String password,String firstName, String lastName, java.util.Date birthdate,Connection connection){
		try{
			java.sql.Date savedbdate = new java.sql.Date(birthdate.getTime());
			connection.setAutoCommit(false);
			PreparedStatement pstmt=connection.prepareStatement(user_register);
			pstmt.setString(1,email);
			pstmt.setString(2,userName);
			pstmt.setString(3,password);
			pstmt.setString(4,firstName);
			pstmt.setString(5,lastName);
			pstmt.setDate(6,savedbdate);
		
			
			pstmt.executeUpdate();
			connection.commit();
			
		}catch(SQLException e){
			System.out.println("SQL Exception "+e.getMessage());
			try {
				connection.rollback();
				} catch (SQLException sql) {
					System.err.println("Error on Update Connection Rollback - " + sql.getMessage());
				}
			return false;
			
		}
		return true;
	}

}



