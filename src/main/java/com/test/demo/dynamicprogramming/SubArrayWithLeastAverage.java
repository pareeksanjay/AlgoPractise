package com.test.demo.dynamicprogramming;

public class SubArrayWithLeastAverage {
    public static void main(String[] args) {
        int[] arr = {3, 7, 90, 20, 10, 50, 40};
        int k = 2;
        int n = arr.length;
        int currSum = 0;
        int minSum;
        int resultIndex = 0;
        if (n < 2) {
            System.out.println(arr[0]);
        }

        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }
        minSum = currSum;

        for (int i = k; i < n; i++) {
            currSum +=arr[k] - arr[i - k];

            if (currSum < minSum) {
                minSum = currSum;
                resultIndex = (i - k + 1);
            }
        }
        System.out.println(resultIndex + "-->" + (resultIndex + k - 1));
    }
}
