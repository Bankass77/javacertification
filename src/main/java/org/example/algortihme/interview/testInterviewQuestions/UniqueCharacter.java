package org.example.algortihme.interview.testInterviewQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueCharacter {

    private static boolean isUnique(String word) {
        if (word.isEmpty()) {
            return true; // une chaîne de caractère vide ne contient pas de caractère répeté.
        }
        char[] chars = word.toCharArray();
        Set<Character> set = new HashSet<>();

        for (char c : chars) {
            if (set.contains(c)) {
                return false;  // return false, si un caractère répeté est trouvé
            }
            set.add(c);
        }
        return true;  // Retourne true si aucun caractère n'est répété
    }

    public static void main(String[] args) {
        String word = "leetcode";
        System.out.println(isUnique(word));
    }
}
