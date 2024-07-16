package Seventeen;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //Target은 해당 어노테이션 사용 대상을 지정한다.
//여기서는 ElementType.METHOD를 소괄호 안에 넣어줌으로써 이 어노테이션은 메소드에 사용할 수 있다고 지정된 것이다

@Retention(RetentionPolicy.RUNTIME) // Retention은 어노테이션 유지 정보를 지정하는데 사용한다.
// 소괄호 안에 RetentionPolicy.RUNTIME으로 지정하면 실행시에 이 어노테이션을 참조하게 된다.

public @interface UserAnnotation { // 어노테이션 이름인 UserAnnitation 앞에는 @interface가 선언되어 있다.
    // 클래스나 인터페이스를 선언할 때 처럼 @interface로 선언하면 @UserAnnotation으로 어노테이션이 사용 가능해진다.

    public int number();
    public String text() default "this is first annotation";
}
/* 어노테이션 선언 안에는 number()라는 메소드와 text() 라는 메소드가 있다.
number()의 리턴 타입은 int이며 text()의 리턴 타입은 String이다 이렇게 메소드처럼 어노테이션 안에 선언해놓으면
이 어노테이션을 사용할 때 해당 항복에 대한 타입으로 값을 지정 가능하다
text()를 보면 default라는 예약어를 쓴 뒤 문자열이 지정되어 있는 것을 볼 수 있다.
default 예약어를 사용할 경우에는, default 뒤에 있는 값이 이 어노테이션을 사용할때의 기본값이 된다
즉, 값을 지정하지 않아도 default 값으로 지정된다.
 */


