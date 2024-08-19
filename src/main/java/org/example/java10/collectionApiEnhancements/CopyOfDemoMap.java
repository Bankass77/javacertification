package org.example.java10.collectionApiEnhancements;

import java.util.HashMap;
import java.util.Map;

public class CopyOfDemoMap {
    public static void main(String[] args) {
        useCopyOfNotnull();
        //useCopyOfWithNull();
    }

    private static Map<Integer, String> createMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Kornet");
        map.put(102, "John");
        map.put(103, "Mary");
        map.put(104, "Jane");
        return map;

    }

    private static void useCopyOfNotnull() {

        Map<Integer, String> originalMap = createMap();
        System.out.println("Original Map ===>");
        System.out.println(originalMap);
        System.out.println("Original Map avec ForEach ===>");
        for (Map.Entry<Integer, String> entry : originalMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        Map<Integer, String> copiedMap = new HashMap<>();
        copiedMap = Map.copyOf(originalMap);
        System.out.println("Original Map was modify after the invocation of copyOf() method: ===>");
        originalMap.put(105, "Williams");
        System.out.println(originalMap);
        System.out.println("Copied Map ===>");
        System.out.println(copiedMap);
    }
}
