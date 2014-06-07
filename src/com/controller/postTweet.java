package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.*;
/**
 * Servlet implementation class postTweet
 */
@WebServlet("/tweet.html")
public class postTweet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ConfigurationBuilder cb = new ConfigurationBuilder();

			cb.setDebugEnabled(true)
						.setOAuthConsumerKey("py6RtARRgUlMMJDz1F9gpMXMQ")
						.setOAuthConsumerSecret("rnfiW0njfsuIEUfhUx1Jf5pO4vqAiqrSHxBRH81Fh3RCcXhays")
						.setOAuthAccessToken("353481166-16ltq1T6NT43CQINtHhiAFlEo1FmxZbcM3hJKeW7")
						.setOAuthAccessTokenSecret("XooYgnnqhPRC5qjIev8apKhw4RfG0Jff6ZMc7gla4AzUM");

			TwitterFactory tf = new TwitterFactory(cb.build());

			Twitter twitter = tf.getInstance();

			StatusUpdate status = new StatusUpdate("Hello World Java API sample Post HAHAHAHA");
			twitter.updateStatus(status);

	        

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
