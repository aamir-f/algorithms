package linkedlist.singly;

import linkedlist.singly.LinkedList;

public class DetectCycles {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        Node first = ll.newNode(1);
        Node second = ll.newNode(2);
        Node third = ll.newNode(3);
        Node fourth = ll.newNode(4);
        Node fifth = ll.newNode(5);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        ll.head = first;
        fifth.next = third;
        //boolean result = ll.hashingCycleDetection();
        //boolean result = ll.floydCycleDetection();
        boolean result = ll.cycleDetectionByMarkingVisitedNode();
        System.out.println("ll contains cycle: " + result);
    }
}