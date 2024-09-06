package org.example.algortihme.interview.datastructures.backtracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BacktrackingDemo {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        dfs(nums, 0, new LinkedList<>(), res);
        return res;
    }

    public void dfs(int[] nums, int index, List<Integer> currentList, List<List<Integer>> result) {

        result.add(new ArrayList<>(currentList));

        for (int val = index; val < nums.length; val++) {

            currentList.add(nums[val]);
            dfs(nums, val + 1, currentList, result);

            currentList.remove(currentList.size() - 1);
        }
    }

    public static void main(String[] args) {

        BacktrackingDemo demo = new BacktrackingDemo();

        int[] nums = {1, 2, 3};
        List<List<Integer>> res = demo.subsets(nums);
        System.out.println(res);
    }
}
