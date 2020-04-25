package linkedlist.singly;


import java.util.Stack;

class MyLinkedList {
    Node head;
    Node left;
    Node slow_ptr, fast_ptr, second_half;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void prepend(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    //TC: O(n)
    public Boolean isPalindromeUsingStack() {
        boolean isPalindrome = true;
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }
        current = head;
        while (current != null) {
            if (current.data != stack.pop()) {
                isPalindrome = false;
                break;
            }
            current = current.next;
        }

        return isPalindrome;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    //TC: O(n)
    public Boolean isPalindromeByReversing() {
        slow_ptr = head;
        Node previous_of_slow_ptr = head;
        fast_ptr = head;
        boolean isPalindrome = true;
        if (head != null && head.next != null) {
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
            second_half = slow_ptr;
            previous_of_slow_ptr.next = null;
            reverse();
            isPalindrome = compare(head, second_half);
            reverse();

            if (mid_node != null) {
                previous_of_slow_ptr.next = mid_node;
                mid_node.next = second_half;
            } else {
                previous_of_slow_ptr.next = second_half;
            }
        }
        return isPalindrome;

    }

    public void reverse() {
        Node current = second_half;
        Node next = null;
        Node previous = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        second_half = previous;
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

    public boolean isPalindromeUsingRecursion(Node right) {

        left = head;
        if (right == null) {
            return true;
        }

        boolean isPalindrome1 = isPalindromeUsingRecursion(right.next);
        if(!isPalindrome1) return false;
        boolean isPalindrome2 = left.data == right.data;
        left = left.next;
        return isPalindrome2;
    }
}

public class Palindrome {


    public static void main(String[] args) {

        MyLinkedList ll = new MyLinkedList();
        ll.prepend(5);
        ll.prepend(4);
        ll.prepend(3);
        ll.prepend(4);
        ll.prepend(5);

        ll.print();

        System.out.println();
        System.out.println(ll.isPalindromeUsingStack());
        System.out.println(ll.isPalindromeByReversing());
        System.out.println(ll.isPalindromeUsingRecursion(ll.head));
    }
}