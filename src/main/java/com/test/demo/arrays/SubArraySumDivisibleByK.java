package com.test.demo.arrays;
/*
* Given an array nums of integers,
*  return the number of (contiguous, non-empty)
*  subarrays that have a sum divisible by k.*/
public class SubArraySumDivisibleByK {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        int count=findSubArrayCount(nums,k);
        System.out.println(count);
    }

    private static int findSubArrayCount(int[] nums, int k) {
        int[] dp=new int[k+1];
        dp[0]=1;
        int sum=0;
        int count=0;
        for(int num:nums){


            sum+=num;

            //edge case
            while(sum<0){
                sum+=k;
            }
            count+=dp[sum%k];

            ++dp[sum%k];

        }

        return count;
    }
}
