package com.test.demo.dynamicprogramming;

import java.util.Arrays;

/*
 * A child is running u a staircase with n steps ans can hop either 1 step, 2 step or 3 steps
 * at a time, Implement the method to count how many possible ways the child can run up the stairs
 * */
public class NumberOfSteps {

    public static void main(String[] args) {
        int n = 3;
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        int number = noOfWays(n, memo);
        System.out.println(number);
    }

    private static int noOfWays(int n, int[] memo) {
        //base case
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            return noOfWays(n - 1, memo) + noOfWays(n - 2, memo) + noOfWays(n - 3, memo);
        }


    }


}
