package polymorphism1;

public class TVUser {
    public static void main(String[] args) {
        TV tv = new SamsungTV();    //형변환
        tv.powerOn();
        tv.volumeUp();
        tv.volumeDown();
        tv.powerOff();
    }
}
