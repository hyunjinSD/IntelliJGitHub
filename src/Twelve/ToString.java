package Twelve;

public class ToString {
    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethood(thisObject);

    }

    public void toStringMethood(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }

    public String toString() {
        return "ToString class";
    }
}
