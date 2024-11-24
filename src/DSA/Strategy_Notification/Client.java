package src.DSA.Strategy_Notification;

public class Client {
    public static void main(String args[]){
        NotificationContext smsNotification = new NotificationContext(new SMS());
        smsNotification.sendMessage("Hello");

        NotificationContext emailNotification = new NotificationContext(new Email());
        emailNotification.sendMessage("Akash");

    }
}
