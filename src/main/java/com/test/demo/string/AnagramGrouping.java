package com.test.demo.string;

import java.util.*;

/*
* Given an array of strings strs, group the anagrams together.
* You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,

 typically using all the original letters exactly once.*/
public class AnagramGrouping {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        HashMap<String, List<String>> hm = new HashMap<>();
        String temp = "";
        char[] ct;

        for (String s : strs) {
            ct = s.toCharArray();
            Arrays.sort(ct);
            temp = String.valueOf(ct);

            if (hm.containsKey(temp)) {
                List<String> x = hm.get(temp);
                x.add(s);
                hm.put(temp, x);
            } else {
                List<String> y = new ArrayList<>();
                y.add(s);
                hm.put(temp, y);
            }

        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> set :
                hm.entrySet()) {
            ans.add(set.getValue());
        }
        System.out.println(ans);
    }
}
