<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="twitter4j.*"%>
<%@page import="twitter4j.auth.AccessToken" %>
<%@page import="java.io.*" %>
<%@page import="java.net.URL" %>
<%@page import="java.util.Arrays" %>


<!doctype html>
<html>
<head>
<meta charset="utf-8">

<title>Sprout</title>
</head>
<body>
<%
try{
//Your Twitter App's Consumer Key
String consumerKey = "NnXzxROpS8DCC6CnGZ4kwKxWK";

//Your Twitter App's Consumer Secret
String consumerSecret = "9ypB94SkI2ZGryAuiluNYmhjJkxDjJ6J5JHEv8jv4T7g5N00tq";

//Your Twitter Access Token
String accessToken = "353481166-Y1upkExzh5di9aLaQcVPIxF3olFyk5V1CvcNvfww";

//Your Twitter Access Token Secret
String accessTokenSecret = "XzlI5260AkNnxmADqCkzSjXS6FacTXNMyn3vMcrPoWAFJ";

//Instantiate a re-usable and thread-safe factory
TwitterFactory twitterFactory = new TwitterFactory();

//Instantiate a new Twitter instance
Twitter twitter = twitterFactory.getInstance();

//setup OAuth Consumer Credentials
twitter.setOAuthConsumer(consumerKey, consumerSecret);

//setup OAuth Access Token
twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

//Instantiate and initialize a new twitter status update
StatusUpdate statusUpdate = new StatusUpdate(
        //your tweet or status message
        "FIRST JSP TWEET POST" );
//attach any media, if you want to
statusUpdate.setMedia(
        //title of media
        "http://h1b-work-visa-usa.blogspot.com"
        , new URL("https://api.twitter.com/1.1/").openStream());

//tweet or update status
Status status = twitter.updateStatus(statusUpdate);
%>
<p>Status <%=status.toString() %></p>
<p>Status <%=status.getSource() %></p>
<p>Status <%=status.getText() %></p>
<% 
//response from twitter server
System.out.println("status.toString() = " + status.toString());
System.out.println("status.getInReplyToScreenName() = " + status.getInReplyToScreenName());
System.out.println("status.getSource() = " + status.getSource());
System.out.println("status.getText() = " + status.getText());
System.out.println("status.getContributors() = " + Arrays.toString(status.getContributors()));
System.out.println("status.getCreatedAt() = " + status.getCreatedAt());
System.out.println("status.getCurrentUserRetweetId() = " + status.getCurrentUserRetweetId());
System.out.println("status.getGeoLocation() = " + status.getGeoLocation());
System.out.println("status.getId() = " + status.getId());
System.out.println("status.getInReplyToStatusId() = " + status.getInReplyToStatusId());
System.out.println("status.getInReplyToUserId() = " + status.getInReplyToUserId());
System.out.println("status.getPlace() = " + status.getPlace());
System.out.println("status.getRetweetCount() = " + status.getRetweetCount());
System.out.println("status.getRetweetedStatus() = " + status.getRetweetedStatus());
System.out.println("status.getUser() = " + status.getUser());
System.out.println("status.getAccessLevel() = " + status.getAccessLevel());
System.out.println("status.getHashtagEntities() = " + Arrays.toString(status.getHashtagEntities()));
System.out.println("status.getMediaEntities() = " + Arrays.toString(status.getMediaEntities()));
if(status.getRateLimitStatus() != null)
{
    System.out.println("status.getRateLimitStatus().getLimit() = " + status.getRateLimitStatus().getLimit());
    System.out.println("status.getRateLimitStatus().getRemaining() = " + status.getRateLimitStatus().getRemaining());
    System.out.println("status.getRateLimitStatus().getResetTimeInSeconds() = " + status.getRateLimitStatus().getResetTimeInSeconds());
    System.out.println("status.getRateLimitStatus().getSecondsUntilReset() = " + status.getRateLimitStatus().getSecondsUntilReset());
    //System.out.println("status.getRateLimitStatus().getRemainingHits() = " + status.getRateLimitStatus().getRemainingHits());
}
System.out.println("status.getURLEntities() = " + Arrays.toString(status.getURLEntities()));
System.out.println("status.getUserMentionEntities() = " + Arrays.toString(status.getUserMentionEntities()));

}catch(Exception e){
	
}

%>
</body>
</html>