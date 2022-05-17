package com.test.demo;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

import static java.util.Arrays.stream;

public class ArraySortSimilarNumbers {

    public static void main(String[] args) {
        int[] a = {2, 0, 1, 0, 2, 1, 0};
        //sortNumberSimple(a);
        //sortArraySingleTraversal(a);
        customSort(a);
        for (int number : a) {
            System.out.print(number + " ");
        }

    }

    private static int[] swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        return array;
    }
    private static int[] swapWithoutUsingVariable(int[] array, int start, int end) {
        /*array[end]=array[start]+array[end]; //1
        array[end] = array[start]; //1
        array[start] =array[end]-array[start];*/
        array[start]=array[start]^array[end];
        array[end]=array[start]^array[end];
        array[start]=array[start]^array[end];

        return array;
    }

    // Function to efficiently sort an array with many duplicated values
    public static void customSort(int[] arr)
    {
        // create an empty `TreeMap` to store the frequency of array elements
        Map<Integer, Integer> freq = new TreeMap<>();

        // store distinct values in the input array as keys and
        // their respective counts as values
        stream(arr).forEach(i -> freq.put(i, freq.getOrDefault(i, 0) + 1));

        // sort the map according to its keys' natural ordering

        // since we have used `TreeMap` instead of `HashMap`,
        // keys are already sorted by default

        // traverse the sorted map and overwrite the input array with sorted elements
        int i = 0;
        for (Map.Entry<Integer,Integer> entry: freq.entrySet())
        {
            Integer value = entry.getValue();
            while (value-- > 0) {
                arr[i++] = entry.getKey();
            }
        }
    }


    private static void sortNumberSimple(int[] array) {

        int zerosCount = 0;
        int onesCounts = 0;

        for (int a : array) {
            if (a == 0) zerosCount++;
            if (a == 1) onesCounts++;
        }

        IntStream.range(0, zerosCount).forEach(i -> array[i] = 0);
        IntStream.range(zerosCount, (zerosCount + onesCounts)).forEach(i -> array[i] = 1);

        IntStream.range(zerosCount + onesCounts, array.length).forEach(i -> array[i] = 2);

    }

    private static void sortArraySingleTraversal(int[] array) {
        int start = 0;
        int mid = 0;
        int high = array.length-1; //6


        while (mid <= high) {

            switch (array[mid]) {  //{2, 0, 1, 0, 2, 1, 0}; ,{0,0,1,0,2,1,2}

                case 0:
                    swapWithoutUsingVariable(array, start, mid); // {0,0,1,0,2,1,2}
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swapWithoutUsingVariable(array, mid, high);  // {0,0,1,0,2,1,2}
                    high--; // 5
                    break;
                default:
                    return;


            }


        }


    }

}
