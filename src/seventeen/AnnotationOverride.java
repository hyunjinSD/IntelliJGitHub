package seventeen;


import ten.Parent;

public class AnnotationOverride extends Parent {
    @Override
    public void printName() {
        System.out.println("AnnotationOverride");
    }

}
