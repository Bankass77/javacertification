package org.example.algortihme.interview.testInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuoDigit {

    public static void main(String[] args) {
        DuoDigit duoDigit = new DuoDigit();
        int x = 12;
        int z = 110;
        int w = -33333;
        int a = 102;
        System.out.println(duoDigit.isDuoDigit(x));
        System.out.println(duoDigit.isDuoDigit(z));
        System.out.println(duoDigit.isDuoDigit(w));
        System.out.println(duoDigit.isDuoDigit(a));
        System.out.println(duoDigit.isDuoDigit(1));
        System.out.println(duoDigit.isDuoDigit(2020));
        System.out.println(duoDigit.isDuoDigit(-2021));
    }

    private String isDuoDigit(int number) {

        String numberStr = String.valueOf(Math.abs(number));
        Set<Character> uniqueDigits = new HashSet<>();
        for(char c : numberStr.toCharArray()) {
            uniqueDigits.add(c);

            if(uniqueDigits.size() > 2) {
                return "n";
            }
        }
        return "y";
    }

}
