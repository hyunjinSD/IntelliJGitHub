package Four;

public class ProfilePrint {
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;

    }
    public byte getAge() {
        return this.age;
    }
    public void setName(String name) {
        this.name = name;

    }
    public String getName() {
        return this.name;
    }
    public void setMarried(boolean flag) {
        this.isMarried = flag;


    }
    public boolean isMarried() {
        return this.isMarried;

    }

    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint();
        byte age = 29;
        String name = "hyunJin";
        boolean isMarried = false;

        profile.setAge(age);
        profile.setName(name);
        profile.setMarried(isMarried);

        System.out.println(profile.getAge());
        System.out.println(profile.getName());
        System.out.println(profile.isMarried());
    }

}
