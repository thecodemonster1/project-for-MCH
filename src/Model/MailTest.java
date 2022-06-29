package Model;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

/**
 *
 * @author theCodeMonster
 */
public class MailTest {

    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();

    private final String USER_NAME = "it21730160@gmail.com";   //User name of the Goole(gmail) account
    private final String PASSSWORD = "oduu dtqo jgod gedu";  //Password of the Goole(gmail) account
    private final String FROM_ADDRESS = "it21730160@gmail.com";  //From addresss

    public MailTest() {
    }

    public static void main(String[] args) {
        MailTest email = new MailTest();
        //Sending test email
        email.createAndSendEmail("it21730160@gmail.com", "Test email subject",
                "<h1>This mail is from my java project</h1>"
                        + "");
    }

    public void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }

    private void sendEmailMessage() {

        //Create email sending properties
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USER_NAME, PASSSWORD);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(FROM_ADDRESS)); //Set from address of the email
            message.setContent(msgText, "text/html"); //set content type of the email

            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("amharazwar777@gmail.com")); //Set email recipient

            message.setSubject("Hello World"); //Set email message subject
            Transport.send(message); //Send email message

            System.out.println("sent email successfully!");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void setEmailAddressTo(String emailAddressTo) {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject) {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText) {
        this.msgText = msgText;
    }

}
