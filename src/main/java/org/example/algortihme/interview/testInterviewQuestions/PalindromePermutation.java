package org.example.algortihme.interview.testInterviewQuestions;

public class PalindromePermutation {

    public boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildfrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    private int[] buildfrequencyTable(final String phrase) {

        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }

        }

        return table;
    }

    private boolean checkMaxOneOdd(final int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return true;
    }

    private int getCharNumber(Character c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a < val && val < z) {
            return val - a;
        }
        return -1;
    }

    public static void main(String[] args) {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        String word = "Tact  Coa";
        System.out.println(palindromePermutation.isPermutationOfPalindrome(word));

    }
}
