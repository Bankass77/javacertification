package org.example.algortihme;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharcaterCount2 {

    public static Map<Character, Long> countCharcter(String str) {
        return  str.chars() // Convert string to a stream of char values (int)
                .mapToObj(c -> (char)c) // Convert int values back to chars
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        String str = "iFollowMilindMehta";
        System.out.println(countCharcter(str));

    }
}
