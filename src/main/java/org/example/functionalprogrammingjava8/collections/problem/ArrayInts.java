package org.example.functionalprogrammingjava8.collections.problem;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class ArrayInts {

    public static void main(String[] args) {
        int[] array = new int[4];
        Arrays.setAll(array, i-> array.length-i);

        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

         list.removeIf(x -> x == 1);
         System.out.println(list);

    }

}
