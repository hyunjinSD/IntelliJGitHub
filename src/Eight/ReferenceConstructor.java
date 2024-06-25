package Eight;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor reference = new ReferenceConstructor();
        reference.makeMemberObject();

    }
    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Hyunjin");
        MemberDTO dto3 = new MemberDTO("Hyunjin" , "010.8014.6554");
        MemberDTO dto4 = new MemberDTO("Hyunjin", "010.8014.6554", "hyunjin95@naver.com");

    }
}
