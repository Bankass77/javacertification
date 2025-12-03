package org.example.functionalprogrammingjava8.collections.problem;

import java.util.Map;
import java.util.TreeMap;

public class MapOddExample {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new TreeMap<>();

        map.put(1, 1);
        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
      //  map.replaceAll((k, v) -> k % 2 == 1 ? v * 3 : v);
       // System.out.println(map);

        System.out.println("=============compute================================");

        Map<Integer, Integer> map1 = map;

        for (Integer key : map1.keySet()) {
            map1.compute(key, (k, v) -> k % 2 == 1 ? v * 3 : v);
        }
        System.out.println("compute :" + map1);

        Map<Integer, Integer> map2 = map;
        System.out.println("=============computeIfPresent================================");

        for (Integer key : map2.keySet()) {

            map2.computeIfPresent(key, (k, v) -> k % 2 == 1 ? v * 3 : v);
        }

        System.out.println("computeIfPresent: " + map2);

        System.out.println("=============merge================================");


        for (Integer key : map.keySet()) {

            if (key % 2 == 1) {
                map.merge(key, 0, (oldValue, newValue) -> oldValue * 3);
            }
        }
        System.out.println(map);


    }
}
