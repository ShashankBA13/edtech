
package com.edtech.student.signup.service.impl;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailVerification {

    public static void sendEmail(String emailAddress, String otp) {
        // use edtech email and app password
        final String username = "";
        final String password = "";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("shashank996419@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(emailAddress));
            message.setSubject("OTP for authentication");
            message.setText("Your OTP for authentication is: " + otp);

            Transport.send(message);
            System.out.println("OTP sent successfully");
            System.out.println(verify(otp));
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verify(String otp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the OTP: ");
        String enteredOtp = sc.nextLine();
        sc.close();
        return enteredOtp.equals(otp);
    }


//    public static void main(String[] args) {
//        sendEmail("shashank996419@gmail.com", "23569");
//    }
}

