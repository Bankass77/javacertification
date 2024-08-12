package org.example.algortihme.ProblemsOnArray;

import java.util.HashSet;
import java.util.Set;

public class hasZeroSumSubarraySolution {

    // Fonction qui vérifie si un tableau contient un sous-tableau dont la somme des éléments est égale à zéro.
    private static  boolean hasZeroSumSubarray(int[] arr) {
        int sum = 0;

        // Crée un ensemble vide pour stocker la somme des éléments de chaque
        // sous-tableau `nums[0…i]`, où `0 <= i < nums.length`

         Set<Integer> set = new HashSet<>();
         // On insère 0 dans le set pour gérer le cas où la somme est égal zéro pour le sous tableau comme à l'index 0.
        set.add(0);

        //on parcourt les éléments du tableau
        for( int value: arr){
            // on fait le cumul de la somme des éléments
            sum += value;

            // Si la somme a été vue auparavant, nous avons trouvé un sous-tableau avec une somme nulle
            if(set.contains(sum)){
                return true;
            }
            // Insérer la somme cumulée dans le set
            set.add(sum);
        }
        // Nous atteignons cet endroit lorsque aucun sous-tableau avec une somme nulle n'existe
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 4, -6, 3, -1, 4, 2, 7 };
        if(hasZeroSumSubarray(nums)){
            System.out.println("Yes, Subarray exist");
        }else {
            System.out.println("No, Subarray not exist");
        }
    }

}
