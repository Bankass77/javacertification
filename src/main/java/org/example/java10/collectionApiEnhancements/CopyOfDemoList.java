package org.example.java10.collectionApiEnhancements;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemoList {
    public static void main(String[] args) {
        useCopyOfNotNull();
        useCopyOfWithNull();
    }

    private static void useCopyOfWithNull() {
        List<Integer> intListOriginal = Arrays.asList(34, 54, 12, 54, null, 25);
        System.out.println("Original List ===>");
        intListOriginal.forEach(e -> System.out.println(e + " "));

        List<Integer> intListCopy = List.copyOf(intListOriginal);
        System.out.println("\nCopied List ==>");
        intListCopy.forEach(e -> System.out.println(e + " "));
    }

    private static void useCopyOfNotNull() {
        List<Integer> intListOriginal = Arrays.asList(34, 54, 12, 54, 25);
        System.out.println("Original List ==>");
        intListOriginal.forEach(System.out::println);
        List<Integer> intListCopy = List.copyOf(intListOriginal);
        System.out.println("\nCopied List ==>");
        intListCopy.forEach(((e) -> System.out.println(e + " ")));
    }
}
