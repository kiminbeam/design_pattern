package ch08.sub;

public class Sub1 implements SubListener {
    @Override
    public void update(String msg) {
        System.out.println("sub1이 받은 알림:" + msg);
        //무엇을 해야할지?
    }
}
