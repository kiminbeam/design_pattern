package ch03;

//TigerAdapter를 animal로 부를 수 있게 해야한다

//OuterTiger 와 Cat, Mouse 등과의 이질적인 것을 동일하게 맞추는 역할
//has *****
public class TigerAdapter extends Animal{

    //private Animal an;
    private OuterTiger outerTiger;
    
    // 컴퍼지션
    public TigerAdapter(OuterTiger outerTiger) {
          this.outerTiger = outerTiger;
    }


    public String getName() {
        return outerTiger.getFullname();
    }
}
