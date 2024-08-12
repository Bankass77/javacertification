package org.example.algortihme.ProblemsOnArray;

/*
Find two duplicate elements in a limited range array (using XOR)
Given an integer array of size n+2 containing elements between 1 and n with two element repeating,
find both duplicate elements without using any extra memory in linear time.

For example:
Input:  arr[] = [4, 3, 6, 5, 2, 4, 1, 1] Output: The duplicate elements are 1 and 4
 */
public class FindTwoDuplicateElements {

    public static  int log(int x, int base){
        return (int) (Math.log(x)/Math.log(base));
    }

    // Fonction pour trouver deux éléments répétitifs dans un tableau de taille `n+2`
    // ayant une plage d'éléments de 1 à `n` en utilisant l'opérateur XOR
    public static void findTwoDuplicateElements(int[] arr, int n) {
        // prenez le XOR de tous les éléments du tableau index 0 à `n-1` et
        // des éléments de 1 à `n`
        int resultat= arr[0] ^ arr[n+1];
        for( int i = 1; i <= n; i++){
            resultat = resultat ^ arr[i] ^ i;
        }
        // `x` et `y` sont deux éléments apparaissant un nombre impair de fois
        int x = 0, y = 0;
        // `resultat` stocke `x ^ y`
        // trouver la position du bit défini le plus à droite dans `result`

        int k = log(resultat & -resultat, 2);
        //diviser le tableau en 2 sous-tableaux:
        for( int i = 0; i < n + 2 ; i++){
            // éléments du tableau qui ont le k-ième bit défini
            if((arr[i] & (1<< k )) !=0){
                x = x ^ arr[i];
            }
            // éléments du tableau qui ont le k-ième bit non défini
            else {
                y = y ^ arr[i];
            }
        }
        // diviser la plage [1, n] en deux sous-plages
        for(int i = 1; i <= n; i++){
            // le nombre `i` a le k-ième bit défini
            if((i &(1<<k)) !=0){
                x = x ^ i;
            }
            // le nombre `i` a le k-ième bit non défini
            else {
                y= y^i;
            }
        }
        System.out.println("Les éléments en doubles sont " + x + " et "  + y);

    }


    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 5, 2, 4, 1, 1};
        int n =6;
        findTwoDuplicateElements(arr, n);
    }
}
