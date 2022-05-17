package com.test.demo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class Sum3 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0};
        System.out.println("value is:"+threeSum(nums)); //O(n^2)
    }

/*    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
       Arrays.sort(nums); //O(nlogn)

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    while (left<nums.length&&nums[left-1] == nums[left]) {
                        left++;
                    }
                }

            }


        }

        return result;

    }*/

    public static List<List<Integer>> threeSum(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        List<List<Integer>> totalSum = new ArrayList<>();
        List<Integer> sum = new ArrayList<>();
        while (left < right) {
            int pivot = (left + right) / 2;
            if (left < pivot && right > pivot && (nums[left] + nums[pivot]) == Math.abs(nums[right])) {
                sum.add(nums[left]);
                sum.add(nums[right]);
                sum.add(nums[pivot]);
                totalSum.add(sum);
            } else {
                left++;
                right--;
            }

        }
        return totalSum;

    }

}
