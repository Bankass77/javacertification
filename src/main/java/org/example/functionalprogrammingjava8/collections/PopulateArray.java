package org.example.functionalprogrammingjava8.collections;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

public class PopulateArray {

    public static void main(String[] args) {

        IntUnaryOperator iop = x -> x;
        int[] iarr = new int[4];
        Arrays.setAll(iarr, iop);
        for (int i : iarr) {
            System.out.println(i);
        }

        System.out.println();
        IntToLongFunction gen5 = x -> 5;

        long[] larr = new long[4];
        Arrays.setAll(larr, gen5);

        for (long i : larr) {
            System.out.println(i);
        }

        System.out.println();


        IntToDoubleFunction i2d = x -> (new Random()).nextFloat();
        double[] darr = new double[4];
        Arrays.setAll(darr, i2d);
        for (double d : darr) {

            System.out.println(d);
        }

        System.out.println();

        IntFunction<String> is= x ->{
            String s= "";
            for (int i = 0; i <x ; ++i) {

                s+= "S";

            }
            return s;
        };

        String [] sarr = new String[4];
        Arrays.setAll(sarr, is);

        for (String s: sarr){
            System.out.println(s);
        }
    }
}
