package eighteen;

public class WhileEx {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        while (i <= 10) {
            result += i;
            i++;
        }

        System.out.println(result);
    }
}
/* for문은 반복할 횟수를 알고 사용한다면, while문은 조건식이 true일 경우에 계쏙해서 반복한다.

 */