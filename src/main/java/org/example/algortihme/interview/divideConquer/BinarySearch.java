package org.example.algortihme.interview.divideConquer;

/*
Binary Search Algorithm – Iterative and Recursive Implementation
Given a sorted array of n integers and a target value, determine if the target exists
 in the array in logarithmic time using the binary search algorithm.
If target exists in the array, print the index of it.
For example,
Input: nums[] = [2, 3, 5, 7, 9]
target = 7
Output: Element found at index 3
Input: nums[] = [1, 4, 5, 8, 9]
target = 2
Output: Element not found
Let’s track the search space by using two indexes – start and end. Initially, start = 0 and end = n-1 (as initially, the whole array is our search space). At each step, find the mid-value in the search space and compares it with the target. There are three possible cases:

If target = nums[mid], return mid.
If target < nums[mid], discard all elements in the right search space, including the middle element, i.e., nums[mid…high]. Now our new high would be mid-1.
If target > nums[mid], discard all elements in the left search space, including the middle element, i.e., nums[low…mid]. Now our new low would be mid+1.
Repeat the process until the target is found, or our search space is exhausted
 */
public class BinarySearch {

    // Function to determine if a `target` exists in the sorted array `nums`
    // or not using a binary search algorithm
    public static int binarySearch(int[] arr, int target) {

        // search space is nums[left…right]
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right)/2;
            if( target == arr[mid]){
                return mid;
            }

            // Si la target est plus petit que l'élement qui se trouve à l'index mid du tableau
            // la borne right change et devient mid-1;
            else if( target < arr[mid]){
                right = mid-1;
            }else   // Si la target est plus grand que l'élement qui se trouve à l'index mid du tableau
            // la borne left change et devient mid+1;
            {
                left = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
        int result = binarySearch(nums, target);
        System.out.println("Result : " + result);
    }
}
