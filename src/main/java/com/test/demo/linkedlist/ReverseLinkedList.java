package com.test.demo.linkedlist;

public class ReverseLinkedList {

    public Node reverse(Node head){
        Node prev=null,next;
        while(head !=null){
           next=head.next;
           head.next=prev;
           prev=head;
           head=next;
        }
        head=prev;
return head;
    }
}
