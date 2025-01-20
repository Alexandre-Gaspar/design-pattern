package patterns.factory;

import patterns.factory.notification.NotificationFactory;
import patterns.factory.notification.factories.EmailNotificationFactory;
import patterns.factory.notification.factories.PushNotificationFactory;
import patterns.factory.notification.factories.SMSNotificationFactory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        NotificationFactory emailFactory = new EmailNotificationFactory();
        emailFactory.sendNotification();

        NotificationFactory smsFactory = new SMSNotificationFactory();
        smsFactory.sendNotification();

        NotificationFactory pushFactory = new PushNotificationFactory();
        pushFactory.sendNotification();
    }
}
