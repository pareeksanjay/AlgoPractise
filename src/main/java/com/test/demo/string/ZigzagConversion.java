package com.test.demo.string;
/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 */

import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {

        String s = "PAYPALISHIRING";

        System.out.println(convert(s, 3));

    }

    private static String convert(String s, int numRows) {
        //base case

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        int minString = Math.min(numRows, s.length());

        for (int i = 0; i < minString; i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (Character c : s.toCharArray()) {
            rows.get(curRow).append(c);

            if (curRow == 0 || curRow == numRows - 1) {
                goingDown =!goingDown;
            }

            curRow+=goingDown?1:-1;

        }

        StringBuilder stringBuilder = new StringBuilder(s.length());

        for (StringBuilder row : rows) {
            stringBuilder.append(row);
        }

        return stringBuilder.toString();
    }

}
