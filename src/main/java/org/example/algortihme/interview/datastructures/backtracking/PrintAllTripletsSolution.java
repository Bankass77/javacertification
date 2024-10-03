package org.example.algortihme.interview.datastructures.backtracking;

import java.util.Arrays;

/*
Étant donné un array d'entiers non triés, imprimez tous les triplets avec une somme inférieure
ou égale à un nombre donné.
Par exemple:
Input:
nums = [ 2, 7, 4, 9, 5, 1, 3 ]
sum = 10
Output: Triplets are

(1, 2, 3)
(1, 2, 4)
(1, 2, 5)
(1, 2, 7)
(1, 3, 4)
(1, 3, 5)
(1, 4, 5)
(2, 3, 4)
(2, 3, 5)
 */
public class PrintAllTripletsSolution {

    public void hasTripletSum(int[] arr, int sum) {

        if (arr == null || arr.length < 3) {
            return;
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            int high = arr.length - 1;
            int low = i + 1;
            while (low < high) {
                if (arr[i] + arr[low] + arr[high] > sum) {
                    high--;
                } else {
                    for (int j = low + 1; j <= high; j++) {
                        System.out.println("(" + arr[i] + ", " + arr[low] + ", " + arr[j] + ")");
                    }
                    low++;
                }
            }

        }
    }

    public static void main(String[] args) {
        PrintAllTripletsSolution solution = new PrintAllTripletsSolution();
        int[] nums = {2, 7, 4, 9, 5, 1, 3};
        int sum = 10;
        solution.hasTripletSum(nums, sum);

    }
}
