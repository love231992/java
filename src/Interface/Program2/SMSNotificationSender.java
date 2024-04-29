package Interface.Program2;

public class SMSNotificationSender implements SmsNotification {
    private String[] phoneNumbers;

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS notification to: " + String.join(", ", phoneNumbers));
        System.out.println("Message: " + message);
    }

    @Override
    public void setPhoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;

    }
}
