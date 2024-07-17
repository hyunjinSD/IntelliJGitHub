package thirteen;

public class FinalVariable {
    final int instanceVariable=1;
    //변수 생성과 동시에 초기화를 해야한다. 지역 변수를 선언해서 사용하면 된다.

    public void method (final int parameter) {
        final int localVariable;
    }
}
