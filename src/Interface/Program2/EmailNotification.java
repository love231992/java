package Interface.Program2;

public interface EmailNotification extends NotificationSender {
    void setRecipients(String[] recipients);
}
