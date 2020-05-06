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
        Node sixth = ll.newNode(6);
        Node seventh = ll.newNode(7);
        Node eighth = ll.newNode(8);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;

        ll.head = first;
        eighth.next = second;
        //boolean result = ll.hashingCycleDetection();
        //ll.printLL(); recursive print chain
        //ll.floydCycleDetection();
        ll.detectAndRemoveCycleUsingHashing();
        ll.printLL();
        //boolean result = ll.cycleDetectionByMarkingVisitedNode();
    }
}