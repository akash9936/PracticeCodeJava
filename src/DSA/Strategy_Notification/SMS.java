package src.DSA.Strategy_Notification;

public class  SMS implements NotificationStrategy{
    public void sendMessage(String msg){
        System.out.println("Sending message through SMS and message is "+msg);
    }
}
