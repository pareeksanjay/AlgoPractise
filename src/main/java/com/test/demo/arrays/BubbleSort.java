package com.test.demo.arrays;

/*
Bubble sorting algorithm
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 15, 1, 24, 13, 4};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < n - 1 - i; j++) {  //you cn iterate the array to n-1-i times because
                // max element is already sorted to right
                int a = arr[j];
                int b = arr[j + 1];
                if (b < a) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    sorted = false;
                }
            }
            if (sorted) {
                break;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
