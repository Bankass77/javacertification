package org.example.java17.chapter8.shortProblems;

public class SummerTest {

    public static void main(String[] args) {


        Summer<Integer> sumOfTwoIntegers = new Summer<Integer>() {
            @Override
            public Integer sum(final Integer value, final Integer value2) {
                return value + value2;
            }
        };

        int result = sumOfTwoIntegers.sum(4, 8);
        System.out.println(result);


        Summer<Double> sumOfTwoDouble = new Summer<Double>() {
            @Override
            public Double sum(final Double value, final Double value2) {
                return value + value2;
            }
        };

        double resultDouble = sumOfTwoDouble.sum(6.0, 7.8);

        System.out.println(resultDouble);


        Summer<Long> sumOfTwoLong = new Summer<Long>() {
            @Override
            public Long sum(final Long value, final Long value2) {
                return value + value2;
            }
        };

        long longResult = sumOfTwoLong.sum(7L, 2L);

        System.out.println(longResult);

    }

}
