package com.test.demo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Given a triangle array, return the minimum path sum from top to bottom.

For each step, you may move to an adjacent number of the row below.

 More formally, if you are on index i on the current row,
 you may move to either index i or index i + 1 on the next row.


 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();
        List<Integer> integerList=new ArrayList<Integer>();
        integerList.add(-1);
        triangle.add(integerList);
        List<Integer> integerList1=new ArrayList<Integer>();
        integerList1.add(2);
        integerList1.add(3);
        triangle.add(integerList1);
        List<Integer> integerList2=new ArrayList<Integer>();
        integerList2.add(1);
        integerList2.add(-1);
        integerList2.add(-3);
        triangle.add(integerList2);

        int count=findMinSum(triangle);

        System.out.println(count);


    }

    private static int findMinSum(List<List<Integer>> triangle) {
        int count=0;
        if(!triangle.isEmpty()){
            for(List<Integer> list:triangle){
                Collections.sort(list);
                count+=list.get(0);
            }
            return count;
        }
        return 0;
    }
}
