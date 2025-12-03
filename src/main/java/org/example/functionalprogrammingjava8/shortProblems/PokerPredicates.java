package org.example.functionalprogrammingjava8.shortProblems;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PokerPredicates {


    //Mapping des valeurs
    private static final Map<String, Integer> FACES_VALUES = Map.ofEntries(
            Map.entry("2", 2),
            Map.entry("3", 3),
            Map.entry("4", 4),
            Map.entry("5", 5),
            Map.entry("6", 6),
            Map.entry("7", 7),
            Map.entry("8", 8),
            Map.entry("9", 9),
            Map.entry("10", 10),
            Map.entry("Jack", 11),
            Map.entry("Queen", 12),
            Map.entry("King", 13),
            Map.entry("Ace", 14)
    );

    public static final Predicate<PokerHand> isFlush = pokerHand -> pokerHand.cards().stream().map(Card::suit).distinct().count() == 1;

    public static final Predicate<PokerHand> isStraight = pokerHand -> {

        List<Integer> values = pokerHand.cards().stream().map(card -> FACES_VALUES.get(card.face())).sorted().toList();

        for (int i = 0; i < values.size() - 1; i++) {

            if (values.get(i + 1) != values.get(i) + 1) {

                return false;
            }

        }
        return true;
    };

    public static final Predicate<PokerHand> isFullHome = pokerHand -> {
        Map<String, Long> counts = pokerHand.cards().stream().collect(Collectors.groupingBy(Card::face, Collectors.counting()));
        return counts.containsValue(3L) && counts.containsValue(2L);
    };

}
