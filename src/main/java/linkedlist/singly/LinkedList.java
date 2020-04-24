package linkedlist.singly;

import java.util.Stack;

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

    //TC: O(n)
    public Boolean isPalindromeUsingStack() {
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<>();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.data != stack.pop()) {
                isPalindrome = false;
                break;
            }
            temp = temp.next;
        }

        return isPalindrome;
    }

    public void getMiddleNodeUsingCount() {
        int index = 0;
        int count = getNodeCount();
        int con = count / 2;
        Node temp = head;
        while (index < con) {
            temp = temp.next;
            index++;
        }
        System.out.println(temp.data);
    }

    public void getMiddleNodeTwoPointer() {
        Node ptr1 = head;
        Node ptr2 = head;
        while (ptr2 != null && ptr2.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        System.out.println(ptr1.data);
    }

    public void getMiddleUsingOddCheck() {
        int length = 1;
        Node temp = head;
        Node middle = temp;
        Node current = temp;
        while (current.next != null) {
            int oddCheck = length & 1;
            if (oddCheck == 1)
                middle = middle.next;

            length++;
            current = current.next;
        }
        System.out.println(middle.data);

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getNodeCountRecursive(Node head) {
        if (head == null) return 0;
        else return 1 + getNodeCountRecursive(head.next);
    }

    public int getNodeCount() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}