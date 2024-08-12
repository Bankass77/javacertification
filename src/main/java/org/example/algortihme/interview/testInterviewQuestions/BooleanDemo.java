package org.example.algortihme.interview.testInterviewQuestions;

public class BooleanDemo {

    public static void main(String[] args) {

        BooleanDemo demo = new BooleanDemo();
        System.out.println(demo.mustReturnTrue(1, 5));
        System.out.println(demo.mustReturnTrue(2, 3));
        System.out.println(demo.mustReturnTrue(-3, 4));

    }

    /**
     * @param i
     * @param j
     * @return true if i+j ==1 or if i or j ==1
     */
    private boolean mustReturnTrue(int i, int j) {

        return i + j == 1 || i == 1 || j == 1;
    }
}
