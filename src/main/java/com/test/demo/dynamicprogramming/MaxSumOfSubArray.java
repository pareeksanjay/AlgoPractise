package com.test.demo.dynamicprogramming;
/*
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers that has the largest sum.
Kadane's Algorithm
 */
public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int currSum=arr[0];
        int overAllSum=arr[0];
        for(int i=1;i<n;i++){
            if(currSum>=0){
                currSum=currSum+arr[i];
            }else {
                currSum=arr[i];
            }
            if(currSum>overAllSum){
                overAllSum=currSum;
            }
        }


        System.out.println(overAllSum);
    }

}
