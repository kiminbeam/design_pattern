package ch08.pub;


import ch08.sub.SubListener;

import java.util.ArrayList;
import java.util.List;

public class Pub implements PubListener {

    public String value = null;

    public void income(){
        value = "바나나";
    }

    //1. 구독자 명단
        List<SubListener> subList = new ArrayList<>();

    @Override
    public void add(SubListener sub) {
            subList.add(sub);
    }

    @Override
    public void notifyChange(String msg) {
        // 5초 잠자기
        for (int i = 1; i < 6; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(".");
        }
        //구독자들에게 알림주기
        for(SubListener sub: subList){
            sub.update(msg);
        }

    }
}
