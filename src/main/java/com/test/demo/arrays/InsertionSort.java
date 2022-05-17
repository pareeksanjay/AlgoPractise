package com.test.demo.arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
      int[] a={3,1,-2,7,0};
      /*    int n=a.length;
        int temp,j;
        for(int i=1;i<n;i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
    for (int arr:a){
        System.out.print(arr+" ");
    }*/
        for(int i=0;i< a.length;i++){
            int j=i;int temp=a[i];
            while (j>0&& a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        System.out.print(Arrays.toString(Arrays.stream(a).toArray()));
    }

























}
