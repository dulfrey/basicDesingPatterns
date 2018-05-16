package decorator;

public abstract class Decorator implements ViewElement {
    // 4. "has a" relationship
    private ViewElement view;

    public Decorator(ViewElement view) {
        this.view = view;
    }

    // 5. Delegation
    public void draw() {
        view.draw();
    }
}