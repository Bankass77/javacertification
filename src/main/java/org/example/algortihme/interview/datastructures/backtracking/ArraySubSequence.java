package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
Étant donné un tableau d'entiers, trouver toutes les sous-séquences croissantes
 distinctes de longueur deux ou plus.
Par exemple,
Input: [2, 4, 5, 4]
Output: [[2, 4, 5], [2, 5], [2, 4], [4, 5]]

Input: [3, 2, 1]
Output: []
 */
public class ArraySubSequence {

    /**
     * @param nums   le tableau à parcourrir pour générer des sous-sequences a au moins deux éléments.
     * @param result une liste pour stocker toutes les sous-sequences valides.
     * @param stack  représente la sous-sequence courante en construction. Contient les sous-sequences en construction
     * @param start  représente l'index de départ à partir duquelon continue à explorer les élements de nums.
     */
    public void generateSubSeq(int[] nums, int start, Set<List<Integer>> result, Deque<Integer> stack) {

        // Condition d'arrêt de la recursivité : si la taille de la sous-sequence current est d'au moins 2, elle est ajoutée à result.
        if (start == nums.length) {
            if (stack.size() >= 2) {
                result.add(new ArrayList<>(stack));
            }
        }
        for (int i = start; i < nums.length; i++) {
            if (stack.isEmpty() || stack.peekLast() < nums[i]) {
                stack.push(nums[i]);
                generateSubSeq(nums, i + 1, result, stack);
                stack.pop();
            }
        }
    }

    public Set<List<Integer>> subsets(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Deque<Integer> stack = new LinkedList<>();
        generateSubSeq(nums, 0, result, stack);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 4};
        ArraySubSequence arraySubSet = new ArraySubSequence();
        System.out.println(arraySubSet.subsets(nums));
    }
}
