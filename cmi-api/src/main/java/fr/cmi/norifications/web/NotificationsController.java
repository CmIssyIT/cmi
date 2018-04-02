package fr.cmi.norifications.web;

import fr.cmi.norifications.domain.Notification;
import fr.cmi.norifications.domain.mail.MailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/notifications")
public class NotificationsController {

    @Autowired
    private MailNotificationService notificationService;

    @PostMapping
    public ResponseEntity<?> sendNotifications(@Valid @RequestBody Notification notification) {
         notificationService.sendSimpleMessage(notification);
        return ResponseEntity.accepted().build();
    }

}
