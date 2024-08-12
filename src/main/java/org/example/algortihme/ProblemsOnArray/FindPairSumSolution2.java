package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;

// Function to find a pair in an array with a given target using sorting
public class FindPairSumSolution2 {

    // On trie le tableau de façon ascendant
    private static void findPairSum(int[] arr, int target) {
        Arrays.sort(arr);
        int low= 0;
        int high= arr.length-1;
        // réduire l'espace de recherche `arr[low...high]` à chaque itération de la boucle
        // boucle jusqu'à ce que l'espace de recherche soit épuisé
        while (low < high){
            if( arr[low] + arr [high] == target){
                System.out.printf("Pair found (arr[low]=%d, arr[high]=%d)%n", arr[low], arr[high]);
            }

            if(arr[low] + arr[high] > target){
                low++;
            }else {
                high--;
            }

            //Ou
           /* if(arr[low] + arr[high] > target){
                high--;
            }else {
                low++;
            }*/

        }
        System.out.println("Pair not found.");
    }

    public static void main(String[] args) {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
        FindPairSumSolution2.findPairSum(nums, target);
    }
}
