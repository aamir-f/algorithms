package linkedlist.singly;

import linkedlist.singly.LinkedList;

public class DetectCycles {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ll.head = first;
        //fifth.next = third;
        //boolean result = ll.hashingCycleDetection();
        boolean result = ll.floydCycleDetection();
        System.out.println("ll contains cycle: " + result);
    }
}