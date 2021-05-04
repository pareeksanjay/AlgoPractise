package com.test.demo.arrays;

/*
Given an integer n, the length of the array.
Return the minimum number of operations needed to make all the elements of arr equal.
 */
public class minOperationToMakeArrayEqual {
    public static void main(String[] args) {
        System.out.println(minOperations(9));
    }

    public static int minOperations(int n) {

        return (n % 2 == 0) ? n / 2 * n / 2 : (n / 2) * (n / 2 + 1);
    }
}

