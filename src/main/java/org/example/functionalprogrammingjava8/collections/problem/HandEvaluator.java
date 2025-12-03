package org.example.functionalprogrammingjava8.collections.problem;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
// Analyse une main
public class HandEvaluator {
    static boolean isFlush(Set<Card> cards) {
        Suit first = cards.iterator().next().getSuit();

        return cards.stream().allMatch(c -> c.getSuit() == first);
    }

    static boolean isStraight(Set<Card> cards) {

        List<Integer> values = cards.stream().map(c -> c.getRank().value).sorted().toList();
        int first = values.get(0);
        for (int i = 1; i < values.size(); i++) {

            if (values.get(i) != first + i) {
                return false;
            }
        }
        return true;
    }


    static boolean isFullHouse (Set<Card> cards){
        Map<Integer, Long> freq = cards.stream().collect(Collectors.groupingBy( c-> c.getRank().value, Collectors.counting()));
        return  freq.containsValue(3L) && freq.containsValue(2L);
    }
}
