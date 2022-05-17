package com.test.demo.string;

public class LongestPalindrome {
    int resultStart;
    int resultLength;

    public static void main(String[] arg) {
        String lpsString = "babad";
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        System.out.println(longestPalindrome.longestPalindrome(lpsString));
    }

    public String longestPalindrome(String lpsString) {

        for (int i = 0; i < lpsString.length(); i++) {
            expandAroundCenter(lpsString, i, i);  //odd len
            expandAroundCenter(lpsString, i, i + 1); //even len
        }
        return lpsString.substring(resultStart, resultStart + resultLength);
    }

    private void expandAroundCenter(String lpsString, int left, int right) {
        while (left >= 0 && right < lpsString.length() && lpsString.charAt(left) == lpsString.charAt(right)) {
            left--;
            right++;
        }
        if (resultLength < right - left - 1) {
            resultStart = left + 1;
            resultLength = right - left - 1;
        }
    }

}
