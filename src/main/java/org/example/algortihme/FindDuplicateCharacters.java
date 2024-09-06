package org.example.algortihme;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {

    public Map<Character, Long> findDuplicateCharacters(String word) {
        return word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static void main(String[] args) {

        FindDuplicateCharacters findDuplicateCharacters = new FindDuplicateCharacters();
        String input = "iFollowMilindMehta";

        Map<Character, Long> duplicates= findDuplicateCharacters.findDuplicateCharacters(input);
        System.out.println(duplicates);
    }
}
