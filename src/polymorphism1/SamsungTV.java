package polymorphism1;

public class SamsungTV implements TV{
    public SamsungTV() {
        System.out.println(" ===> SamsungTV 생성");
    }
    public void powerOn(){
        System.out.println(" ===> SamsungTV 전원 켜짐");

    }
    public void powerOff(){
        System.out.println(" ===> SamsungTV 전원 꺼짐");

    }
    public void volumeUp(){
        System.out.println(" ===> SamsungTV 볼륨 높이기");

    }
    public void volumeDown(){
        System.out.println(" ===> SamsungTV 볼륨 낮추기");

    }
}
