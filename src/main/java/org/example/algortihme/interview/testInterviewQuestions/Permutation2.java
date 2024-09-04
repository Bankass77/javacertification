package org.example.algortihme.interview.testInterviewQuestions;

public class Permutation2 {
    private boolean permutation(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] letters = new int[128];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i)]++;
        }
        for (int i = 0; i < t.length(); i++) {
            letters[t.charAt(i)]--;
            if (letters[t.charAt(i)] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Permutation2 p = new Permutation2();
        System.out.println(p.permutation("abcd", "efgh"));
    }
}
