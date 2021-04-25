package com.test.demo.arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a={3,1,-2,7,0};
        int n=a.length;
        for(int i=0;i<n-1;i++){
            int min=i+1;
            for(int j=i;j<n-1;j++){
                //internal loop will start from i
            if(a[j]<a[min]){
                min=j;
            }
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }

        for (int arry:a){
            System.out.print(arry+" ");
        }
    }
}
