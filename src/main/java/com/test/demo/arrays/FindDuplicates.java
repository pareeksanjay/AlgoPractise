package com.test.demo.arrays;

import java.util.ArrayList;

class FindDuplicates {
    // Function to print duplicates
    void printRepeating(int[] arr, int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {
            int j = Math.abs(arr[i]);
            if (arr[j] >= 0)
                arr[j] = -arr[j];
             else {
                System.out.print(j + " ");
            }
        }
    }

    public ArrayList<Integer> duplication(int[] arr, int n){

        ArrayList<Integer> newArray=new ArrayList<>();
        // First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
        for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2){
                newArray.add(i);
            }

        }

        if(newArray.isEmpty()){
            newArray.add(-1);
        }

        return newArray;
    }


    // Driver code
    public static void main(String[] args)
    {
        FindDuplicates duplicate = new FindDuplicates();
       // int[] arr = { 17 ,27, 11 ,23 ,14, 29, 17 ,24, 3, 6, 18, 8 ,18 ,16, 29, 11 ,24, 5, 0, 1, 28, 3, 28, 4, 13, 7 ,7, 27 ,10, 21};
        int[] arr = {2,3,1,2,3};
        int arr_size = arr.length;

        //duplicate.printRepeating(arr, arr_size);
        ArrayList<Integer> ans=duplicate.duplication(arr,arr_size);
        for(Integer val: ans){
            System.out.print(val+" ");
        }
    }
}