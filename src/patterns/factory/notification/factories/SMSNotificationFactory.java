package patterns.factory.notification.factories;

import patterns.factory.notification.Notification;
import patterns.factory.notification.NotificationFactory;
import patterns.factory.notification.type.SMSNotification;

public class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
