package thirteen;

import twelve.MemberDTO;
//interface 내부에 선언된 메소드들은 몸통이 있으면 안된다.
//즉 메소드 선언 이후에 중괄호를 열고,닫거나, 중괄호 안에 한 줄의 코드도 있으면 안 된다.
//중괄호는 인터페이스 파일 선언을 위한 가장 상위의 중괄호만 있어야 한다고 생각하면 된다.

public interface MemberManager {
    public boolean addMember(MemberDTO member);

    public boolean removeMember(String name, String phone);

    public boolean updateMember(MemberDTO member);

}
