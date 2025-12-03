package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import org.example.functionalprogrammingjava8.functions.Function;

public class ComputeEquation2_2 {
    public static void main(String[] args) {
         int x = 6;
         int y =3;
        Function<int[], Integer> function = ((Function<int[], Integer>) arr -> (2 * arr[0] + 3 * arr[1])).andThen(v -> v * 5).andThen(v -> v / 2);
        System.out.println(function.apply(new int[]{x,y}));

    }
}
