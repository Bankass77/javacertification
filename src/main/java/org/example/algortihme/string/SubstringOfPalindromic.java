package org.example.algortihme.string;

import java.util.HashSet;
import java.util.Set;

public class SubstringOfPalindromic {

    public static void expand(String str, int low, int high, Set<String> stringSet) {

        while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {

            // On ajoute tous les palindromes dans l'ensemble
            stringSet.add(str.substring(low, high + 1));
            // puis on expand dans les 2 directions
            low--;
            high++;
        }
    }

    public static void substringOfPalindromic(String str) {
        if (str.isEmpty()) {
            return;
        }
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {

            // On cherche tous les palindromes impairs de str[i]  au midpoint.
            expand(str, i, i, stringSet);

            // On cherche tous les palindromes pairs de str[i] à str[i+1]
            expand(str, i, i + 1, stringSet);


        }
        System.out.println(stringSet);
    }

    public static void main(String[] args) {
        String str = "google";
        substringOfPalindromic(str);
    }

}
