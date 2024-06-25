package Eight;

public class ReferencePass {
    public static void main(String[] args) {
        ReferencePass reference = new ReferencePass();
        //reference.callPassByValue();
        reference.callpassByReference();

    }

    public void  callPassByValue() {
        int a = 10;
        String b = "b";
        System.out.println("before passByValue");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        passByValue(a,b);
        System.out.println("after passByValue");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public void passByValue(int a, String b) {
        a=20;
        b="z";
        System.out.println("in passByValue");
        System.out.println("a= " + a);
        System.out.println(("b= " + b));
    }

    public void callpassByReference() {
        MemberDTO member = new MemberDTO("Junho");
        System.out.println("before passByReference");
        System.out.println("member.name=" + member.name);
        passByReference(member);
        System.out.println("after passByReference");
        System.out.println("member.name=" + member.name);

    }

    public void passByReference(MemberDTO member) {
        member.name = "HyunJin";
        System.out.println("in passByReference");
        System.out.println("member.name=" + member.name);
    }
}

//"Pass by Value"라는 말은 값만 전달한다는 말이다.
//분신술처럼 내 몸의 모습을 복제하여 상대방이 어떤 것이 진짜 모습인지 모르게 하는 것이다.
//메소드의 매개 변수로 넘길 때에는 원래 값은 놔두고, 전달되는 값이 진짜인 것처럼 보이게 한다.
//그래서 매개 변수를 받은 메소드에서 그 값을 어떻게 하던간에 원래의 값은 변하지 않는다
//기본 자료형은 무조건 Pass by value로 데이터를 전달한다
//그리고 참조 자료형은 Pass by Reference로 데이터를 전달한다.
//int인 a 나 String인 b 는 기존 값이 변경되지 않는다.

//Pass by Reference
//매개 변수로 받은 참조 자료형 안에 있는 객체를 변경하면,
//호출한 참조 자료형 안에 있는 객체는 호출된 메소드에서 변경한 대로 데이터가 바뀐다
//이와 같이 값(value)이 아니라 객체에 대한 참조(Reference)가 넘어가는 것이다