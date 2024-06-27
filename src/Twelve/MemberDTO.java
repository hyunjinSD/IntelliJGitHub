package Twelve;


public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {
        //아무 정보도 모를 때
    }

    public MemberDTO(String name) {
        //이름만 알 때
        this.name = name;

    }

    public MemberDTO(String name, String phone) {
        //이름과 전화번호만 알 때
        this.name = name;
        this.phone = phone;
    }

    public MemberDTO(String name, String phone, String email) {
        //모든 정보를 알고 있을 때
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public boolean equals(Object obj) {

        if (this == obj) return true; // 주소가 같으므로 당연히 true
        if (obj == null) return false; // obj가 null이므로 당연히 false
        if (getClass() != obj.getClass()) return false; // 클래스의 종류가 다르므로 false

        MemberDTO other = (MemberDTO) obj; // 같은 클래스이므로 형 변환 실행

        if (name == null) {  // name이 null일 때
            if (other.name != null) return false; // 비교 대상의 name이 null이 아니면 false
        } else if (!name.equals(other.name)) return false; // 두 개의 email 값이 다르면 fasle


        if (email == null) {
            if (other.email != null) return false;
        } else if (!email.equals(other.email)) return false;

        if (phone == null) {
            if (other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;

        // 모든 난관을 거쳐서 false를 리턴하지 않은 객체는 같은 값을 가지는 객체로 생각해서 true를 리턴한다
        return true;

    }

}
