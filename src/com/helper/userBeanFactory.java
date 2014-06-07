package com.helper;
import java.sql.Date;

import com.model.userBean;
public class userBeanFactory {
public static userBean getUserBean(int userID,String email,String userName, String password, String firstName, String lastName, Date birthdate){
	userBean user=new userBean();
	user.setUserID(userID);
	user.setEmail(email);
	user.setUserName(userName);
	user.setPassword(password);
	user.setFirstName(firstName);
	user.setLastName(lastName);
	user.setBirthdate(birthdate);
	return user;
}

}
