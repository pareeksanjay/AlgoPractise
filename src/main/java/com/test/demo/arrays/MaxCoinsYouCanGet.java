package com.test.demo.arrays;
/*
There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:

In each step, you will choose any 3 piles of coins (not necessarily consecutive).
Of your choice, Alice will pick the pile with the maximum number of coins.
You will pick the next pile with maximum number of coins.
Your friend Bob will pick the last pile.
Repeat until there are no more piles of coins.
Given an array of integers piles where piles[i] is the number of coins in the ith pile.

Return the maximum number of coins which you can have

 */
import java.util.Arrays;

public class MaxCoinsYouCanGet {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 1, 2, 3, 4};
        System.out.println(maxCoins(arr));
    }

    public static int maxCoins(int[] piles) {
        Arrays.sort(piles); //n(nlogn)
        int pilesToChoose = piles.length / 3, coins = 0;
        int j = 0;
        int i = piles.length - 2;
        while (j++ < pilesToChoose) {
            coins += piles[i];
            i -= 2;
        }
        return coins;
    }
}
