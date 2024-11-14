package abc;

public class App {

    public static void start(Data a) {
        System.out.println(a.getId());
        System.out.println(a.getEmail());
        System.out.println(a.getAddr());
    }

    public static void main(String[] args) {
        A a = new A(1, "aaa@naver.com", "해운대구");
        B b = new B(2, "bbb@naver.com", "금정구");
        C c = new C(3, "CCC@naver.com", "부산진구");

        start(c);
    }
}
