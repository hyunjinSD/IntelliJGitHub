package Three;

public class Car {
    int speed;

    int distance;

    String color;

    // 스피드,주행거리,색 넣는 법 물어보기
    public Car() {
    }

    public void speedUp() {
        speed = speed + 5;
    }

    public void breakDown() {
        speed = speed - 10;
    }

    public int getCurrentSpeed() {
        return speed;
    }
}
// 머가 문제라고 뜨는건지..