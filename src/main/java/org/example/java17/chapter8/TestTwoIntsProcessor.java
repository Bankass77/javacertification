package org.example.java17.chapter8;

public class TestTwoIntsProcessor {

    public static void main(String[] args) {
        TwoIntsProcessor multiplyInts = new TwoIntsProcessor() {
            @Override
            public Integer process(final Integer arg1, final Integer arg2) {
                return arg1 * arg2;
            }
        };

        TwoIntsProcessor substractInts = new TwoIntsProcessor() {
            @Override
            public Integer process(final Integer arg1, final Integer arg2) {
                return arg1 - arg2;
            }
        };

        TwoIntsProcessor divideInts = new TwoIntsProcessor() {
            @Override
            public Integer process(final Integer arg1, final Integer arg2) {
                return arg1 / arg2;
            }
        };

        System.out.println(multiplyInts.process(2, 3));
        System.out.println(substractInts.process(5, 2));
        System.out.println(divideInts.process(10, 2));
    }
}
