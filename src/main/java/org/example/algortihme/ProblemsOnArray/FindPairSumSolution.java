package org.example.algortihme.ProblemsOnArray;

/**
 * Find a pair with the given sum in an array
 * Given an unsorted integer array, find a pair with the given sum in it.
 * For example,
 * Input: nums = [8, 7, 2, 5, 3, 1]target = 10 Output: Pair found (8, 2)orPair found (7, 3)
 * Input: nums = [5, 2, 6, 8, 1, 9]target = 12 Output: Pair not found
 * Practice this problem:
 * There are several methods to solve this problem using brute-force, sorting,
 * and hashing. These are discussed below:
 */
public class FindPairSumSolution {

    public static void main(String[] args) {
        int [] arr = { 8, 7, 2, 5, 3, 1 };
        int target = 10;

        FindPairSumSolution solution = new FindPairSumSolution();
        findPairSum(arr, target);
    }
    private static void findPairSum(int[] arr, int sum) {
        //On considère chaque élément du tableau excepté le dernier élément
        for(int i = 0; i < arr.length - 1; i++) {
            //on commence au ième élément jusqu'au dernier élément
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum) {
                    System.out.printf("Pair found (i=%d, j=%d)%n", i, j);
                    return;
                }

            }

        }
        System.out.println("Pair not found");
    }

}
