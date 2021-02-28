package com.test.demo;

import java.util.HashSet;
import java.util.Set;

/*
Write a program to find duplicate elements
time complexity 0(n)
 */
public class DuplicateElements {

    public static void main(String[] args) {
        int[] value ={332,442,2121,1,332,4,6,442,1,442,7};

        Set<Integer> uniqueElement = new HashSet<>();
        boolean isDupExist = false;
        for (int i = 0; i < value.length; i++) {
            if (uniqueElement.contains(value[i])) {
                isDupExist = true;
                System.out.println("Duplicate element is: " + value[i]);
            } else {
                uniqueElement.add(value[i]);
            }
        }
        if (!isDupExist) {
            System.out.println(-1);
        }

    }
}
