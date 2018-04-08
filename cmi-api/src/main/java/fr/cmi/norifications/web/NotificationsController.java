package fr.cmi.norifications.web;

import fr.cmi.norifications.domain.Notification;
import fr.cmi.norifications.domain.mail.MailNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "https://localhost:4200")
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
