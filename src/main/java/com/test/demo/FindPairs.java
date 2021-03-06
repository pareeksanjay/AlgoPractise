package com.test.demo;

public class FindPairs {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,8,9};
        int sum=9;
        int low=0;
        int high =arr.length-1;

    while (low<high){
        if(arr[low]+arr[high]>sum){
            high--;
        } else if (arr[low] + arr[high]<sum) {
            low++;
        }else if (arr[low]+arr[high]==sum){
            System.out.printf("Sum of %d: Pairs are: (%d,%d)%n", sum, arr[low], arr[high]);
            low++;
            high--;
        }
    }
    }
}
//time complexity n
//space complexity n