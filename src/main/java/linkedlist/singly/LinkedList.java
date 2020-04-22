package linkedlist.singly;

class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

public class LinkedList {
    Node head;

    public void prepend(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printLL() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void reverse() {
        Node current = head;
        Node next = null;
        Node previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public Boolean floydCycleDetection() {
        return false;
    }

    public Boolean hashingCycleDetection() {
        return false;
    }

    public Boolean cycleDetection() {
        return false;
    }

    public void append(int new_data) {

    }

    public void deleteStart() {

    }

    public void deleteLast() {

    }

    public void deleteAtIndex(int index) {

    }

    public void deleteByData(int data) {

    }

    public int search(int index) {
        return 1;
    }
    public void insertAfterNode(Node prev_node, int new_data) {

    }
}