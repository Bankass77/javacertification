package org.example.algortihme.ProblemsOnArray;

/*
*Find the duplicate element in a limited range array
* Given a limited range array of size n containing elements between 1 and n-1 with one element repeating,
*find the duplicate number in it without using any extra space.
 • Approach 1: Using Hashing
 */
public class FindDuplicateElementArray {

    // Fonction pour trouver les éléments en double dans un interval limité du tableau.
    public static int findDuplicate(int[] arr) {
        //L'idée est d'utiliser le hachage(hashing) pour résoudre ce problème. Nous pouvons utiliser un tableau booléen
        // visited pour indiquer si un élément a déjà été vu ou non.
        // Si l'élément a déjà été rencontré auparavant, le tableau visited renverra true.
        // On crée un tableau visited de taille n+1
        //On pouvait aussi utiliser une Map au lieu d'un tableau visited
        boolean[] visited = new boolean[arr.length + 1];

        // marquer chaque élément du tableau comme visité et
        // le retourner s'il a déjà été vu
        for (int value : arr) {
            // si l'élément a déjà été vu
            if (visited[value]) {
                return value;
            }
            visited[value] = true;
        }
        // pas d'élement en doublon dans le tableau
        return -1;
    }

    public static void main(String[] args) {
        // input array contains `n` numbers between 1 and `n-1`
        // with one duplicate, where `n` is the array's length
        int[] nums = {1, 2, 3, 4, 4};
        System.out.println("L'élement en double dans le tableau est: " + findDuplicate(nums));
    }
}
