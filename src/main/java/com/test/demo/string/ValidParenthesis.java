package com.test.demo.string;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "()[]{}";
        //System.out.println(isValidByHashMap(s));
        System.out.println(isValid(s));
    }

    public static boolean isValidByHashMap(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> closedToOpen = new HashMap<>();
        closedToOpen.put(')', '(');
        closedToOpen.put(']', '[');
        closedToOpen.put('}', '{');

        for (Character c : s.toCharArray()) {
            if (closedToOpen.containsKey(c)) {
                if (stack.isEmpty()) return false;
                if (stack.pop() != closedToOpen.get(c)) return false;
            } else {
                stack.add(c);
            }
        }

        return stack.isEmpty();
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character character : s.toCharArray()) {
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {

                if (stack.isEmpty()) return false;

                if (character == ')' && stack.peek() != '(') return false;

                if (character == ']' && stack.peek() != '[') return false;

                if (character == '}' && stack.peek() != '{') return false;

                stack.pop();

            }
        }

        return stack.isEmpty();

    }

}
