package ch04;

//SRP -> Single Responsibility Principle 단일 책임
//책임을 하나만 가지는 것은 좋은 것
public class Doorman {
    //static 으로 인해 메인 실행전에 Doorman을 띄워 놓을 수 있다.
    //private Doorman() {}

    //SRP -> single responsibilty principle
    static Doorman instance = new Doorman();

    private Doorman() {

    }

    //해당 클래스의 책임
    //DIP -> Dependency Inversion Principle 의존성 역전
    public void 쫒아내(Animal animal){
        System.out.println(animal.getName() + " 쫒아내");
    }
}
