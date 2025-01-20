package patterns.factory.notification.type;

import patterns.factory.notification.Notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}
