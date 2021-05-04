package com.test.demo.string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generate(n);
        for (String list : result) {
            System.out.println(list);
        }

    }

    private static List<String> generate(int n) {
        List<String> result = new ArrayList<>();
        findAll("(", 1, 0, result, n);
        return result;
    }

    private static void findAll(String current, int open, int close, List<String> result, int n) {

        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            findAll(current + "(", open + 1, close, result, n);
        }
        if (close < open) {
            findAll(current + ")", open, close + 1, result, n);
        }

    }
}
