package org.example.algortihme.interview.testInterviewQuestions;

import java.io.PrintStream;
import java.util.Scanner;

public class ConvoyeurColisLePlusLourd {
    public static int solve(int weight0, int weight1, int weight2) {
        // Initialiser l'index du convoyeur qui a le poids maximum.
        int maxIndex = 0;
        int maxWeight = weight0;

        // Vérifier si le poids du convoyeur 1 est plus grand que le maximum actuel
        if (weight1 >= weight0) {
            maxIndex = 1;
            maxWeight = weight1;
        }

        // Vérifier si le poids du convoyeur 2 est plus grand que le maximum actuel
        if (weight2 >= maxWeight) {
            maxIndex = 2;
        }
        return maxIndex;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // Boucle de jeu
        while (true) {
            int weight0 = in.nextInt();
            int weight1 = in.nextInt();
            int weight2 = in.nextInt();
            PrintStream outStream = System.out;
            System.setOut(System.err);
            int action = solve(weight0, weight1, weight2);
            System.setOut(outStream);
            System.out.println(action);
        }
    }
}
