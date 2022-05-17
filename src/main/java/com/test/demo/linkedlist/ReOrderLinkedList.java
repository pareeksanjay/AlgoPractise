package com.test.demo.linkedlist;
/*
folding a linkedList
* */
public class ReOrderLinkedList {

    /*
    * break into 3 steps
    */

    /*
    * 1) find middle of linked list
    * 2) Break into 2 LL from the middle
    * 3) reverse 2nd half of LL
    * 4) merge both of the ll by reordering
    * */
    public  Node reOrderLinkedList(Node head) {
        Node slow = head;
        Node fast = head;
return head;
    }
    //part 1
    public Node findMid(Node slow,Node fast){
        while (fast !=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //part 2
    public Node inPlaceReverse(Node slow){
        Node prev=null;
        Node curr=slow;
        Node temp=null;

        while (curr !=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return curr;
    }
    //part3
    public Node merge(Node head,Node prev){
        Node first=head;
        Node second=prev;
        Node temp=null;
        while ((second !=null)){
            temp=first.next;
            first.next=second;
            first=temp;
            temp=second.next;
        }

        return first;
    }

}
