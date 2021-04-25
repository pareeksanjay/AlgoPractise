package com.test.demo;

public class FindCommonElementsThreeArray {

    public static void main(String[] args) {
        int[] arr1 = {5, 15, 20, 25,40, 80}; //only for sorted array
        int[] arr2 = {10, 39, 40, 80, 90, 99};
        int[] arr3 = {8, 40, 45, 80, 85, 95};
        commonElements(arr1, arr2, arr3);
    }

    public static int[] commonElements(int[] arr1, int[] arr2, int[] arr3) {

        int x = 0;
        int y = 0;
        int z = 0;
        while ((x < arr1.length) && (y < arr2.length) && (z < arr3.length)) {
            if (arr1[x] == arr2[y] && arr2[y] == arr3[z]) {
                System.out.print(arr1[x]+" ");
                x++;
                y++;
                z++;
            } else if (arr1[x] > arr2[y]) {
                y++;
            } else if (arr2[y] > arr3[z]) {
                z++;
            } else {
                x++;
            }
        }
        return arr1;
    }

}
