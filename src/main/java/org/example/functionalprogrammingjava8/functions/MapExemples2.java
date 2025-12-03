package org.example.functionalprogrammingjava8.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExemples2 {
    public static void main(String[] args) {

        // Etape 1: on défini la Map de départ
        Map<String, String> animals = Map.of("dog", " wolf descendant", "cat", " feline with nine lives", "rat", "rodent with long tail");


        // Étape 2 : Définir les fonctions

        // Première fonction :
        // Convertir la Map en une List<Map.Entry<String, String>>
        Function<Map<String, String>, List<Map.Entry<String, String>>> mapToList = map -> new ArrayList<>(map.entrySet());  // Elle transforme la Map en liste d'entrées

        // Deuxième fonction :
        // Inverser les clés et valeurs pour chaque Entry.
        Function<List<Map.Entry<String, String>>, List<Map.Entry<String, String>>> invertEntries = list -> list.stream().map(e -> Map.entry(e.getValue(), e.getKey())).toList();//Pour chaque entrée (key, value) → on crée une nouvelle (value, key).


        //Troisième fonction :
        //Reconvertir la liste inversée en Map.

        Function<List<Map.Entry<String, String>>, Map<String, String>> listToMap = list -> list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Étape 3 : Chaîner les fonctions (function chain)
        Function<Map<String, String>, Map<String, String>> invertMap = mapToList.andThen(invertEntries).andThen(listToMap);

        //  Exécution
        Map<String, String> inverted = invertMap.apply(animals);
        System.out.println(inverted);

    }
}
