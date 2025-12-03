package org.example.functionalprogrammingjava8.supplier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class PartOfSpeechSupplier {

    public static void main(String[] args) {

        // 1. On definit Les règles grammaticales

        Map<String, List<String>> rules = new HashMap<>();
        rules.put("Articles", List.of("the", "a", "an"));
        rules.put("Prepositions", List.of("Of", "in", "on", "beside", "under", "above"));
        rules.put("Verbs", List.of("is", "was", "compiled"));

        // 2. La phrase à analyser
        String sentence = "The programmer compiled a program";

        // On prend chaque mot de la sentence dans un tableau.
        String[] words = sentence.split(" ");

        //
        final int[] index = {0};

        // on crée un supplier qui donne un mot à la fois
        Supplier<String> wordSupplier = () -> {

            if (index[0] < words.length) {
                return words[index[0]++];

            }
            return null;  // fin des mots
        };

        // Boucle de traitement de la phrase
        String word;
        while ((word = wordSupplier.get()) != null) {
            String category = detectPartOfSpeech(word, rules);
            System.out.println(word + ":" +  category);
        }
    }

    private static String detectPartOfSpeech(final String word, final Map<String, List<String>> rules) {

        String wordToLower = word.toLowerCase();

        for (var entry : rules.entrySet()) {

            if (entry.getValue().contains(wordToLower)) {

                return entry.getKey();
            }
        }

        return "NOUN";
    }
}
