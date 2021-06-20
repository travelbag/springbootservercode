package com.iqube.config;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
//import javax.activation.*;

public class SendEmail {

   public static void main(String [] args) {
      // Recipient's email ID needs to be mentioned.
      String to = "venkatesh.rtp@gmail.com";

      // Sender's email ID needs to be mentioned
      String from = "venkatesh.srst@gmail.com";

      String pass ="choutuppal12";
     // Recipient's email ID needs to be mentioned.

    String host = "smtp.gmail.com";

    // Get system properties
    Properties properties = System.getProperties();
    // Setup mail server
    properties.put("mail.smtp.starttls.enable", "true");
    properties.put("mail.smtp.host", host);
//    properties.put("mail.smtp.user", from);
//    properties.put("mail.smtp.password", pass);
    properties.put("mail.smtp.port", "587");
    properties.put("mail.smtp.auth", "true");


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

         // Send the actual HTML message, as big as you like
         message.setContent("<h1>This is actual message</h1>", "text/html");

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      } catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}