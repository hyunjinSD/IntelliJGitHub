package Study;

public class Multiples {
    public static void main(String[] args) {

        //1000 아래의 3과 5의 배수의 합을 구하시오

        int sum = 0;
        for (int a = 1; a < 1000; a++) {
            if(a%3 == 0 || a%5 == 0 ) {
                sum += a;
            }
        }
        System.out.println("3과 5의 배수의 합 : " + sum);
    }
}
