package Eight;

public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
        check.makeStaticBlockObjectWithData();
    }

    public void makeStaticBlockObject() {
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created block1");
        System.out.println("-------------------");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created block2");
    }

    public void makeStaticBlockObjectWithData() {
        System.out.println("data= " + StaticBlock.getData());
        StaticBlock block1 = new StaticBlock();
        block1.data = 1;
        System.out.println("--------------");
        StaticBlock block2 = new StaticBlock();
        block2.data = 2;
        System.out.println("data= " + StaticBlock.getData());
    }
}
//두 개의 StaticBlock 객체를 만들었지만 static 블록들은 한번씩만 호출되었다
//또 생성자가 호출되기 전에 static 블록들이 호출된 것을 볼 수 있다
//이와 같은 static 블록은 클래스를 초기화할 때 꼭 수행되어야 하는 작업이 있을 경우 유용하게 사용될 수 있다
//이처럼 static 블록은 생성자가 불리지 않더라도 클래스에 대한 참조가 발생하자마자 호출되는 것을 알 수 있다.