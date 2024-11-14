package ch03;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();

        OuterTiger outerTiger = new OuterTiger();
        TigerAdapter ta = new TigerAdapter(outerTiger);

        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        doorman.쫒아내(ta);
        doorman.쫒아내(cat);
        doorman.쫒아내(mouse);
    }
}
