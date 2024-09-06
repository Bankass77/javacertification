package org.example.algortihme.interview.datastructures.backtracking;

import java.util.HashMap;
import java.util.List;

public class BacktrackingDemo2 {

    // Fonction principale pour générer toutes les combinaisons possibles
    public static void generateCombinations(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        backtrack(nums, map, 0);
    }

    // Fonction de backtracking
    private static void backtrack(int[] nums, HashMap<Integer, Boolean> map, int index) {
        // Afficher la combinaison actuelle
        printCombination(map, nums);

        // Parcourir toutes les options possibles à partir de l'index actuel
        for (int i = index; i < nums.length; i++) {
            // Ajouter l'élément dans la HashMap comme étant "utilisé"
            map.put(nums[i], true);
            backtrack(nums, map, i + 1); // Continuer avec l'élément suivant
            // Retour en arrière : marquer l'élément comme "non utilisé"
            map.put(nums[i], false);
        }
    }

    // Fonction pour imprimer la combinaison actuelle stockée dans la HashMap
    private static void printCombination(HashMap<Integer, Boolean> map, int[] nums) {
        System.out.print("[");
        for (int num : nums) {
            if (map.getOrDefault(num, false)) { // Vérifie si l'élément est utilisé
                System.out.print(num + " ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        generateCombinations(nums);
    }
}
