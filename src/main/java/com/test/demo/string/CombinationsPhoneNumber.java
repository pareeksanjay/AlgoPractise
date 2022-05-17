package com.test.demo.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
* */
public class CombinationsPhoneNumber {
    public static void main(String[] args) {
        String digits = "23";
        List<String> res = letterCombinations(digits);
        System.out.println(res);
    }

    private static final char[][] MAPPINGS = {
            {}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};

    private static List<String> letterCombinations(String digits) {
        if (null == digits) {
             return Collections.emptyList();
        }

        List<String> result = new ArrayList<>();

        findCombination(0, new StringBuilder(), result, digits);

        return result;
    }

    private static void findCombination(int index, StringBuilder stringBuilder, List<String> result, String digits) {

        //base case

        if (index >= digits.length()) {
            result.add(stringBuilder.toString());
            return;
        }

        int digit = Character.getNumericValue(digits.charAt(index));

        for (char character : MAPPINGS[digit]) {
            stringBuilder.append(character);
            findCombination(index + 1, stringBuilder, result, digits);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }
    }
}

