package com.test.demo.string;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses {

    public static void main(String[] args) {
        String s = "25525511135";
        System.out.println(restoreIpAddresses(s));
    }

    public static List<String> restoreIpAddresses(String s) {
        List<String> output = new ArrayList<>();
        // it can't be an IP
        if (s.length() > 12) return output;

        backtrack(s, new ArrayList<>(), -1, output);
        return output;
    }

    private static void backtrack(String s, List<String> current, int pos, List<String> output) {
        // if we reached to 4 valid parts, this is either a solution or it will never lead to one
        if (current.size() == 4) {
            if (pos == s.length() - 1) {
                // all chars included, this is a solution
                output.add(String.join(".", current));
            }
            // it will never lead to a solution - we are out os space for the rest of chars
            return;
        }
        for (int i = pos + 1; i < s.length(); i++) {
            String part = s.substring(pos + 1, i + 1);
            // add valid parts and backtrack until found the right ones
            if (isValid(part)) {
                current.add(part);
                backtrack(s, current, i, output);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isValid(String part) {
        // no longer than 3 chars
        if (part.length() > 3) return false;
        // can only start with '0' if it's a single digit
        if (part.charAt(0) == '0') return part.length() == 1;
        int val = Integer.parseInt(part);
        // cannot be less than 0 or larger than 255
        return val > 0 && val <= 255;
    }
}
