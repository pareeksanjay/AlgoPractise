package com.test.demo.arrays;

public class HoldWater {

    public static void main(String[] args) {
        int[] list={32,0,12,82,32};
        int maxHeight = 0;
        int previousHeight = 0;
        int previousHeightIndex = 0;
        int collected = 0;
        int temp = 0;

        // find the first peak (all water before will not be collected)
        while(list[previousHeightIndex] > maxHeight) {
            maxHeight = list[previousHeightIndex];
            previousHeightIndex++;
            if(previousHeightIndex==list.length)            // in case of stairs (no water collected)
            System.out.println(collected);
            else
                previousHeight = list[previousHeightIndex];
        }

        for(int i = previousHeightIndex; i<list.length; i++) {
            if(list[i] >= maxHeight) {      // collect all temp water
                collected += temp;
                temp = 0;
                maxHeight = list[i];        // new max height
            }
            else {
                temp += maxHeight - list[i];
                if(list[i] > previousHeight) {  // we went up... collect some water
                    int collWater = (i-previousHeightIndex)*(list[i]-previousHeight);
                    collected += collWater;
                    temp -= collWater;
                }
            }

            // previousHeight only changes if consecutive towers are not same height
            if(list[i] != previousHeight) {
                previousHeight = list[i];
                previousHeightIndex = i;
            }
        }
        System.out.println(collected);
           }
}
