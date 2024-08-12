package org.example.java9.arrays;

import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int [] data1 = {10,20,30,40,50,60,70,80,90};
        int [] data2 = {10,20,30,40,50,60,70,80,90};
        int [] data3 = {8,30,70,80};
        int [] data4 = null;

        CheckArray(data1, data2, data3, data4);
    }

    private static void CheckArray(int[] data1, int[] data2, int[] data3, int [] data4) {

        //Demonstration of equals(): comparaison de data1 avec data3
        System.out.println("\nArrays.equals(int[] a, int aFromIndex,int aToIndex,int[] b, int aFromIdex, int aToIndex))"+ " = "+
        Arrays.equals(data1, 0,3, data3, 0, 3));

        // Comparaison de data1 avec data2
        System.out.println("\nArrays.equals(int[] a, int aFromIndex,int aToIndex,int[] b, int aFromIdex, int aToIndex))"+ " = "+
                Arrays.equals(data1, 0,3, data2, 0, 3));

        // Demonstation de la méthode compare()
        System.out.println("Comparaison de data1 et data2 :=" + Arrays.compare(data1, data2));
        System.out.println("Comparaison de data1 et data3 :=" + Arrays.compare(data1, data3));


        //Demonstration de la méthode mismatch()
        System.out.println("Comparaison de data1 et data2  par la méthode mismatch() :=" + Arrays.mismatch(data1, data2));
        System.out.println("Comparaison de data1 et data3 par la méthode mismatch() :=" + Arrays.mismatch(data1, data3));

        System.out.println(" Comparaison de data3 et data4 par la méthode mistmatch surchargée:=" + Arrays.mismatch(data1, 0, 3 ,data2, 0, 3));
        System.out.println(" Comparaison de data3 et data4 par la méthode mistmatch avec lévée d'une NPE:=" + Arrays.mismatch(data3, data4));
    }

}
