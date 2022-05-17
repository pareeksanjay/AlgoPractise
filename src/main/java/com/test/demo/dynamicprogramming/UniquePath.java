package com.test.demo.dynamicprogramming;

import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int m = 3, n = 7;

        System.out.println(uniquePaths(m - 1, n - 1));
    }

    public static int uniquePaths(int m, int n) {
//base
        if (m < 0 || n < 0) {
            return 0;
        } else if (m == 0 || n == 0) {
            return 1;
        } else {
            return uniquePaths(m - 1, n) + uniquePaths(m, n - 1);

        }
    }
    /*
    class Solution {
  public int uniquePaths(int m, int n) {
    return uniquePathsHelper(m - 1, n - 1, new int[n][m]);
  }

  private int uniquePathsHelper(int m, int n, int[][] memo) {
    if (m < 0 || n < 0) {
      return 0;
    } else if (m == 0 || n == 0) {
      return 1;
    } else if (memo[n][m] > 0) {
      return memo[n][m];
    } else {
      memo[n][m] = uniquePathsHelper(m - 1, n, memo) + uniquePathsHelper(m, n - 1, memo);
      return memo[n][m];
    }
  }
}
     */

}
