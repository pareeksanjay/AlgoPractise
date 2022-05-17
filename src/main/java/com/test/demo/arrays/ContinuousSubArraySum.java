package com.test.demo.arrays;
/*
Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two

whose elements sum up to a multiple of k, or false otherwise.

An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.

*/

import java.util.HashSet;
import java.util.Set;

public class ContinuousSubArraySum {
    public static void main(String[] args) {
        int[] nums = {1,0};
        int k = 2;
        boolean result = ifContinuousSum(nums, k);
        System.out.println(result);
    }

    private static boolean ifContinuousSum(int[] nums, int k) {
        int sum=0;
        int last=0;

        Set<Integer> dp=new HashSet<>();

        for (int num : nums) {

            sum += num;
            int remainder = sum % k;
            if (dp.contains(remainder)) return true;
            dp.add(last);
            last = remainder;
            sum = remainder;
        }

        return false;
    }
}
