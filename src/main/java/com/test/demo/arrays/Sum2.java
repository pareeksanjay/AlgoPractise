package com.test.demo.arrays;

import java.util.HashMap;
import java.util.Map;

public class Sum2 {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int target = 9;
        int[] sum=sumOfTwoNumbers(num,target);

        for(int i:sum){
            System.out.println(i);
        }
    }

    private static int[] sumOfTwoNumbers(int[] num, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {

            int complement = target - num[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};

            } else {
                map.put(num[i], i);
            }

        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
