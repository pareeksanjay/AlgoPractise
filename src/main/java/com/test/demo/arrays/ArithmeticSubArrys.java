package com.test.demo.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubArrys {
    public static void main(String[] args) {

        int[] nums = {4, 6, 5, 9, 3, 7}, l = {0, 0, 2}, r = {2, 3, 5};
        List<Boolean> result = checkArithmeticSubarrays(nums, l, r);

        System.out.println(result);
    }


    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<List<Integer>> listOfRanges = new ArrayList<>();
        List<Boolean> list = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            List<Integer> range = new ArrayList<>();
            range.add(l[i]);
            range.add(r[i]);
            listOfRanges.add(range);
        }

        for (List<Integer> currentRange : listOfRanges) {
            int current_start = currentRange.get(0);
            int current_end = currentRange.get(1);


            int[] tempArray = Arrays.copyOfRange(nums, current_start, current_end + 1);
            Arrays.sort(tempArray);
            int diff = Math.abs(tempArray[1] - tempArray[0]);

            for (int i = 0; i < tempArray.length - 1; i++) {
                if (Math.abs(tempArray[i + 1] - tempArray[i]) == diff) {
                    if (i + 1 == tempArray.length - 1) {
                        list.add(true);
                    }
                } else {
                    list.add(false);
                    break;
                }
            }

        }

        return list;
    }
}
