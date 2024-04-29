package Interface.Program2;

class PushNotificationSender implements PushNotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Sending push notification");
        System.out.println("Message: " + message);
    }
}