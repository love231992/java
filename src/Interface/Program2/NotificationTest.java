package Interface.Program2;

public class NotificationTest {
    public static void main(String[] args) {
        EmailNotificationSender emailNotification = new EmailNotificationSender();
        emailNotification.setRecipients(new String[]{"recipient1@example.com", "recipient2@example.com"});
        emailNotification.sendNotification("hi, this is a test email........ !!");
        System.out.println("---------------------------------------------------------------------------------------");
        SMSNotificationSender smsNotificationSender = new SMSNotificationSender();
        smsNotificationSender.setPhoneNumbers(new String[]{"9876543210","72389273827"});
        smsNotificationSender.sendNotification("Test message from SMS Notification Sender ! ");
        System.out.println("----------------------------------------------------------------------------------------");
        PushNotificationSender pushNotificationSender = new PushNotificationSender();
        pushNotificationSender.sendNotification("Push notification testing.. !!");
    }
}

