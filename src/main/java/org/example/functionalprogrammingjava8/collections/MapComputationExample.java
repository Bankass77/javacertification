package org.example.functionalprogrammingjava8.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapComputationExample {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> bin = (k, v) -> v == null ? null : v / 4;

        Map<String, Integer> map = new TreeMap<>();
        map.put("RED", 32);
        map.put("GREEN", null);

        System.out.println("===========default compute method  call====================");
        System.out.println(map.compute("RED", bin));
        System.out.println(map.compute("GREEN", bin));
        System.out.println(map.compute("YELLOW", bin));

        System.out.println("===========foreach  call====================");
        map.forEach((k, v) -> System.out.println(k + " " + v));


        System.out.println("===========default computeIfPresent method  call====================");

        BiFunction<String, Integer, Integer> bi = (k, v) -> v / 4;

        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("RED", 8);
        map1.put("GREEN", null);
        System.out.println(map1.computeIfPresent("RED", bi));
        System.out.println(map1.computeIfPresent("GREEN", bi));
        System.out.println(map1.computeIfPresent("YELLOW", bi));

        System.out.println("===========foreach  call  computeIfPresent====================");

        map1.forEach((k, v) -> System.out.println(k + " " + v));


        System.out.println("===========default computeIfNotPresent method  call====================");

        Function<String, Integer> fi = k -> k.length();
        Function<String, Integer> finull = k -> null;
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("RED", 2);
        map2.put("GREEN", null);

        System.out.println(map2.computeIfAbsent("RED", fi));
        System.out.println(map2.computeIfAbsent("GREEN", fi));
        System.out.println(map2.computeIfAbsent("YELLOW", fi));
        System.out.println(map2.computeIfAbsent("BLACK", finull));
        System.out.println();
        System.out.println("===========foreach  call computeIfAbsent====================");
        map2.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
