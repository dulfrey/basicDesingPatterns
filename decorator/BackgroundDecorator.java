package decorator;

public class BackgroundDecorator extends Decorator {
    public BackgroundDecorator(ViewElement view) {
        super(view);
    }
    public void draw() {

        super.draw();
        System.out.println("  BackgroundDecorator");
    }
}
