package com.test.demo.arrays;

import java.util.ArrayList;

public class FindSumOfSubArrays {
    public static void main(String[] args) {

        int[] arr={
                135, 101, 170, 125, 79
        };

        ArrayList<Integer> res=FindSumOfSubArrays.subArraySum(arr,arr.length);

    for(Integer ii:res){
        System.out.print(ii+" ");
    }
    }

    static ArrayList<Integer> subArraySum(int[] arr, int n) {
        ArrayList<Integer> newArray=new ArrayList<>();
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i < n+1; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > 204 && start < i) {
                curr_sum = curr_sum - arr[start];
                start++;
            }
            // If curr_sum becomes equal to sum,
            // then return true
            if(curr_sum== 204){
                //int p=i-1;
                newArray.add(start+1);
                newArray.add(i);
                return newArray;
            }

            // Add this element to curr_sum
            curr_sum = curr_sum + arr[i];

        }
        newArray.add(-1);
        return newArray;
    }
}
