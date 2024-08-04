package study;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        int num1 = 0;
        int a = 0;

        num1 = rd.nextInt(99)+1;

        while(true) {
            System.out.println("1~100사이의 숫자 맞추기 : ");
            a = scanner.nextInt();
            if(num1 == a) {
                System.out.println("정답");
                break;
            }
            if(num1<a) {
                System.out.println("더 작은수를 입력하세요");
            }else {
                System.out.println("더 큰수를 입력하세요");
            }
        }
    }
}
