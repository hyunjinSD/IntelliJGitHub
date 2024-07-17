package eight;

public class ReferenceReturn {
    public static void main(String [] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }

    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }

    public int[] intArrayReturn() {
        int returnArray[] = new int[10];
        return returnArray;
    }

    public String stringReturn() {
        String returnString = "Return value";
        return returnString;
    }
}
//각 메소드에서는 계산 작업이나 데이터 처리를 거친 후에 리턴을 해주어야 하지만
//일단 초기화만 한 후 리턴해 주었다.
//1.메소드 이름 앞에 변수의 타입을 지정해주고,
//2.메소드 내에서는 그 타입을 생성하고 가공한 후
//3."return"이라는 예약어를 사용하여 리턴해주면
//4.요청한 메소드로 그 값이 전달된다