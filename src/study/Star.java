package study;

public class Star {
    //오늘 자바 스크립트를 배우며 for 문을 써서
    //기억을 더듬을 겸 for 문을 다시 살펴보았다.

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++ ) {
            for(int j =0; j < i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
