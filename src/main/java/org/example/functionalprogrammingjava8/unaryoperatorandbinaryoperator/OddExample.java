package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.function.UnaryOperator;

/**
 * Write an operator that returns a string containing the odd characters of an input string (in other words, the characters located at positions 1, 3, 5, etc.):
 */
public class OddExample {
    public static void main(String[] args) {

        UnaryOperator<String> odd = x -> {

            StringBuilder sb = new StringBuilder();

            char [] charArrays = x.toCharArray();

            for (int i = 1 ; i < charArrays.length; i+=2){

                sb.append(charArrays[i]);
            }
            return sb.toString();
        };

        System.out.println( odd.apply("ABCDEFG"));

    }
}
