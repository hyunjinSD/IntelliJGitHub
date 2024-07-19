package eighteen;

public class ForEx {
    public static void main(String[] args) {
        int result = 0;

        // for(초기화; 조건식; 증감식)
        for (int i = 1; i <=10; i++) {
            result += i;
        }

        // 1~10의 합인 55 출력
        System.out.println(result);
    }
}
/* 초기화 : for 문이 시작될 수를 정하는 것으로, 반복할 변수의 초깃값을 설정한다.
   조건식 : 반복할지의 여부를 결정하는 곳이다. 조건식 안의 값이 true라면 실행문을, false라면 실행하지 않고
   반복문을 벗어난다.
   증감식 : 반복 횟수를 결정하는 곳이다. 변수에 값을 더하거나, 빼거나, 곱하는 등 수행 방식을 정한다.
 */
