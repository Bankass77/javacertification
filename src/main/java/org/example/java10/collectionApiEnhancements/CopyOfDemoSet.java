package org.example.java10.collectionApiEnhancements;

import java.util.Set;

public class CopyOfDemoSet {

    public static void main(String[] args) {
        useCopyOfNotNull();
        useCopyOfWithNull();
    }

    private static void useCopyOfWithNull() {
        Set<Integer> intSetWithNullOriginal= Set.of(54,23,null, 15);
        System.out.println("useCopyOfWithNull: Original Set ==>");
        for(int value: intSetWithNullOriginal){
            System.out.println(value);

        }

        Set<Integer> coopySet=Set.copyOf(intSetWithNullOriginal);
        System.out.println("useCopyOfWithNull Copied Set =====>");
        for(int num: coopySet){
            System.out.println(num);
        }
    }

    private static void useCopyOfNotNull() {

        Set<Integer> intSetOriginal= Set.of(54,23,58,15);
        System.out.println("useCopyOfNotNull Original Set ===========>");
        for(int number: intSetOriginal){
            System.out.println(number);

        }
        Set<Integer>  intSetCopy= Set.copyOf(intSetOriginal);
        System.out.println("useCopyOfNotNull Copied Set =====>");
        for( int copyNumber: intSetCopy){
            System.out.println(copyNumber);
        }

    }
}
