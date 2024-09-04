package org.example.algortihme.interview.testInterviewQuestions;

public abstract class Shape {
    private int surface;

    public Shape() {
        this.surface = computeSurface();

    }

    protected abstract int computeSurface();

    public int getSurface() {
        return surface;
    }
}