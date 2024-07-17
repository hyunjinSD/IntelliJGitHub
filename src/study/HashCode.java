package study;

public class HashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Kim");
        Person person2 = new Person(new String("Kim"));
        Person person3 = person2;
        System.out.println(person1.hashCode()); //295530567
        System.out.println(person2.hashCode()); //2003749087
        System.out.println(person3.hashCode()); //2003749087
    }
}

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

}
