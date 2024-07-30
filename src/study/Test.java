package study;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.println("나이 입력 : ");
        age = sc.nextInt();

        if(age >= 20)
        {
            System.out.println("성인");
        }
        else
        {
            System.out.println("미성년자");
        }
    }
}
