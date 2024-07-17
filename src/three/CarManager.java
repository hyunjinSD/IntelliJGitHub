package three;

public class CarManager {
    public static void main(String args[]) {
        Car HyeonjinCar=new Car();
        HyeonjinCar.speedUp();
        HyeonjinCar.speedUp();
        System.out.println(HyeonjinCar.getCurrentSpeed());
        HyeonjinCar.breakDown();
        System.out.println(HyeonjinCar.getCurrentSpeed());
    }
}
/* Car를 두개 만들고 각각 다른 매개채로 차번호를 등록해야한다면 어디에 적어야 하는지
저기 new car 뒤에 소괄호에 적어야 하나? 이걸 매개 변수라고 하는건가?.. */