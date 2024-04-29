package Interface.Program2;

public class EmailNotificationSender implements EmailNotification{
    private String[] recipients;
    @Override
    public void setRecipients(String[] recipients) {
        this.recipients = recipients;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending email notification to: " + String.join(", ", recipients));
        System.out.println("Message: " + message);
    }
}
