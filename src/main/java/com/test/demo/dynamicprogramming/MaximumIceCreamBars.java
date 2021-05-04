package com.test.demo.dynamicprogramming;
/*
It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n,
where costs[i] is the price of the ith ice cream bar in coins.
The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible.

Return the maximum number of ice cream bars the boy can buy with coins coins.

Note: The boy can buy the ice cream bars in any order.
 */
import java.util.Arrays;

public class MaximumIceCreamBars {

    public static void main(String[] args) {
        int[] costs = {10,2,10,10,10,10,8,2,7,8};
        int coins = 25;
        int iceCreamBar = maxIceCream(costs, coins);
        System.out.println(iceCreamBar);
    }

    public static int maxIceCream(int[] costs, int coins) {
        int count =  0;
        Arrays.sort(costs);
        for (int cost : costs) {
            if (cost <= coins) {
                coins -=cost;
                count++;
            }
        }
        return count;
    }
}
