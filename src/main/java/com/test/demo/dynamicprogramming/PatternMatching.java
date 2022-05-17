package com.test.demo.dynamicprogramming;

import java.util.Arrays;

/*
* Given an input string (s) and a pattern (p), implement wildcard pattern matching with
*  support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).*/
public class PatternMatching {
    public static void main(String[] args) {
        String s = "adceb";
        String p = "*a*b";
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        for (boolean[] r : dp) {
            Arrays.fill(r, true);
        }
        boolean ans = helper(s, p, 0, 0, dp);
        System.out.println(ans);
    }

    private static boolean helper(String s, String p, int i, int j, boolean[][] dp) {
        // base case
        if (j == p.length() && i == s.length()) {
            return true;
        }
        if (i == s.length()) {
            for (int k = j; k < p.length(); k++) {
                if (p.charAt(k) != '*') {
                    return false;
                }
            }
            return true;
        }
        if (j == p.length()) {
            return false;
        }
        if (!dp[i][j]) {
            return dp[i][j];
        }

        if ((p.charAt(j) == '?' || s.charAt(i) == p.charAt(j))) {
            return dp[i][j] = helper(s, p, i + 1, j + 1, dp);

        }

        if (p.charAt(j) == '*') {
            return dp[i][j] = helper(s, p, i, j + 1, dp) || helper(s, p, i + 1, j, dp);
        }
        return dp[i][j] = false;
    }

}
