package com.test.demo.linkedlist;

public class ReverseLinkedList {

    public Node reverse(Node head) {
        /*Node prev = null, next;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        head = prev;
        return head;*/

        //Iterative approach
        Node prev=null;
        Node curr=head;
        Node next=null;

        while (curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return curr;

    }
}
