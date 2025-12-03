package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    public static void main(String[] args) {

        System.out.println("=====UnaryOperator=======");
        UnaryOperator<String> concat = x -> x + x;
        UnaryOperator<Integer> increment = x -> ++x;
        UnaryOperator<Long> decrement = x -> --x;

        System.out.println("concat : " + concat.apply("My"));
        System.out.println("Increment : " + increment.apply(4));
        System.out.println("Decrement : " + decrement.apply(4L));

        IntUnaryOperator iuo = x -> x + 5;
        LongUnaryOperator luo = x -> x / 3;
        DoubleUnaryOperator duo = x -> x * 2.1;

        System.out.println("IntUnaryOperator: " + iuo.applyAsInt(5));
        System.out.println("LongUnaryOperator: " + luo.applyAsLong(9));
        System.out.println("DoubleUnaryOperator : " + duo.applyAsDouble(4.1));


        System.out.println(iuo.andThen(x -> x * 2).applyAsInt(4));

        System.out.println(luo.compose(x -> x * 6).applyAsLong(4));

        System.out.println(duo.andThen(DoubleUnaryOperator.identity()).applyAsDouble(4.1));


        System.out.println("=====BinaryOperator=======");
        BinaryOperator<String> cancatBinaryOperator = (x, y) -> x + y;

        BinaryOperator<Integer> substractBinaryOperator = (x, y) -> x - y;

        BinaryOperator<Long> multiplyBinaryOperator = (x, y) -> x * y;

        System.out.println(cancatBinaryOperator.apply("AB", "CD"));

        System.out.println(substractBinaryOperator.apply(4, 1));
        System.out.println(multiplyBinaryOperator.apply(4L, 3L));


        IntBinaryOperator ibo = (x, y) -> x + y + 5;
        LongBinaryOperator lbo = (x, y) -> (x + y) / 3L;
        DoubleBinaryOperator dbo = (x, y) -> x * y * 0.5;

        System.out.println(ibo.applyAsInt(4, 2));

        System.out.println(lbo.applyAsLong(9, 3));

        System.out.println(dbo.applyAsDouble(4, 6));

    }
}
