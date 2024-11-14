package ch07;

import ch07.pub.Pub;
import ch07.pub.PubListener;
import ch07.sub.Sub1;
import ch07.sub.Sub2;
import ch07.sub.SubListener;

public class App {
    public static void main(String[] args) {
        // 1. 객체 생성 init
        PubListener pub = new Pub();

        SubListener s1 = new Sub1();
        SubListener s2 = new Sub2();

        //2. 구독
        pub.add(s1);
        pub.add(s2);

        //3. 상품 들어옴(가정)

        //4. notifyChange 호출
        pub.notifyChange("상품 들어왔습니다.");
    }
}
