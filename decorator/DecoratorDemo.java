package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
       
        ViewElement view = new BackgroundDecorator(new BackgroundDecorator((new TextField(80, 24))));
        view.draw();
    }
}