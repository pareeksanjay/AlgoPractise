package com.test.demo.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given a boolean 2D array of n x m dimensions where
each row is sorted. Find the 0-based index of the first
row that has the maximum number of 1’s*/
public class RowWithMax1s {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        int count=0;
        int[][] arr = {{0, 1, 1, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};


        for (int[] ints : arr) {
            if (ints[0] == 1) {
                count += ints[0];
            }
        }
        System.out.println(count);
    }
}
