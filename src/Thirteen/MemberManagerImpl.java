package Thirteen;

import Twelve.MemberDTO;

public class MemberManagerImpl implements MemberManager {

    @Override
    public boolean removeMember (String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember (MemberDTO member) {
        return false;
    }

    @Override
    public boolean addMember (MemberDTO member) {
        return false;

    }
}
//@Override 는 우선 명시적으로 Override 했다는 것을 알려주는 표현
