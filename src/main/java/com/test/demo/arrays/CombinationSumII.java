package com.test.demo.arrays;
/*
Given a collection of candidate numbers (candidates) and a target number (target),

find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.
 */

import java.util.*;

public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> result = combinationSum2(candidates, target);
        System.out.println(result);
    }

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(candidates, 0, target, new ArrayList<Integer>(), result);
        return result;
    }

    private static void findCombination(int[] candidates, int index, int target, ArrayList<Integer> ds, List<List<Integer>> result) {
        //base case
        if (target == 0) {
            result.add(new ArrayList<>(ds));
            return;
        }

        if (target < 0) return;

        for (int i = index; i < candidates.length; i++) {

            if (i == index || candidates[i] != candidates[i - 1]) {
                ds.add(candidates[i]);
                findCombination(candidates, i + 1, target - candidates[i], ds, result);
                ds.remove(ds.size() - 1);
            }

        }


    }
}
