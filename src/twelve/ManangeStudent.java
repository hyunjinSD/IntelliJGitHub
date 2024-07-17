package twelve;

public class ManangeStudent {
    public static void main(String[] args) {
        Student [] student = null;
        ManangeStudent sample = new ManangeStudent();
        student = sample.addStudent();
        sample.printStudents(student);
        sample.checkEquals();



    }

    public Student[] addStudent() {
        Student[] student = new Student[3];
        student[0] = new Student("Lim");
        student[1] = new Student("min");
        student[2] = new Student("Sook", "Seoul", "01012345678", "ask@godofjava.com");
        return student;
    }

    public Student[] printStudents(Student []student) {
        for (Student data : student) {
            System.out.println(data);

        }
        return student;

    }

    public void checkEquals() {
        Student a=new Student("Min","Seoul","010XXXXXXXXX","ask@godofjava.com");
        Student b=new Student("Min","Seoul","010XXXXXXXXX","ask@godofjava.com");
        if(a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
