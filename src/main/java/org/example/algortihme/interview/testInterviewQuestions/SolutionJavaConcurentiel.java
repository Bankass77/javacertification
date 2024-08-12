package org.example.algortihme.interview.testInterviewQuestions;

public class SolutionJavaConcurentiel {

    private static int count = 0;

    /**
     * Increments count in thread-safe manner
     *
     * @return count
     */
    public static synchronized int increment() {
        count = count + 1;
        return count;
    }

    public static void main(String[] args) {
        System.out.println(increment());
    }
}
