package com.test.demo;

// you can also use imports, for example:
// import java.util.*;

// you can write to stderr for debugging purposes, e.g.
// System.err.println("this is a debug message");

import java.util.Arrays;

class Solution {

    public static void main(String args[]) {
        int k=8;
        int[] array = new int[]{4, 10, 35, 80, 123, 12345, 44, 8, 5, 89};

        int max = Arrays.stream(array).max().getAsInt();

        int maxLength = Integer.toString(max).length();
        StringBuilder edgeBuilder = new StringBuilder();

        for(int i=0;i<maxLength;i++)
            edgeBuilder.append("-");

        final String horizontalEdge = edgeBuilder.toString();
        final String verticalEdge = "|";
        int arrayLength= array.length;

        int iterations = arrayLength / k;
        int lastIteration = arrayLength % k;
        iterations = (lastIteration>0)? iterations+1: iterations;
        int start=0, end= 0;
        boolean firstIteration = true;

        while(iterations>0) {
            end = start+k-1;
            end = (end> arrayLength)? arrayLength-1: end;

            if(firstIteration) {
                for(int i=start;i<=end;i++)
                    System.out.print("+"+horizontalEdge);
                System.out.print("+\n");
                firstIteration = false;
            }

            for(int i=start;i<=end;i++)
                System.out.print(verticalEdge+String.format("%1$"+maxLength+ "s", array[i]+""));
            System.out.print("|\n");
            for(int i=start;i<=end;i++)
                System.out.print("+"+horizontalEdge);
            System.out.print("+\n");

            start=end+1;
            iterations--;
        }
    }


}