package com.test.demo.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        String s = "cbacdcbc";
        System.out.println(removeDuplicateLetters(s));

    }
    public static String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] exist = new boolean[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            freq[c-'a']--;
            if(exist[c-'a']) continue;

            while(stack.size()>0 && stack.peek()>c && freq[stack.peek()-'a']>0){
                exist[stack.pop()-'a'] = false;
            }
            stack.push(c);
            exist[c-'a'] = true;
        }
        char[] ans =new char[stack.size()];
        int idx = stack.size() - 1;
        while(stack.size() > 0){
            ans[idx] = stack.pop();
            idx--;
        }
        return new String(ans);
    }
}
