package ch08.sub;

public class Sub2 implements SubListener {
    @Override
    public void update(String msg) {
        System.out.println("sub2가 받은 알림:" + msg);
        //무엇을 해야할지?
    }
}
