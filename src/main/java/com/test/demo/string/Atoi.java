package com.test.demo.string;

/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
 */
public class Atoi {
    public static void main(String[] args) {
String s="-";
        System.out.println(myAtoi(s));
     }

    private static int myAtoi(String s){
        int len = s.length();
        int cur = 0;
        // Step1: ignore the leading whitespaces
        while (cur < len && s.charAt(cur) == ' ') {
            cur++;
        }
        // Step2: sign
        int sign = 1;
        if (cur < len && (s.charAt(cur) == '-' || s.charAt(cur) == '+')) {
            if (s.charAt(cur) == '-') {
                sign = -1;
            }
            cur++;
        }
        // Step3: read all the continuous digit characters and build the integer
        int integer = 0;
        while (cur < len && s.charAt(cur) - '0' >= 0 && s.charAt(cur) - '0' <= 9 ) {
            int digit = s.charAt(cur++) - '0';
            // Overflow
            if (integer > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            integer = integer * 10 + digit;
        }
        return integer * sign;

    }

}
