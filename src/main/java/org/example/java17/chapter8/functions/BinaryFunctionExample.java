package org.example.java17.chapter8.functions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToLongBiFunction;

public class BinaryFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Character, String> bi = (x, z) -> {
            if (Character.isUpperCase(z)) {
                return (x % 2) == 0 ? "EVEN" : "ODD";
            }

            return (x % 2) == 0 ? "even" : "odd";
        };


        String result = bi.apply(4, 'U');
        System.out.println(result);


        Function<String, Double> bi2 = x -> x.equalsIgnoreCase("even") ? 3.0 : 4.0;
        Double d = bi.andThen(bi2)  // Function<String, Double>
                .apply(4, 'U'); // BiFunction<Integer, Character, String>

        System.out.println(d);

        System.out.println("=================ToIntBiFunction===================");
        ToIntBiFunction<String, Double> tib = (x, z) -> Integer.parseInt(x) + z.intValue();
        System.out.println(tib.applyAsInt("5", 4.2));

        System.out.println("==================ToLongBiFunction===================");
        ToLongBiFunction<Double, String> tlb = (x, z) -> x.longValue() + Long.parseLong(z);
        System.out.println(tlb.applyAsLong(4.2, "6"));
        System.out.println("======================ToDoubleBiFunction===================");

        ToDoubleBiFunction<Integer, Long> tdb = (x, z) -> x.doubleValue() + Long.valueOf(z).doubleValue();

        System.out.println(tdb.applyAsDouble(56, 7L));


    }
}
