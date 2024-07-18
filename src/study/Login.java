package study;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "Hello";
        String pass = "1234";

        while(true) {
            System.out.println("id 입력 : ");
            String id2 = sc.next();
            System.out.println("pass 입력 : ");
            String pass2 = sc.next();
            if(id.equals(id2)) {
                if(pass.equals(pass2)) {
                    System.out.println("로그인");
                    break;
                }else {
                    System.out.println("아이디와 비밀번호를 잘못되었습니다.");
                }
            }else {
                System.out.println("아이디와 비밀번호가 잘못되었습니다");
            }
        }
    }
}
