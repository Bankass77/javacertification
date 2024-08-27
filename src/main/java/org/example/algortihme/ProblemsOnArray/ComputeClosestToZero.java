package org.example.algortihme.ProblemsOnArray;

public class ComputeClosestToZero {
    public static int computeClosestToZero(int[] ts) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if(ts == null || ts.length ==0){
            throw new IllegalArgumentException("Le tableau ne doit pas être vide");
           // return 0;
        }
        int closest = ts[0];
        for(int temp: ts){
            if(Math.abs(temp) <Math.abs(closest) || (Math.abs(temp)==Math.abs(closest) && temp > closest)){
                closest = temp;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        int[] temperatures1 = {10, -5, 3, -8, 4}; // La température la plus proche de zéro est 3.
        int[] temperatures2 = {-10, -15, -5, -3}; // La température la plus proche de zéro est -3.
        int[] temperatures3 = {}; // Ce cas devrait générer une exception ou une erreur selon la gestion des erreurs.


        System.out.println(computeClosestToZero(temperatures1));
        System.out.println(computeClosestToZero(temperatures2));
        System.out.println(computeClosestToZero(temperatures3));

    }
}
