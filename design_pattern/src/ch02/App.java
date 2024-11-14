package ch02;

public class App {
    public static void main(String[] args) {

        Doorman doorman = new Doorman();
        Doormanproxy proxy = new Doormanproxy(doorman);
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        proxy.쫒아내(cat);

    }
}
