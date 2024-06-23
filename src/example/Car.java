package example;

public class Car {
//    speed -> 숫자
//    color -> 문자
//    distance -> 숫자

//     필드
    int speed;
    String color;
    int distance;

    public void speedUp() {
        this.speed = this.speed + 5;
    }

    public void breakDown(){
        this.speed = this.speed - 10;
    }

    public int getCurrentSpeed(){
        return this.speed;
    }

    public Car(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }

    public Car() {
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    public static void main(String[] args) {
//        new = 생성자 / 초기화
        Car newCar = new Car(50, "white");
        newCar.setDistance(1000);


    }
}
// 머가 문제라고 뜨는건지..