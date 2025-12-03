package org.example.functionalprogrammingjava8.consumers;

import java.util.Arrays;
import java.util.function.BiConsumer;

public class ShortProblemBiConsumerExemple {
    public static void main(String[] args) {

        String[] strings = new String[5];
        BiConsumer<String, Integer> biConsumer = (value, index) -> strings[index] = value;

        biConsumer.accept("Hello", 0);
        biConsumer.accept("World", 1);
        biConsumer.accept("Java", 2);
        biConsumer.accept("Lambda", 3);
        biConsumer.accept("Functional", 4);

        // Affichage de Tableau
        System.out.println(Arrays.toString(strings));
    }
}
