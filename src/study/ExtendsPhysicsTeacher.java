package study;

public class ExtendsPhysicsTeacher extends ExtendsTeacher{
    String mainSubject = "Physics";
    public static void main(String[] args) {
        ExtendsPhysicsTeacher obj = new ExtendsPhysicsTeacher();
        System.out.println(obj.collegeName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}
