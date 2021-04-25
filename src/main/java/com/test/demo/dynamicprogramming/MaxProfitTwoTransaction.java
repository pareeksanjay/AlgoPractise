package com.test.demo.dynamicprogramming;

/*
In daily share trading, a buyer buys shares in the morning and sells them on the same day. If the trader is allowed to make at most 2 transactions in a day,
whereas the second transaction can only start after the first one is complete (Sell->buy->sell->buy).
Given stock prices throughout the day, find out the maximum profit that a share trader could have made.
 */
public class MaxProfitTwoTransaction {
    public static void main(String[] args) {
        int[] arr = {10, 22, 5, 75, 65, 80};
        int n = arr.length;

        //traverse left to right to get max profit by selling
        int maxProfitInstantBySell = 0;
        int leastSoFar = arr[0];
        int[] dpMaxProfitBySell = new int[arr.length];

        for (int i = 1; i < n; i++) {
            if (arr[i] < leastSoFar) leastSoFar = arr[i];
            maxProfitInstantBySell = arr[i] - leastSoFar;

            dpMaxProfitBySell[i] = Math.max(maxProfitInstantBySell, dpMaxProfitBySell[i - 1]);
        }

        //traverse right to left to get max profit by buying
        int maxProfitInstantByBuy = 0;
        int maxSoFar = arr[n - 1];
        int[] dpMaxProfitByBuy = new int[arr.length];

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxSoFar) {
                maxSoFar = arr[i];
            }

            maxProfitInstantByBuy = maxSoFar - arr[i];

            dpMaxProfitByBuy[i] = Math.max(maxProfitInstantByBuy, dpMaxProfitByBuy[i + 1]);

        }

        //calculate overall profit

        int op = 0;
        for (int i = 0; i < n; i++) {
            if (dpMaxProfitBySell[i] + dpMaxProfitByBuy[i] > op) {
                op = dpMaxProfitBySell[i] + dpMaxProfitByBuy[i];
            }
        }
        System.out.println(op);
    }

}
