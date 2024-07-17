package three;

public class OperatorMultipleDivision {
    public static void main(String[] args) {
        OperatorMultipleDivision sample = new OperatorMultipleDivision();
        sample.multipleDivision();

    }
    public void multipleDivision() {
        int intvalue1 = 5;
        int intvalue2 = 10;

        int result = intvalue1 * intvalue2;
        System.out.println(result);
        result = intvalue2 / intvalue1;
        System.out.println(result);
    }
}
