package org.example.algortihme.ProblemsOnArray;

import java.util.HashMap;
import java.util.Map;

/**
 * Using Hashing
 * We can use a hash table to solve this problem in linear time. The idea is to insert each array element nums[i] into a map. We also check if difference (nums[i], target - nums[i]) already exists in the map or not.
 * If the difference is seen before, print the pair and return.
 */
public class FindPairSumSolution3 {

    private static  void findPair(int[] arr, int target) {

        //creation d'une map vide
        Map<Integer, Integer> map = new HashMap<>();
        //on parcourt tous les éléments du tableau
        for (int i = 0; i < arr.length; i++) {
            // on vérifie s'il existe dans la map la pair(arr[i], target-arr[i])

            //on stacke dans complement la différence de target-arr[i]
            int complement = target - arr[i];
            //lorsque la différence est trouvée avant, on affiche
            if(map.containsKey( complement)) {
                System.out.printf("%d, %d ", arr[map.get(complement)], arr[i]);
                return;
            }
            // on stocke l'index de l'élement en cours dans la map
            map.put(arr[i], i);
        }

      System.out.println("Pair not found");
    }

    public static void main(String[] args) {

        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        findPair(nums, target);
    }
}
