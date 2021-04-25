package com.test.demo.linkedlist;

/*
solution to get the middle element of the linked list
 */
public class Solution {
    public int getMiddle(Node head) {

        Node slowPtr = head;
        Node fastPtr = head;
        if (head != null) {
            while (fastPtr != null && fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            System.out.println("The middle element is [" + slowPtr.data + "] \n");
            return slowPtr.data;
        }

        return 0;
    }

}
