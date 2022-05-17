package com.test.demo.string;

import com.sun.xml.internal.ws.util.StringUtils;

/*
Given an integer, convert it to a roman numeral.
 */
public class NumberToRomanNumber {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
    }

    private static String intToRoman(int num) {
        int[] keys = new int[] {1000, 900, 500, 400, 100,  90,    50, 40,  10,     9,  5,  4,      1};
        String[] symbols = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int i = 0;
        int repeat = 0;
        StringBuilder result=new StringBuilder(keys.length);
        while (i < keys.length){
            if (num >= keys[i]) {
                repeat = num / keys[i]; //how many times keys[i]
                num = num % keys[i]; //remainder

                    result.append(symbols[i]).append(symbols[i]).append(symbols[i]);
            }
            else
                i++;
        }
        return result.toString();
    }


}
