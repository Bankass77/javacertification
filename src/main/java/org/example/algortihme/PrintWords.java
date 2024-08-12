package org.example.algortihme;

public class PrintWords {

    private static String printWords(String str) {

        String [] words= str.split("\\s+");

        // Create an array to store the length of each word
        int [] wordsLenght= new int [words.length];
        for (int i = 0; i < words.length; i++) {

            wordsLenght[i]= words[i].length();
        }
        for (int i = 0; i < words.length; i++) {
            if (wordsLenght[i] %2 ==0) {
                System.out.print(words[i]);
            }
        }
        return " ";
    }

    public static void main(String[] args) {

        System.out.println(printWords("This is a java language"));
    }
}
