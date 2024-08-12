package org.example.algortihme.ProblemsOnArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Approche 2 : Utilisation de multimap pour imprimer tous les sous-ensembles. Nous pouvons utiliser multimap pour imprimer tous les sous-ensembles dont la
 * somme est nulle dans le tableau donné. L'idée est de créer un multimap vide pour stocker tous les indices de fin de sous-ensemble ayant une somme donnée.
 * Parcourir le tableau et conservez la somme des éléments vus jusqu'à présent. Si la somme a déjà été vue, au moins un sous-ensemble a une somme nulle, qui se
 * termine à l'index actuel. Enfin, imprimez tous ces sous-ensembles.
 */
public class PrintAllSubarraysSolutionII {

    // fonction utilitaire pour insérer <key,value> dans le multiMap
    private static <K, V> void insert(Map<K, List<V>> map, K key, V value) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(value);
    }

    // fonction pour afficher tous les sous-ensembles d'un tableau dont la somme est égale à Zéro
    public static void printAllSubarrays(int[] arr) {

        // Création de multiMp vide pour stocker les index de tous les sous-ensembles ayant une somme égale à Zéro.
        Map<Integer, List<Integer>> map = new HashMap<>();

        // insérer une paire (0, -1) dans la map pour gérer le cas où
        // le sous-ensemble dont la somme est égal zéro commence à l'index 0
        insert(map, 0, -1);

        int sum = 0;

        // On parcourt l'ensemble du tableau
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // si la somme est vue avant, il existe au moins un
            // sous-ensemble dont la somme est égale à zéro.
            if(map.containsKey(sum)) {
                List<Integer> list = map.get(sum);
                // trouver tous les sous-ensembles ayant la même somme
                for(int value : list) {
                    System.out.println("Subarray[" + (value + 1) + "..." + i + "]");
                }
            }
            // insérer la paire (sum jusqu'à présent, indice actuel) dans la multiMap
            insert(map, sum, i);
        }

    }

    public static void main(String[] args) {

        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

        printAllSubarrays(nums);
    }
}
