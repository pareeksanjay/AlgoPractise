package com.test.demo.arrays;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int[] A = {50, 20, 19, 45, 10, 56, 92};
        int low = 0;
        int high =A.length - 1;
        quickSort(A, low, high);
        System.out.println(Arrays.toString(A));

    }

    private static void quickSort(int[] A, int low, int high) {
        if (high > low) {
            int pivot = partition(A, low, high);
            quickSort(A, low, pivot - 1);
            quickSort(A, pivot + 1, high);
        }
    }

    private static int partition(int[] A, int low, int high) {
        int pivot = A[low];
        int left = low;
        int right = high;
        while (left < right)
        {
            while (A[left] <= pivot) {
                left++;
            }

            while (A[right]>pivot) {
                right--;
            }
            if (left < right) {
                swap(A, left, right);
            }
        }
        A[low] = A[right];
        A[right]=pivot;
        return right;
    }

    private static void swap(int[] a, int left, int right) {
      /*  int temp = 0;
        a[temp] = a[left];
        a[left] = a[right];
        a[right] = a[temp];*/
        a[left]=a[left]^a[right];
        a[right]=a[left]^a[right];
        a[left]=a[left]^a[right];
    }
}
