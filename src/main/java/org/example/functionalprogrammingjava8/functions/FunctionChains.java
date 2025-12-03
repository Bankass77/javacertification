package org.example.functionalprogrammingjava8.functions;

import java.util.Objects;
import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class FunctionChains {

    public static void main(String[] args) {

        Function<Boolean, Integer> fsi = x -> x == true ? 1 : 0;
        Function<String, Boolean> fsb = x -> Boolean.parseBoolean(x);

        System.out.println(fsb.andThen(x -> x == true ? 1 : 0) // Function<Boolean, Integer>

                .apply("true"));// Function<String, Boolean


        System.out.println(fsi.compose(fsb).apply("true"));

        Function<Integer, String> intToString = Objects::toString;
        Function<Double, Integer> doubleToInteger = Double::intValue;

        Integer doubleFunction = intToString.andThen(x -> Integer.parseInt(x)).apply(5);

        System.out.println(doubleFunction);

        Integer integer = doubleToInteger.andThen(x -> x.intValue()).apply(4.0);
        System.out.println(integer);


        Function<Double, String> composed = intToString.compose(doubleToInteger);
        System.out.println("composed: " + composed.apply(100.0));

        Function<Double, Integer> function = d -> d.intValue();
        Function<Integer, String> integerStringFunction = i -> String.valueOf(i);
        Function<Double, String> composed2 = integerStringFunction.compose(function);
        System.out.println("composed2: " + composed2.apply(5.0));

        System.out.println("======Function.indentity Method================");

        Function<String, String> f2 = Function.identity();

        String result = f2.apply("HELLO WORD");
        System.out.println(result);

        System.out.println("======IntFunction Method================");

        IntFunction<String> fi = x -> String.valueOf(x);
        System.out.println(fi.apply(5));

        System.out.println("======DoubleFunction Method================");

        DoubleFunction<Boolean> fd = x -> x > 5.0 ? true : false;
        System.out.println(fd.apply(7.0));

        System.out.println("======LongFunction Method================");
        LongFunction<Integer> fl = x -> (int) x;
        System.out.println(fl.apply(6L));

        System.out.println("======ToIntFunction Method================");

        ToIntFunction<String> ti = x -> Integer.parseInt(x);
        System.out.println(ti.applyAsInt("5"));

        System.out.println("======ToLongFunction Method================");

        ToLongFunction<Double> tl = x -> x.longValue();
        System.out.println(tl.applyAsLong(20.0));

        System.out.println("======ToDoubleFunction Method================");

        ToDoubleFunction<Integer> td = x -> x.doubleValue();
        System.out.println(td.applyAsDouble(67));

        System.out.println("======DoubleToIntFunction Method================");

        DoubleToIntFunction di = x -> Double.valueOf(x).intValue();
        System.out.println(di.applyAsInt(4.0));

        System.out.println("======DoubleToLongFunction Method================");
        DoubleToLongFunction dl = x -> Double.valueOf(x).longValue();
        System.out.println(dl.applyAsLong(6.0));

        System.out.println("======IntToDoubletFunction Method================");
        IntToDoubleFunction id = x -> Integer.valueOf(x).doubleValue();
        System.out.println(id.applyAsDouble(32));

        System.out.println("======IntToLongFunction Method================");
        IntToLongFunction il = x -> Integer.valueOf(x).longValue();
        System.out.println(il.applyAsLong(45));

        System.out.println("======LongToDoubleFunction Method================");
        LongToDoubleFunction ld = x -> Long.valueOf(x).doubleValue();
        System.out.println(ld.applyAsDouble(67));

        System.out.println("======LongToIntFunction Method================");
        LongToIntFunction li = x -> Long.valueOf(x).intValue();
        System.out.println(li.applyAsInt(8));
    }
}
