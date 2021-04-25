package com.test.demo;

public class RemoveRecursiveString {

    public static void main(String[] args) {
        String input = "careermonk";
        String output = removerRecursiveString(input);
        System.out.println(output);
    }

    private static String removerRecursiveString(String input) {
        int length = input.length();
        char[] inputChar = input.toCharArray();
        int skipString = -1;
        int i = 0;
        if (length < 2) {
            return input;
        }
        while (i < length) {
            if (skipString == -1 || inputChar[skipString] != inputChar[i]) {
                skipString++;
                inputChar[skipString] = inputChar[i];
            } else {
                while (i < length && inputChar[skipString] == inputChar[i]) {
                    i++;
                }
                skipString--;
            }

        }

        return String.valueOf(inputChar[skipString + 1]);
    }
}
