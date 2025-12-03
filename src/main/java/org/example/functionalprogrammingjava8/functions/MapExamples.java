package org.example.functionalprogrammingjava8.functions;

import java.util.Map;
import java.util.stream.Collectors;

public class MapExamples {
    public static void main(String[] args) {

        System.out.println("=============Before the Switch Map key and Value==========================");
        Map<String, String> animals = Map.of("dog", "wolf descrendant", "cat", "feline with nine lives", "rat", "rodent with long tail", "rabbit", "pet", " mousse", "pet");

        animals.forEach((k, v) -> System.out.println(k + " -> " + v));

        System.out.println();
        System.out.println("============= After Switch Map key and Value==========================");
        Map<String, String> switched = animals.entrySet() // entrySet() : Transforme la Map en un Set<Map.Entry<K,V>>
                .stream() // Crée un flux d’entrées: (Stream<Map.Entry<K,V>>)
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey,
                        (v1, v2) -> v1 + "," + v2 // On utilise mergeFunction si on a 2 clés identiques dans la Map pour concaténer la valeur des clés:Ici, quand on inverse clé/valeur, on aurait deux fois "pet" comme nouvelle clé ❌ → cela cause une IllegalStateException.
                )); // .collect(Collectors.toMap(...): Construit une nouvelle Map à partir des éléments transformés

        switched.forEach((k, v) -> System.out.println(k + " -> " + v));
    }
}
