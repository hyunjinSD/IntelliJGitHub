package study;

public class Multiplication {

    public static void main(String[] args) {

        int i = 2;
        int j = 1;

        for(i = 2; i < 10; i++) {
            System.out.println(i + "단을 출력 합니다.");
            for(j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}
