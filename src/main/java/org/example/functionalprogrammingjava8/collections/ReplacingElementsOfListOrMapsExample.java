package org.example.functionalprogrammingjava8.collections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class ReplacingElementsOfListOrMapsExample {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(16, 12, 8, 4);
        UnaryOperator<Integer> div4 = x -> x / 4;
        list.replaceAll(div4);
        list.forEach(System.out::println);

        System.out.println();

        Map<String,String> map= new TreeMap<>();
        map.put("Smith", "Robert");
        map.put("Jones", "Alex");

        BiFunction<String,String,String> bi = (k,v) -> "Mr. " + v;
        map.replaceAll(bi);
        map.forEach((k,v) -> System.out.println(k + " : " + v));
    }
}
