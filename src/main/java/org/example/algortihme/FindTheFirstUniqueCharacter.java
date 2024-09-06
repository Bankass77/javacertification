package org.example.algortihme;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFirstUniqueCharacter {

    public Character findTheFirstUniqueCharacter(String str) {
        return str.chars()
                .mapToObj( c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }
}
