package org.example.java17.chapter8.petproject.longProblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToStringTest {

    public static void main(String[] args) {

        ToString<List<String>> l2s = new ToString<>() {
            @Override
            public String convert(final List<String> strings) {
                return String.join(",", strings);
            }
        };

        ToString<Map<String, Integer>> m2s = new ToString<>() {
            @Override
            public String convert(final Map<String, Integer> stringIntegerMap) {
                return stringIntegerMap.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).reduce((a, b) -> a + "," + b).orElse("");
            }
        };

        System.out.println("====================List<String>===========================");

        List<String> strings = List.of("Java", "17");
        String result = l2s.convert(strings);
        System.out.println(result);

        System.out.println("====================List<String>===========================");

        Map<String, Integer> map = Map.of("Java", 17, "Bamabara", 12);

        String resultMap = m2s.convert(map);
        System.out.println(resultMap);
    }
}
