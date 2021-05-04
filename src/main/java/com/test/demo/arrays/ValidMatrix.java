package com.test.demo.arrays;

import java.util.Arrays;

public class ValidMatrix {
    public static void main(String[] args) {
        int[] rowSum = {5, 7, 10};
        int[] columnSum = {8, 6, 8};
        System.out.println(Arrays.deepToString(restoreMatrix(rowSum, columnSum)));
    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int p;
        int q;
        int[][] answer;
        int i = 0;
        int j = 0;
        p = rowSum.length;
        q = colSum.length;
        answer = new int[p][q];
        while (i < p && j < q) {
            answer[i][j] = Math.min(rowSum[i], colSum[j]);
            rowSum[i] -= answer[i][j];
            colSum[j] -= answer[i][j];
            if (rowSum[i] == 0)
                i++;
            if (colSum[j] == 0)
                j++;
        }
        return answer;
    }
}
