package ch04;

public class App {
    public static void main(String[] args) {
        Doorman doorman = Doorman.instance;
        Doorman doorman2 = Doorman.instance;

        System.out.println(doorman.hashCode());
        System.out.println(doorman2.hashCode());


        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        doorman.쫒아내(cat);
        doorman.쫒아내(mouse);
    }
}
