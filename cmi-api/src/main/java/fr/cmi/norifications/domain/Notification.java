package fr.cmi.norifications.domain;

import java.util.Set;

public class Notification {
    private Set<String> recipients;
    private String type;
    private String subject;
    private String content;

    public Notification(Set<String> recipients, String type, String subject, String content) {
        this.recipients = recipients;
        this.type = type;
        this.subject = subject;
        this.content = content;
    }

    public Set<String> getRecipients() {
        return recipients;
    }

    public String getType() {
        return type;
    }

    public String getSubject() {
        return subject;
    }

    public String getContent() {
        return content;
    }
}
