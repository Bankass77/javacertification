package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;

/**
 * Nous pouvons également résoudre ce problème en temps linéaire en utilisant la logique
 * de partitionnement de Quicksort. L'idée est d'utiliser 1 comme élément
 * pivot et d'effectuer un seul passage dans le processus de partitionnement.
 * Le tableau résultant sera trié.
 */
public class SortBinaryArrayIII {

    public static void sort(int[] array) {
        int pivot = 1;
        int j = 0;

        // chaque fois que nous rencontrons 0, 'j' est incrémenté, et 0 est placé avant le pivot.
        for(int i = 0; i < array.length; i++) {
            if(array[i] < pivot) {
                swap(array, i, j);
                j++;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
