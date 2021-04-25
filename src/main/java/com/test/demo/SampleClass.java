package com.test.demo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Write a program given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [−1, −3], the function should return 1.
 */
public class SampleClass {

    public static void main(String[] args) {
        SampleClass sampleClass=new SampleClass();
        int a[] = {1, 3, 6, 4, 1, 2};
        System.out.println(sampleClass.solution(a));
    }

        public int solution(int[] A) {
            int N = A.length;
           // Set<Integer> set = Arrays.stream(A).filter(a -> a > 0).boxed().collect(Collectors.toSet());
            Set<Integer> set =new HashSet<>();
            for(Integer a:A){
                set.add(a);
            }
            return IntStream.rangeClosed(1, N + 1).filter(i -> !set.contains(i)).findFirst().orElse(1);
        }

}
