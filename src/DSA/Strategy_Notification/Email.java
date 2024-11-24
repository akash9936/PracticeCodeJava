package src.DSA.Strategy_Notification;

public class Email implements NotificationStrategy{
    @Override
    public void sendMessage(String msg){
        System.out.println("Sending message through Email and message is "+msg);
    }
}
