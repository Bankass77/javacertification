package org.example.algortihme.interview.testInterviewQuestions;

public class SquareShape extends Shape {
    private final int size;
    public SquareShape(int size) {
        this.size = size;
    }

    @Override
    protected int computeSurface() {
        return size * size;
    }

    public static void main(String[] args) {
        SquareShape squareShape = new SquareShape(10);
        System.out.println(squareShape.getSurface());
    }
}
