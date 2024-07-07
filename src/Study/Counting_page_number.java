package Study;

public class Counting_page_number {
    public static void main(String []args) {

        int a = 74896; // 총 게시물 건수
        int b = 13; //한 페이지 게시물 수

        int quotient = a/b;
        int remainder = a%b;

        int quotientPlusOne = quotient + 1;

        System.out.println("총 게시물 수는 " + a + "입니다.");
        System.out.println("한 페이지의 게시물 수는 " + b + "입니다");
        if (remainder == 0) {
            System.out.println("총 페이지 수는 " + quotient);
        } else {
            System.out.println("총 페이지 수는 " + quotientPlusOne + "입니다");
        }
    }
}
