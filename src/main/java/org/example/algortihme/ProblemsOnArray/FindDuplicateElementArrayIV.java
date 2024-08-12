package org.example.algortihme.ProblemsOnArray;

import java.util.stream.IntStream;

/*
Finally, the post is incomplete without this textbook solution:
find the sum of all element and find the difference between it and all elements
which are supposed to be there.
 */
public class FindDuplicateElementArrayIV {

    public static int duplicate(int[] arr) {
        int actual_sum = IntStream.of(arr).sum();
        int expected_sum = arr.length * (arr.length - 1) / 2;
        return actual_sum - expected_sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 4 };
        System.out.println( "L'élément en doublon est: " +duplicate(nums));
    }
}
