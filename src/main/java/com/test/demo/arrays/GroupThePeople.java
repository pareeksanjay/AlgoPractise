package com.test.demo.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.

You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in. For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.

Return a list of groups such that each person i is in a group of size groupSizes[i].
 */
public class GroupThePeople {
    public static void main(String[] args) {
        int[] array = {3, 3, 3, 3, 3, 1, 3};
        // List<List<Integer>> answer = groupThePeople(array);
        List<List<Integer>> answer = groupThePeopleByHashMap(array);
        for (List<Integer> inte : answer) {
            System.out.println(inte);
        }
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer>[] listArray = new List[501];

        int value;
        for (int i = 0; i < groupSizes.length; i++) {
            value = groupSizes[i];
            if (listArray[value] == null) {
                listArray[value] = new ArrayList<Integer>();
            }
            listArray[value].add(i);
            if (listArray[value].size() == value) {
                list.add(listArray[value]);
                listArray[value] = null;
            }
        }

        return list;
    }

    public static List<List<Integer>> groupThePeopleByHashMap(int[] groupSizes) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> newList = map.getOrDefault(groupSizes[i], new ArrayList<>());
            newList.add(i);
            map.put(groupSizes[i], newList);
        }
        List<List<Integer>> list = new ArrayList<>();
        for (int key : map.keySet()) {
            int i = 0;
            List<Integer> partitionList = map.get(key);
            do {
                list.add(partitionList.subList(i, i + key));
                i += key;
            } while (i + key <= partitionList.size());
        }


        return list;
    }
}
