package org.example.functionalprogrammingjava8.shortProblems;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PalindromeTest {
    public static void main(String[] args) {

        Predicate<String> palindrom = new Predicate<String>() {
            @Override
            public boolean test(final String s) {

                if (s == null || s.length() != 5) {
                    return false;
                }

                for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                    if (s.charAt(i) != s.charAt(j)) {

                        return false;
                    }
                }
                return true;
            }
        };

        System.out.println("kayak -> " + palindrom.test("kayak"));
        System.out.println("apple-> " + palindrom.test("apple"));


        Predicate<String> palindrome = s -> s != null && s.length() == 5 && new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);

        System.out.println("kayak -> " + palindrome.test("kayak"));
        System.out.println("apple-> " + palindrome.test("apple"));


        Predicate<String> palindromeWithIntStream = s -> s != null && s.length() > 1
                                                       && IntStream.range(0, s.length() / 2)
                                                        .allMatch(i -> s.charAt(i) == s.charAt(s.length() - i - 1));

        System.out.println("kayak -> " + palindromeWithIntStream.test("kayak"));
        System.out.println("apple-> " + palindromeWithIntStream.test("apple"));

    }


}
