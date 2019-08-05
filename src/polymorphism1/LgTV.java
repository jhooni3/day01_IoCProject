package polymorphism1;

public class LgTV implements TV {   //상속
    public LgTV() {
        System.out.println(" ===> LgTV 생성");
    }
    @Override
    public void powerOn(){  //메소드 오버라이딩
        System.out.println(" ===> LgTV 전원 켜짐");

    }
    @Override
    public void powerOff(){
        System.out.println(" ===> LgTV 전원 꺼짐");

    }
    @Override
    public void volumeUp(){
        System.out.println(" ===> LgTV 볼륨 높이기");

    }
    @Override
    public void volumeDown(){
        System.out.println(" ===> LgTV 볼륨 낮추기");

    }
}
