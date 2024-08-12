package org.example.algortihme.ProblemsOnArray;

import java.util.HashSet;
import java.util.Set;

/*

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists,
the solution should return null.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: null

*/
public class PairSolutionII {
    public static Pair<Integer, Integer> findPair(int[] arr, int target) {

        Set<Integer> set = new HashSet<>();
        for(int value: arr){
            int complement = target - value;
            if(set.contains(complement)){
                return  Pair.of(complement, value);
            }
            set.add(value);
        }
        return null;
    }
    public static void main(String[] args) {

        int [] nums = {8, 7, 2, 5, 3, 1};
        int target = 10;
        System.out.println(findPair(nums, target));
    }

}
