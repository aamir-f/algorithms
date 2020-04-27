package linkedlist.singly;

import java.util.HashSet;
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
    //Time Complexity: O(n)
    public Boolean floydCycleDetection() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
            if(slow_ptr == fast_ptr) {
                return true;
            }

        }
        return false;
    }
 //TC:O(n), aux space : hashset used
    public Boolean hashingCycleDetection() {
        Node current = head;
        java.util.HashSet<Node> s = new HashSet<Node>();

        while(current != null) {
            if(s.contains(current)) return true;
            s.add(current);
            current = current.next;
        }
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



    public Boolean isPalindromeByReversing() {
        Node slow_ptr = head;
        Node previous_of_slow_ptr = head;
        Node fast_ptr = head;
        while (fast_ptr != null && fast_ptr.next != null) {
            previous_of_slow_ptr = slow_ptr;
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        Node mid_node = null;
        if (fast_ptr != null) {
            mid_node = slow_ptr;
            slow_ptr = slow_ptr.next;
        }
        Node second_ptr = slow_ptr;
        previous_of_slow_ptr.next = null;
        reverse();
        boolean isPalindrome = compare(head, second_ptr);
        reverse();

        if (mid_node != null) {
            previous_of_slow_ptr.next = mid_node;
            mid_node.next = second_ptr;
        } else {
            previous_of_slow_ptr.next = second_ptr;
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

    public boolean compare(Node temp1, Node temp2) {

        while (temp1 != null && temp2 != null) {
            if (temp1.data != temp2.data) return false;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        if (temp1 == null && temp2 == null) return true;
        return false;
    }


    public void getMiddleUsingOddCheck() {
        int length = 1;
        Node middle = head;
        Node current = head;
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