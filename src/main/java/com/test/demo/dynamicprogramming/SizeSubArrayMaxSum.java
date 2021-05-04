package com.test.demo.dynamicprogramming;

public class SizeSubArrayMaxSum {

    public static void main(String[] args) {
        int[] array = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = array.length;
        if (n < 2) {
            System.out.println(array[0]);
        }
        int currSum = 0;
        int overAllSum = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = 0;
        int s=0;
        for (int i = 0; i < n; i++) {

            currSum += array[i];

            if (currSum > overAllSum) {
                overAllSum = currSum;
                endIndex = i;
                startIndex=s;
            }

            if (currSum < 0) {
                currSum = 0;
                s = i + 1;
            }

        }

        System.out.println("Largest Sum: " + overAllSum + ": size: " + (endIndex - startIndex + 1));

    }
}
