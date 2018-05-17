package decorator;

public abstract class Decorator implements ViewElement {

    private ViewElement view;

    public Decorator(ViewElement view) {
        this.view = view;
    }


    public void draw() {
        view.draw();
    }
}