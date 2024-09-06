package org.example.algortihme.interview.designpaterns.decorator;

public abstract class WindowEnhancement implements Window {
    protected Window window;

    public WindowEnhancement(Window window) {
        this.window = window;
    }
}
