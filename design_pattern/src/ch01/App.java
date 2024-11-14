package ch01;

import ch02.Doormanproxy;

public class App {
    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();

        doorman.쫒아내(cat);
        doorman.쫒아내(mouse);
    }
}
