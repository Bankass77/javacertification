package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Arrays;

/**
 * Product of the maximums of all subsets of an array
 *
 * Given an array arr[] consisting of N positive integers, the task is to find the product of the maximum of all possible subsets of the given array. Since the product can be very large, print it to modulo (109 + 7).
 *
 * Examples:
 *
 * Input: arr[] = {1, 2, 3}
 * Output:
 * Explanation:
 * All possible subsets of the given array with their respective maximum elements are:
 *
 * {1}, the maximum element is 1.
 * {2}, the maximum element is 2.
 * {3}, the maximum element is 3.
 * {1, 2}, the maximum element is 2.
 * {1, 3}, the maximum element is 3.
 * {2, 3}, the maximum element is 3.
 * {1, 2, 3}, the maximum element is 3.
 * The product of all the above maximum element is 1*2*3*2*3*3*3 = 324.
 *
 * Input: arr[] = {1, 1, 1, 1}
 * Output: 1
 *
 * Appraoch:
 *
 * The idea is to count the number of times each array element occurs as the maximum element among all possible subsets formed.
 * An array element arr[i] is a maximum if and only if all the elements except arr[i] are smaller than or equal to it.
 * Therefore, the number of subsets formed by all elements smaller than or equal to each array element arr[i] contributes to the count of subsets having arr[i] as the maximum element.
 * Follow the steps below to solve the problem:
 *
 * Initialize a variable, say maximumProduct as 1 that stores the resultant product of maximum elements of all subsets.
 * Sort the given array arr[] in the increasing order.
 * Traverse the array from the end using the variable i and perform the following steps:
 * Find the number of subsets that are smaller than the current element arr[i] as (2^i – 1) and store it in a variable say P.
 * Since the array element arr[i] contributes P number of times, therefore multiply the value arr[i], P times to the variable maximumProduct.
 * Find the product of the array element with maximumProduct for including all the subsets of size 1.
 * After completing the above steps, print the value of maximumProduct as the resultant maximum product.
 */
public class ProductOfMaximums {
    static final int MOD = 1000000007;

    // Function to calculate (base^exp) % MOD
    static long power(long base, int exp) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {  // Check if exp is odd
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;  // Divide exp by 2
        }
        return result;
    }

    public static long productOfMaximums(int[] arr) {
        int n = arr.length;

        // Sort the array in increasing order
        Arrays.sort(arr);

        long maxProduct = 1;

        // Traverse the array from the last element to the first
        for (int i = 0; i < n; i++) {
            // Calculate 2^i % MOD (number of subsets for which arr[i] is the maximum)
            long subsetsCount = power(2, i);

            // Multiply arr[i] for subsetsCount number of times
            maxProduct = (maxProduct * power(arr[i], (int)subsetsCount - 1)) % MOD;
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println("Product of Maximums: " + productOfMaximums(arr1));  // Output: 324

        int[] arr2 = {1, 1, 1, 1};
        System.out.println("Product of Maximums: " + productOfMaximums(arr2));  // Output: 1
    }
}
/*
 * Explication :
 * Fonction power : Elle est utilisée pour calculer la puissance exponentielle modulo 10^9 + 7,
 * en utilisant l'exponentiation rapide (méthode efficace pour calculer les grandes puissances).
 * Tri : Nous trions d'abord le tableau pour pouvoir compter combien de fois chaque élément est le maximum dans les sous-ensembles.
 * Produit des maximums :
 * Pour chaque élément, nous calculons combien de sous-ensembles où cet élément est le maximum.
 * Nous utilisons la puissance 2^i
 *   pour calculer combien de sous-ensembles existent pour les éléments plus petits.
 * Le produit des maximums est mis à jour pour chaque élément.
 * Complexité :
 * Temps : O(n log n) en raison du tri du tableau.
 * Espace : 𝑂(1), sans compter l'espace pour stocker le tableau.
 * Cela produit le résultat correctement modulo 10^9 + 7.
 */