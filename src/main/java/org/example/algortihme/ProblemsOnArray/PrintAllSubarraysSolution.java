package org.example.algortihme.ProblemsOnArray;

/**
 * Given an integer array, print all subarrays with zero-sum.
 */
public class PrintAllSubarraysSolution {

    // Function to print all subarrays with a zero-sum
    // in a given array
    //Approach 1: Using Brute-Force:
    // A naive solution is to consider all subarrays and find their sum.
    // If the subarray sum is equal to 0, print it. The time complexity of the naive solution
    // is O(n3) as there are n2 subarrays in an array of size n, and it takes O(n) time to
    // find the sum of its elements.
    // We can optimize the method to run in O(n2) time by calculating the subarray sum in constant time.
    private static void printAllSubarrays(int[] arr) {


        int sum = 0;
        // considère tous les sous-tableaux à partir de `i`
        for (int i = 0; i < arr.length; i++) {
            // considère tous les sous-tableaux se terminant par `j`
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if(sum==0){
                    System.out.print("sous-tableau [" +i + "..." + j +"]");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
        printAllSubarrays(nums);
    }
}
