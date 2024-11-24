package src.DSA.Strategy_Notification;

public class NotificationContext {
    private NotificationStrategy notificationStrategy;
    public NotificationContext(NotificationStrategy notificationStrategy){
        this.notificationStrategy=notificationStrategy;
    }
    public void SetNotificationContext(NotificationStrategy notificationStrategy){
        this.notificationStrategy=notificationStrategy;
    }
    public void sendMessage(String msg){
        notificationStrategy.sendMessage(msg);
    }


}
