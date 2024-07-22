package study;

import java.util.Scanner;

public class Pokemon2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        // 설계도를 사용할 공간
        Pokemon pika = new Pokemon("피카츄", "전기", "백만볼트", 30, 200);
        Pokemon kkobuk = new Pokemon("꼬부기", "물", "물대포", 35, 300);

        System.out.println("[1] 피카츄 [2] 파이리");
        int select1 = sc.nextInt();
        if (select1 == 1) {
            i = 1;
        } else {
            i = 2;
        }
        while (true) {
            System.out.println("[1] 일반 공격 [2] 스킬 공격");
            int select2 = sc.nextInt();

            if(pika.getHP() <= 0 || kkobuk.getHP() <= 0) {
                break;
            }
            if (i == 1) {
                if(select2 == 1) {
                    System.out.println("피카츄 공격");
                    kkobuk.setHp(kkobuk.getHP()-pika.getAtk());
                    System.out.println("꼬부기의 남은 체력 : " + kkobuk.getHP());
                    i++;
                    continue;
                }
                if (select2 == 2) {
                    System.out.println(pika.getSkill());
                    kkobuk.setHp(kkobuk.getHP()-pika.getAtk()*2);
                    System.out.println("꼬부기의 남은 체력 : " + kkobuk.getHP());
                    i--;
                    continue;
                }
            }
            System.out.println("=======================");
        }
        if (pika.getHP() <= 0 ) {
            System.out.println("꼬부기가 승리했다!!");
        }
        if (kkobuk.getHP() <= 0) {
            System.out.println("피카츄가 승리했다!!");
        }
    }
}
