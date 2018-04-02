package fr.cmi.norifications.domain.mail;

import fr.cmi.norifications.domain.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailNotificationService {

    private final static Logger logger = LoggerFactory.getLogger(MailNotificationService.class);

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(final Notification notification) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(notification.getRecipients().toArray(new String[notification.getRecipients().size()]));
            message.setSubject(notification.getSubject());
            message.setText(notification.getContent());
            emailSender.send(message);
        } catch (MailException exception) {
            logger.error("An error occured while sending email", exception);
        }
    }


}
