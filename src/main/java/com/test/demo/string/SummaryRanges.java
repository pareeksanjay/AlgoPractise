package com.test.demo.string;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {
        int[] nums={0,1,2,4,5,7};
        System.out.println(summaryRanges(nums));
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length<0) return new ArrayList<>();
        int ptr1=0;
        while(ptr1<nums.length)
        {
            int start=nums[ptr1];
            int ptr2=ptr1+1;
            while(ptr2<nums.length && nums[ptr2]==nums[ptr2-1]+1)
                ptr2++;
            int end=nums[ptr2-1];
            ptr1=ptr2;
            if(start==end)
                list.add(String.valueOf(start));
            else
            {
                String sb = start +
                        "->" +
                        end;
                list.add(sb);
            }
        }
        return list;
    }
}
