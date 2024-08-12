package org.example.algortihme.ProblemsOnArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumWithHashMap {

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;

        int[] nums3 = { 3, 3 };
        int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.print(Arrays.toString(twoSum(nums2, target2)));
        System.out.println("\n" + Arrays.toString(twoSum(nums3, target3)));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if(map.containsKey(complement)) {

                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }
        return nums;
    }

}
