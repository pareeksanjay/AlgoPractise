package com.test.demo.linkedlist;

public class LinkedListSum {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(3, new ListNode(4, new ListNode(6)));
        ListNode result=addTwoNumbers(l1, l2);
        System.out.println(result.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        sum= l1.val+ l2.val;


        return new ListNode(sum);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


