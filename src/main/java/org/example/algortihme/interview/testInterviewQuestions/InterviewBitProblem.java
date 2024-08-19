package org.example.algortihme.interview.testInterviewQuestions;

public class InterviewBitProblem {
    public static void main(String[] args) {
        /*
         *Ce décalage est dû à l'erreur qui se produit lors de l'arrondi des nombres à virgule flottante et au fait qu'en Java,
         *seuls les nombres à virgule flottante qui sont des puissances de 2 sont représentés avec précision par
         * la représentation binaire. Le reste des nombres doit être arrondi pour tenir compte des bits limités,
         * le cas échéant.
         */
        System.out.println(0.1 * 3 == 0.3);  // affiche false
        System.out.println(0.1 * 2 == 0.2); // affiche true
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
        System.out.println(1.0 / 0.0);
        Integer num1 = 1000, num2 = 1000;
        System.out.println(num1 == num2);
        Integer num3 = 20, num4 = 20;
        System.out.println(num3 == num4);

    }
}
