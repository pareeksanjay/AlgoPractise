package com.test.demo.arrays;

/*
Share
Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
The answer is guaranteed to fit in a 32-bit integer.
 */
public class CombinationSumIV {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        int target = 10;
        System.out.println(combinationSum4(nums, target));
    }

    public static int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1];

        dp[0]=1;

        for(int i=0;i<=target;i++){

            for(int n:nums){
            if(i>=n){

                dp[i]+=dp[i-n];
            }
            }
        }
        return dp[target];
    }
}