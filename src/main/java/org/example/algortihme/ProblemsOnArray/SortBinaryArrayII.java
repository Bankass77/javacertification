package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;

/**
 * Instead of counting the total number of zeros, if the current element is 0,
 * we can place 0 at the next available position in the array.
 * After all elements in the array are processed, we fill all remaining indices by 1.
 */
public class SortBinaryArrayII {


    //Fonction pour trier en temps lineaire les éléments du tableau.
    public static  void sortBinaryArray(int[] arr) {
        // `k` stocke l'index de la prochaine position disponible
        int k = 0;
        for (int value : arr) {

            // si l'élément courant est 0, mettre 0 à l'emplacement suivant libre du tableau.
            if (value == 0){
                arr[k++]= 0;
            }
        }

        // on remplace le reste du tableau par des 1.
        for(int i = k ; i<arr.length; i++){
            arr[k++] = 1;
        }
    }

    public static void main(String[] args) {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        sortBinaryArray(A);
        System.out.println(Arrays.toString(A));
    }
}
