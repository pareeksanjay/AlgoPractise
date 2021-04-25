package com.test.demo.dynamicprogramming;

public class MaxProfitSingleTransaction {

    public static void main(String[] args) {
        int[] arr = {10, 22, 5, 75, 65, 80};
        int n = arr.length;
        int leastSoFar = Integer.MAX_VALUE;
        int profitInstant;
        int overAllProfit = 0;
        for (int i = 0; i < n; i++) {
            if (leastSoFar > arr[i]) {
                leastSoFar = arr[i];
                profitInstant = arr[i] - leastSoFar;
            } else profitInstant = arr[i] - leastSoFar;

            if (profitInstant > overAllProfit) {
                overAllProfit = profitInstant;
            }

        }
        System.out.println(overAllProfit);
    }
}
