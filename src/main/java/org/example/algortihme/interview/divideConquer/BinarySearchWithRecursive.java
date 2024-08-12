package org.example.algortihme.interview.divideConquer;

public class BinarySearchWithRecursive {

    public static int binarySearchRecursive(int[] arr,int low, int high, int target) {
        if( low > high){
            return -1;
        }

        int mid= (low + high )/2;
        if( target == arr[mid]){
            return mid;
        } else if( target < arr [mid]) {
            high = mid-1;
            return binarySearchRecursive(arr, low, high, target);

        }else {
            low = mid+1;
            return binarySearchRecursive(arr,low, high, target );
        }
    }
    public static void main(String[] args) {
        int[] nums = { 2, 5, 6, 8, 9, 10 };
        int target = 5;
        int low = 0;
        int high= nums.length -1;
        int result = binarySearchRecursive(nums,low, high, target);
        System.out.println("Result : " + result);
    }
}
