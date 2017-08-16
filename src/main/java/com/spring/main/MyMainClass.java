package com.spring.main;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				MyConfiguration.class);
		MyService service = ctx.getBean(MyService.class);
		
		service.log("Logging method call");
		
		MyService newService = ctx.getBean(MyService.class);		
		ctx.close();
		
	    /*
	      // Recipient's email ID needs to be mentioned.
	      String to = "baskar_kumarasamy@homedepot.com";

	      // Sender's email ID needs to be mentioned
	      String from = "baskar_kumarasamy@homedepot.com";

	      // Assuming you are sending email from localhost
	      String host = "localhost";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail1.homedepot.com", host);

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try {
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
  */	   
	}

}
