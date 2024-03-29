package com.test.demo.string;

import java.util.*;

/*Given an encoded string, return its decoded string.

The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.

Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].*/
public class DecodeString {

    public static void main(String[] args) {
        Map<String,String> map =new HashMap<>();
        String s="3[a]2[bc]";
        Stack<Integer> counts = new Stack();
        Stack<String> result = new Stack();
        StringBuilder rs = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(Character.isDigit(s.charAt(i))){
                StringBuilder sb = new StringBuilder();
                while(Character.isDigit(s.charAt(i))){
                    sb.append(s.charAt(i++));
                }
                counts.push(Integer.parseInt(sb.toString()));
            }else if(s.charAt(i) == '['){
                result.push(rs.toString());
                rs = new StringBuilder();
                i++;
            }else if(s.charAt(i) == ']'){
                StringBuilder sb = new StringBuilder(result.pop());
                int count = counts.pop();
                while(count-- > 0){
                    sb.append(rs);
                }
                rs = new StringBuilder(sb);
                i++;
            }else{
                rs.append(s.charAt(i++));
            }
        }
        System.out.println(rs);
    }


}
