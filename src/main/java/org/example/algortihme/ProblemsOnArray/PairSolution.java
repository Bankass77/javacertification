package org.example.algortihme.ProblemsOnArray;

import java.util.HashMap;
import java.util.Map;

/*

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return null.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null

*/
public class PairSolution {

    public static Pair<Integer, Integer> findPair(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int value : arr) {
            int complement = target - value;
            if(map.containsKey(complement)) {
               return  Pair.of(complement, value);
            }
            map.put(value, complement);
        }
       return null;  //  // retourne null si aucune paire n'est trouvée
    }

    public static void main(String[] args) {

        int [] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
       System.out.println(findPair(nums, target));
    }
}
