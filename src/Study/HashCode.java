package Study;

public class HashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Kim");
        Person person2 = new Person(new String("Kim"));
        Person person3 = person2;
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person3.hashCode());
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

}
