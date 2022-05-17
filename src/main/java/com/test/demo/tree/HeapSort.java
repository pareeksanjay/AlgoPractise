package com.test.demo.tree;

import java.util.Arrays;

public class HeapSort extends MinHeapImplementation{

    public static void main(String[] args) {
        int[] array={10,6,13,14,2,3,15};
        HeapSort heapSort=new HeapSort();
        for(int num:array){
            heapSort.add(num);
        }

        for(int num:array){
            System.out.print(heapSort.poll()+" ");
        }
    }
}
