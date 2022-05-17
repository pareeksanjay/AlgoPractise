package com.test.demo.arrays;

import java.util.ArrayList;
import java.util.List;

/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen

numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at

least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtracking(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    private static void backtracking(int index, int[] candidates, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {

        int n = candidates.length;
        //base case
        if (index == n) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (candidates[index] <= target) {
            ds.add(candidates[index]);
            backtracking(index, candidates, target - candidates[index], ans, ds);
            ds.remove(ds.size() - 1);
        }

        backtracking(index + 1, candidates, target, ans, ds);

    }
}
