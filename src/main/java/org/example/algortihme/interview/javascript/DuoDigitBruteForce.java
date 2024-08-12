package org.example.algortihme.interview.javascript;

public class DuoDigitBruteForce {

    public static void main(String[] args) {
        DuoDigitBruteForce dd = new DuoDigitBruteForce();
        int x = 12;
        int z = 110;
        int w = -33333;
        int a = 102;
        System.out.println(dd.isDuodigit(x));
        System.out.println(dd.isDuodigit(z));
        System.out.println(dd.isDuodigit(w));
        System.out.println(dd.isDuodigit(a));
    }

    private String isDuodigit(int number) {
        // Convert the number to a string to handle the digits
        String numberStr = String.valueOf(Math.abs(number));
        // Array to count digit occurrences
        int[] digitCount = new int[10];
        for(char c : numberStr.toCharArray()) {
            digitCount[Character.getNumericValue(c)]++;
        }

        // On coumpte les chiffres distincts
        int distinctDigits = 0;
        for(int count : digitCount) {

            if(count > 0) {
                distinctDigits++;
            }
            if(distinctDigits > 2) {

                return "n";
            }

        }
        return "y";
    }
}
