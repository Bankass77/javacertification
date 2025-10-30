package org.example.java17.chapter8;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerOrBiConsumerExample {

    public static void main(String[] args) {
        System.out.println("----------------Consumer--------------");
        Consumer<String> c1 = System.out::println;

        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie"); // Annie
        c2.accept("Annie"); // Annie

        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> biConsumer = map::put;
        biConsumer.accept("Chicken", 7);

        BiConsumer<String, Integer> biConsumer1 = (k, v) -> map.put(k, v);
        biConsumer1.accept("Chick", 1);

        System.out.println(map);

        System.out.println("----------------BiConsumer--------------");
        var map2 = new HashMap<String, String>();
        BiConsumer<String, String> biConsumer2 = map2::put;
        BiConsumer<String, String> biConsumer3 = (k, v) -> map2.put(k, v);
        biConsumer2.accept("Chicken", "Cluck");
        biConsumer3.accept("Chick", "Tweep");

        System.out.println(map2);
    }
}
