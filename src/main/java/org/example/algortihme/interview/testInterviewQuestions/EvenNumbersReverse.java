package org.example.algortihme.interview.testInterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersReverse {
    public List<Integer> getEvenNumbersReversed(List<Integer> numbers) {
        Collections.reverse(numbers);

        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        EvenNumbersReverse evenNumbersReverse = new EvenNumbersReverse();
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> evenNumbersReversed = evenNumbersReverse.getEvenNumbersReversed(numbers);

        System.out.println(evenNumbersReversed);
    }
}
