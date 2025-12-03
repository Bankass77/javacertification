package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.function.Function;

public class ComputeEquation2 {

    public static void main(String[] args) {

        int x = 6;
        int y =3;

        Function<int[], Integer> function= arr ->5*(2*arr[0] + 3*arr[1])/2;

        int result= function.apply( new int[]{x, y});

        System.out.println(result);

    }
}
