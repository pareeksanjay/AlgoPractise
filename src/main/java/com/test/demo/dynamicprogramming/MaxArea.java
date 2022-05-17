package com.test.demo.dynamicprogramming;

public class MaxArea {

    public static void main(String[] args) {
        int[] h={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(h));
    }
    private static int maxArea(int[] height) {
        int maxArea=Integer.MIN_VALUE;
        int leftIndex=0;
        int rightIndex=height.length-1;

        while (leftIndex<rightIndex){

            maxArea=Math.max(maxArea,(rightIndex-leftIndex)*Math.min(height[rightIndex],height[leftIndex]));

            if(height[leftIndex]<height[rightIndex]){
                leftIndex++;
            }else {
                rightIndex--;
            }

        }

        return maxArea;

    }
}
