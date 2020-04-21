package main.java.copas;

import java.util.Date;

public class Notificacao {
    private int id;
    private String notification;
    private String message;
    private Date scheduling;
    private String recipientName;
    private String schedulingStatus;
    private String mailerName;
    private Date senderAt;

    public Notificacao() {
    }

    public Notificacao(int id, String notification, String message, Date scheduling, String recipientName,
            String schedulingStatus, String mailerName, Date senderAt) {
        this.setId(id);
        this.setNotification(notification);
        this.setMessage(message);
        this.setScheduling(scheduling);
        this.setRecipientName(recipientName);
        this.setSchedulingStatus(schedulingStatus);
        this.setMailerName(mailerName);
        this.setSenderAt(senderAt);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotification() {
        return this.notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getScheduling() {
        return this.scheduling;
    }

    public void setScheduling(Date scheduling) {
        this.scheduling = scheduling;
    }

    public String getRecipientName() {
        return this.recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getSchedulingStatus() {
        return this.schedulingStatus;
    }

    public void setSchedulingStatus(String schedulingStatus) {
        this.schedulingStatus = schedulingStatus;
    }

    public String getMailerName() {
        return this.mailerName;
    }

    public void setMailerName(String mailerName) {
        this.mailerName = mailerName;
    }

    public Date getSenderAt() {
        return this.senderAt;
    }

    public void setSenderAt(Date senderAt) {
        this.senderAt = senderAt;
    }

}