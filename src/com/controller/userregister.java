package com.controller;

import java.io.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import javax.sql.*;
import javax.naming.*;

import com.helper.*;
import com.model.*;
import com.utility.SQLOperations;
/**
 * Servlet implementation class userregister
 */
@WebServlet("/register.html")
public class userregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	public void init() throws ServletException {
		if(getServletContext().getAttribute("dbConnection") == null){
			try{
			InitialContext context = new InitialContext();
			DataSource datasource = (DataSource)
					context.lookup("java:comp/env/jdbc/sprout_db");
			connection = datasource.getConnection();
			getServletContext().setAttribute("dbConnection", connection);
			System.out.println("Connection Successfull");
			}catch(NamingException e){
				e.printStackTrace();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}else{
			connection = (Connection) getServletContext().getAttribute("dbConnection");
			System.out.println("Connection Successfull");
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			
			String email=request.getParameter("email");
			String userName=request.getParameter("userName");
			String password=request.getParameter("password");
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			SimpleDateFormat format=new SimpleDateFormat("yyyy-mm-dd");
			java.util.Date birthdate= new java.util.Date();
			birthdate=format.parse(request.getParameter("birthdate"));
			
		
			
			if(SQLOperations.user_register(email, userName, password, firstName, lastName,birthdate, connection)){
				//success
				getServletContext().setAttribute("dbConnection", connection);
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}else{
				
				//fail
				getServletContext().setAttribute("dbConnection", connection);
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}
			
			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	}


