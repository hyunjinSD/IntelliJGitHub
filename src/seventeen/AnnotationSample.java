package seventeen;

public class AnnotationSample {
    @SuppressWarnings("deprecation")
    public void useDeprecated() {
        AnootationDeprecated child = new AnootationDeprecated();
        child.noMoreUse();
    }
}
