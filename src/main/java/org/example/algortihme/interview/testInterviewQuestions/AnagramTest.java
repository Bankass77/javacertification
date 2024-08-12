package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class AnagramTest {

    private static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()) {
            return false;
        }

        int[] counter = new int[256];
        for(char c : a.toCharArray()) {
            counter[c]++;
        }

        for(char c : b.toCharArray()) {
            counter[c]--;
        }
        for(int count : counter) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }

    /* Ignore and do not change the code below */
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();

    /**
     * Try a solution
     *
     * @param output
     *         'true' si les deux mots sont des anagrammes, sinon 'false'.
     */
    public static void trySolution(boolean output) {
        System.out.println(gson.toJson(output));
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            trySolution(isAnagram(gson.fromJson(in.nextLine(), new TypeToken<String>() {

            }.getType()), gson.fromJson(in.nextLine(), new TypeToken<String>() {

            }.getType())));
        }
    }

}
