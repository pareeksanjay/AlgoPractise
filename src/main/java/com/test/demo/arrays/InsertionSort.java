package com.test.demo.arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={3,1,-2,7,0};
        int n=a.length;
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
    }
    }

}
