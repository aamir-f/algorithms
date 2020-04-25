package linkedlist.singly;

import linkedlist.singly.LinkedList;

public class Reverse {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);

        ll.printLL();
        ll.reverse();
        System.out.println();
        ll.printLL();

    }
}