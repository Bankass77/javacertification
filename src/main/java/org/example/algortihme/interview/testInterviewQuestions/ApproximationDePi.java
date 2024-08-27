package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Random;

public class ApproximationDePi {

    public static double approx( double [][] pts){
        // pts: Représente un tableau de points où chaque point est un tableau de deux double, représentant les coordonnées x et y
        int insideCircle = 0; // Compte le nombre de points qui se trouvent à l'intérieur du quart de disque (où x2 + y2 <=1)
        int totalPoint = pts.length;
        for (double [] point : pts) {
            double x = point [0];
            double y = point [1];
            // vérification si le point est à l'intérieur du quart de disque
            if( x*x + y*y <=1){
                insideCircle ++;
            }
        }

        //estimation de Pi
        return 4.0 * insideCircle /totalPoint;
    }

    public static void main(String[] args) {
        // Génération de points aléatoires
        int numberOfPoints = 10000;
        double[][] points = new double[numberOfPoints][2];
        Random rand = new Random();

        for (int i = 0; i < numberOfPoints; i++) {
            points[i][0] = rand.nextDouble(); // x entre 0 et 1
            points[i][1] = rand.nextDouble(); // y entre 0 et 1
        }

        double estimation = ApproximationDePi.approx(points);
        System.out.println("Estimation de Pi : " + estimation);
    }
}
