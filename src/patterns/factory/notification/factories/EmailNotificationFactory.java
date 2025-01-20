package patterns.factory.notification.factories;

import patterns.factory.notification.Notification;
import patterns.factory.notification.NotificationFactory;
import patterns.factory.notification.type.EmailNotification;

public class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
