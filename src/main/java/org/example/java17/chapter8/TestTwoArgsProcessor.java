package org.example.java17.chapter8;

public class TestTwoArgsProcessor {

    public static void main(String[] args) {

        TwoArgsProcessor<Integer> multiplyInts = new TwoArgsProcessor<Integer>() {
            @Override
            public Integer process(final Integer arg1, final Integer arg2) {
                return arg1 * arg2;
            }
        };

        TwoArgsProcessor<Double> addDoubles = new TwoArgsProcessor<Double>() {
            @Override
            public Double process(final Double arg1, final Double arg2) {
                return arg1 + arg2;
            }
        };

        TwoArgsProcessor<String> comapareString = new TwoArgsProcessor<String>() {
            @Override
            public String process(final String arg1, final String arg2) {
                return arg1.compareTo(arg2) > 0 ? arg1 : arg2;
            }
        };

        System.out.println(multiplyInts.process(2, 3));
        System.out.println(addDoubles.process(4.1, 5.2));
        System.out.println(comapareString.process("ace", "age"));
    }

}
