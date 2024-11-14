package ch08.pub;


import ch08.sub.SubListener;

public interface PubListener {
    void add(SubListener sub);
    void notifyChange(String msg); //변화가 생겼을 때 알림 보내는 메서드
}
