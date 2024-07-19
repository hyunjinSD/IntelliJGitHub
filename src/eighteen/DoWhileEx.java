package eighteen;

public class DoWhileEx {
    public static void main(String[] args) {
        int i = 1;
        int result = 0;

        do{
            result += i;
            i += 1;
        }while (i <= 10);

        System.out.println(result);
    }
}
/* while문은 조건식을 검사하고 난 뒤에 실행문을 결정하는 반면, do-while문은 우선 실행을 시키고 난 뒤,
   조건식을 통해 계속 반복할지를 결정한다.
 */