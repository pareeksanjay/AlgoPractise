package com.test.demo.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUserActiveMinutes {

    public static void main(String[] args) {
        int[][] logs = {{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}};
        int k = 5;
        Map<Integer, Set<Integer>> mp = new HashMap<>();
        int[] res = new int[k];

        for (int[] log : logs) {
            int id = log[0];
            int time = log[1];
            if (mp.containsKey(id)) {
                Set<Integer> timeset = mp.get(id);
                timeset.add(time);
            } else {
                Set<Integer> timeset = new HashSet<>();
                timeset.add(time);
                mp.put(id, timeset);
            }
        }
        for (int id : mp.keySet()) {
            int idx = mp.get(id).size();
            res[idx - 1]++;
        }

        for (int i : res) {
            System.out.print(i);
        }
    }
}
