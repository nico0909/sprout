package com.utility;

public interface SQLCommands {
	String login="Select * from users Where userName=? AND password= ?";
	String user_register="INSERT INTO users(email,userName,password,firstName,lastName,birthdate) VALUES (?,?,?,?,?,?)";
}
