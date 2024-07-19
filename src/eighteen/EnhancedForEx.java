package eighteen;

public class EnhancedForEx {
    public static void main(String[] args) {
        String[] names = {"Kim", "Lee", "Park"};

        for (String name : names) {
            System.out.println("사용자 이름 : " + name);
        }
    }
}
/* Enhanced for문의 구조
   for (저장할 변수 선언 : 사용할 배열) {}
 */