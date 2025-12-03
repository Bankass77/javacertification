package org.example.functionalprogrammingjava8.consumers;

import java.util.Map;
import java.util.function.Consumer;

/**
 * A dictionary is implemented as a map of keys and values. Using a
 * single chain of consumers, create a string that contains a comma-
 * separated list of the first word of each value whose key is five
 * characters in length.
 */
public class LongProblemsDictionaryExample {
    public static void main(String[] args) {

        Map<String, String> map = Map.of(
                "doggy", "Wolf descendant",
                "cattt", "Feline with nine lives",
                "ratttt", "rodent with long tail",
                " ox", "strong animal"
        );

        StringBuilder sb = new StringBuilder();
        Consumer<Map.Entry<String, String>> pipelines = ((Consumer<Map.Entry<String, String>>) entry -> {
            // filtre : clé de 5 caractères

            if (entry.getKey().length() != 5) {
                throw new RuntimeException("skip");
            }

        }).andThen(entry -> {

            // prendre le premier mot
            String firstWordOfString = entry.getValue().split(" ")[0];
            entry.setValue(firstWordOfString);
        }).andThen(entry -> {

            if (!sb.isEmpty()) {
                // ajout à la liste
                sb.append(",");
                sb.append(entry.getValue());
            }
        });

        for (var word : map.entrySet()) {

            try {
                pipelines.accept(word);
            } catch (Exception ex) {}

        }
        System.out.println(sb);
    }
}
