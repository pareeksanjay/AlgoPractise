package com.test.demo;

public class AmazonTest {
    public static void main(String[] args) {
        int[] arr = {5,5,4,5,4};

        if(arr.length == 1) {
            System.out.println(1);
        }

        int even = arr[0];
        int odd = arr[1];
        int start = 0;
        int max_len = 0;
        for(int i=2;i<arr.length;++i){
            if(i%2 == 0 && arr[i] != even || i%2 == 1 && arr[i] != odd){
                max_len = Math.max(max_len,i - start);
                start = i-1;
                if(i%2 == 0){
                    even = arr[i];
                    odd = arr[i-1];
                }else{
                    even = arr[i-1];
                    odd = arr[i];
                }
            }
        }


        System.out.println(Math.max(max_len,arr.length - start));
    }
}