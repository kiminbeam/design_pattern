package ch06;

import abc.B;
import ch06.notification.BasicNotifier;
import ch06.notification.EmailNotifier;
import ch06.notification.Notifier;
import ch06.notification.SmsNotifier;

public class App {

    public static void 알림(Notifier notifier) {
        notifier.send();
    }

    // 데코레이션 패턴 : 기능 확장 (핵심)
    public static void main(String[] args) {
        //1. 전체 알림 (기본알림 -> 문자알림 -> 이메일알림)
        Notifier n1 = new EmailNotifier(new SmsNotifier(new BasicNotifier()));
        알림(n1);
        System.out.println("===================");

        //2. 전체 알림(기본알림 -> 이메일알림 -> 문자알림)
        Notifier n2 = new SmsNotifier(new EmailNotifier(new BasicNotifier()));
        알림(n2);
        System.out.println("===================");

        //3. 기본알림
        Notifier n3 = new BasicNotifier();
        알림(n3);
        System.out.println("===================");

        //4. 기본알림 + 문자 알림
        Notifier n4 = new SmsNotifier(new BasicNotifier());
        알림(n4);
        System.out.println("===================");

        //5. 기본알림 + 이메일알림
        Notifier n5 = new EmailNotifier(new BasicNotifier());
        알림(n5);
        System.out.println("===================");

        //6. 이메일 알림
        Notifier n6 = new EmailNotifier();
        알림(n6);
        System.out.println("===================");

        //7. 문자 알림
        Notifier n7 = new SmsNotifier();
        알림(n7);
        System.out.println("===================");

        //8. 문자 알림 + 이메일알림
        Notifier n8 = new EmailNotifier(new SmsNotifier());
        알림(n8);
        System.out.println("==================");

    }
}
