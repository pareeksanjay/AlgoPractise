package com.test.demo.string;

public class InterleavingString {

    public static void main(String[] args) {
        String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc";
        System.out.println(isInterleave(s1, s2, s3));
    }

    private static boolean isInterleave(String s1, String s2, String s3) {
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }

        return is_InterLeave(s1, 0, s2, 0, "", s3);
    }

    private static boolean is_InterLeave(String s1, int i, String s2, int j, String res, String s3) {
        //base condition
        if (res.equals(s3) && i == s1.length() && j == s2.length()) {
            return true;
        }
        boolean ans = false;

        if (i < s1.length()) {
            ans = is_InterLeave(s1, i + 1, s2, j, res + s1.charAt(i), s3);
        }

        if (j < s2.length()) {
            ans |= is_InterLeave(s1, i, s2, j + 1, res + s2.charAt(j), s3);
        }

        return ans;

    }


}
