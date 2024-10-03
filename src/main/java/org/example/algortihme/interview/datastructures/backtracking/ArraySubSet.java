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
public class ArraySubSet {

    /**
     * @param nums    le tableau à parcourrir pour générer des sous-sequences a au moins deux éléments.
     * @param result  une liste pour stocker toutes les sous-sequences valides.
     * @param current représente la sous-sequence courante en construction. Contient les sous-sequences en construction
     * @param start   représente l'index de départ à partir duquelon continue à explorer les élements de nums.
     */
    public void generateSubSeqCombinaison(int[] nums, Set<List<Integer>> result, Deque<Integer> current, int start) {
        // Condition d'arrêt si la taille de la sous-sequence current est d'au moins 2, elle est ajoutée à result.
        if (current.size() >= 2) {
            result.add(new ArrayList<>(current));
        }

        for (int i = start; i < nums.length; i++) {
            if (current.isEmpty() || nums[i] > current.peekLast()) {
                current.addLast(nums[i]);
                generateSubSeqCombinaison(nums, result, current, i + 1);
                current.removeLast();
            }
        }
    }

    public Set<List<Integer>> findSubsequence(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        generateSubSeqCombinaison(nums, result, new LinkedList<>(), 0);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 4};
        ArraySubSet arraySubSet = new ArraySubSet();
        System.out.println(arraySubSet.findSubsequence(nums));
    }
}
