package org.example.algortihme;

public class PrintEvenLengthWords {

    //Input: s = "This is a java language"
    //Output: This is  java language

    /**
     * Explanation: All the elements with the length even are printed. "This" length is 4 so printed whereas "a" length is 1 so not Printed.
     */

    public static String printEvenLengthWords(String s) {
            if(s == null || s.trim().isEmpty()) {
                return "";
            }

            String[] words = s.split("\\s+");
            StringBuilder evenLengthWords = new StringBuilder();

            for(String word : words) {
                if(word.length() % 2 == 0) {
                    evenLengthWords.append(word).append(" \n");
                }
            }

            return evenLengthWords.toString().trim();
        }

        public static void main(String[] args) {
            String result = printEvenLengthWords("This is a java language");
            System.out.println(result);
        }
}
