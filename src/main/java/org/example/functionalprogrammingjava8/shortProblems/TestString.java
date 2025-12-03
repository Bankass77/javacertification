package org.example.functionalprogrammingjava8.shortProblems;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestString {

    public static void main(String[] args) {
        Predicate<String> onlyDigits= x -> x !=null &&  x.matches("\\d+");
       System.out.println( onlyDigits.test("123444334"));
        System.out.println( onlyDigits.test("rzrzrz"));
        System.out.println( onlyDigits.test(""));
        System.out.println( onlyDigits.test(null));


        Predicate<Integer> result=   ((Predicate<Integer>) (x -> x <100 ||  x%2==1)).negate().and( x-> x >20) ;

        // Démonstration
        System.out.println(result.test(10));   // false (x < 100)
        System.out.println(result.test(105));  // false (x is odd)
        System.out.println(result.test(120));  // true  (x > 100, even, > 20)

        BiPredicate<Integer, Integer> value= ((BiPredicate<Integer, Integer>) ((x, y )->  x > 2 &&  y < x )).negate();

        // Démonstration
         System.out.println(value.test(100, 5));




    }
}
