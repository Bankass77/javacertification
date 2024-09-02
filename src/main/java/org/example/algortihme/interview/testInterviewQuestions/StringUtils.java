package org.example.algortihme.interview.testInterviewQuestions;

import java.util.Arrays;

public class StringUtils {
    public static String concat(char[] charArray) {
        if (charArray == null || charArray.length == 0) {
            return "";
        }

        return new StringBuilder(Arrays.toString(charArray)).toString();
    }
    public static void main(String[] args) {
        char[] charArray = {'f', 'o', 'o'};

        String result = StringUtils.concat(charArray);
        System.out.println(result);  // Affichera "Hello world!"
    }
}
