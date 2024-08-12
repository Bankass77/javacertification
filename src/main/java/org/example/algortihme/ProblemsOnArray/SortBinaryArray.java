package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;

/**
 * Given a binary array, sort it in linear time and constant space. The output should print all zeros, followed by all ones.
 * For example,
 * Input:  { 1, 0, 1, 0, 1, 0, 0, 1 } Output: { 0, 0, 0, 0, 1, 1, 1, 1 }
 * Practice this problem:
 * A simple solution would be to count the total number of 0’s present in the array, say k,
 * and fill the first k indices in the array by 0 and all remaining indices by 1.
 * Alternatively, we can count the total number of 1’s present in the array k
 * and fill the last k indices in the array by 1 and all remaining indices by 0.
 */
public class SortBinaryArray {
    public static void sort(int[] array) {
        //on compte le nombre de 0
        int zeroCount= 0;
        for(int value: array){
            if( value ==0){
                zeroCount++;
            }
        }

        //mettre les 0 au début du tableau
        int k = 0;
        while ( zeroCount-- !=0){
            array[k++]= 0;
        }
        //On a rempli le reste du tableau avec 1
        while( k <array.length){
            array[k++]= 1;
        }
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
