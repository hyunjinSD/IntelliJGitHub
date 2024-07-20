package eighteen;

public class TryCatchFinally {
    public static void main(String[] args) {

        int num1 = 10, num2 = 1;
        double array[] = new double[10];

        try //에러를 감지하는 역할
        {
            array[11] = num1/num2;
        }
        // 에러를 감지했다면 catch로 넘겨서 예외처리를 해주게 된다.
        catch(ArithmeticException e)
        {
            System.out.println("0으로 나눗셈을 하면 안됩니다.");
            System.out.println("에러내용 : " + e.toString());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("배열의 길이를 벗어났습니다.");
            System.out.println("에러 내용 : " + e.toString());
        }
        finally // 에러가 발생하거나 안하거나 반드시 실행해야 하는 부분
        {
            System.out.println("여기는 반드시 실행해야 하는 부분입니다.");
        }
    }
}
