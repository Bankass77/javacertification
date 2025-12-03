package org.example.functionalprogrammingjava8.predicate;

import java.util.function.Predicate;

public class PredicateHelperTest {

    public static void main(String[] args) {
        Predicate<Integer> p1 = x -> x > 2;
        Predicate<String> p2 = s -> s.charAt(0) == 'H';

        PredicateHelper.result(p1, 6);
        PredicateHelper.result(p2, "Hello");

        System.out.println("===================Predicate Negate===================");
        Predicate<Integer> p3 = x -> x > 7;
        System.out.println(p3.negate().test(9));

        System.out.println(p3.and(x -> x % 2 == 1).negate().test(8));

        System.out.println(p3.negate().and(x -> x % 2 == 1).test(8));

        Predicate<Integer> p4 = Predicate.isEqual(3);
        if (p4.test(3)) {

            System.out.println("The Predicate is true");
        }

        System.out.println(p3.or(Predicate.isEqual(3)).test(3));

        System.out.println(p3.and(Predicate.not(x -> x % 2 == 1)).test(8));


        Predicate<String> lengthGr4 = x -> x.length() > 4;
        Predicate<String> charOisA = x -> x.charAt(0) == 'a';
        try {
            System.out.println((lengthGr4.and(charOisA).test("alpha")));
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }

        Predicate<String> nullProtectedLengthGR4 = new Predicate<String>() {
            @Override
            public boolean test(final String s) {
                return s.length() > 4;
            }

            @Override
            public Predicate<String> and (Predicate < ? super String > p){

                return x-> x == null ? false: test(x) && p.test(x);
            }
        };

        System.out.println(nullProtectedLengthGR4.and(charOisA).test("alpha"));

        System.out.println(nullProtectedLengthGR4.and(charOisA).test(null));




    }
}
