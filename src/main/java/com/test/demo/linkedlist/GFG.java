package com.test.demo.linkedlist;

import java.util.Scanner;

public class GFG {

    static void printList(Node node){

        while (node !=null){

            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0){
            int n=scanner.nextInt();
            Node head=new Node(scanner.nextInt());
            Node tail=head;
            for (int i=0;i<n-1;i++){
                tail.next=new Node(scanner.nextInt());
                tail=tail.next;
            }
            Solution g=new Solution();
            int ans=g.getMiddle(head);
            ReverseLinkedList reverseLinkedList=new ReverseLinkedList();
            head=reverseLinkedList.reverse(head);
            System.out.println(head.data);
            t--;
        }


    }
}
