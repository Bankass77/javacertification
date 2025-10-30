package org.example.java17.chapter8.functions;

import java.util.ArrayList;
import java.lang.Number;
import java.util.Arrays;

public class NumberParse {

    private static <R extends Number> R pasre(String x, Function<String, R> f) {

        return f.apply(x);
    }

    public static void main(String[] args) {
        ArrayList<Function<String, ? extends Number>> list= new ArrayList<>();
        list.add(x -> Byte.parseByte(x));
        list.add( x -> Short.parseShort(x));
        list.add(x -> Integer.parseInt(x));
        list.add(x -> Long.parseLong(x));
        list.add(x -> Float.parseFloat(x));
        list.add(x -> Double.parseDouble(x));

        String [] numbers= {"10", "20", "30", "40", "50", "60"};
         Number [] results= new  Number[numbers.length];
         for (int i= 0; i < numbers.length; ++i){
             results[i]= pasre(numbers[i], list.get(i));

         }

         System.out.println(Arrays.stream(results).toList());

    }
}
