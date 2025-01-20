package patterns.factory.notification.type;

import patterns.factory.notification.Notification;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification");
    }
}
