package org.example.algortihme.interview.designpaterns.decorator;

public class ScrollBarEnhancement extends WindowEnhancement {
    public ScrollBarEnhancement(final Window window) {
        super(window);
    }

    @Override
    public void draw() {
        drowScrollBars();
        window.draw();
    }

    private void drowScrollBars() {
    }
}
