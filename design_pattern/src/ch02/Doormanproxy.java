package ch02;

public class Doormanproxy {

    private Doorman doorman;

    public Doormanproxy(Doorman doorman) {
        this.doorman = doorman;
    }

    public void 쫒아내(Animal animal) {
        hello();
        doorman.쫒아내(animal);
    }

    private void hello() {
        System.out.println("안녕");
    }

    /*
    public void hello(Animal animal){
        System.out.println("안녕");
        doorman.쫒아내(animal);
    }

    public Animal hello(Animal animal) {
        System.out.println("안녕");
        return animal;
    }
     */
}
