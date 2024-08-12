package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;

/**
 * 1. Modify the solution so that all 1’s would come first.
 * 2. Rearrange even and odd numbers in an array in linear time
 * such that all even numbers come before all odd numbers.
 */
public class SortBinaryArrayIV {

    public static void sort( int [] array){

        int pivot = 0;
        int j= 0;
        for(int i=0; i<array.length; i++){
            if( array[i] > pivot){
                swap(array, i, j);
                j++;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] =temp;
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
