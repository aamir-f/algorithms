package stack;

/**
 * Pros: The linked list implementation of stack can grow and shrink according to the needs at runtime.
 * Cons: Requires extra memory due to involvement of pointers.
 */
//access and search using Linkedlist is O(n)
public class StackUsingLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    boolean isEmpty() {
        return root == null;
    }
 //O(1)
    void push(int data) {
        StackNode newNode = new StackNode(data);
        if(root == null) root = newNode;
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
    }
 //O(1)
    int pop() {
        int popped = Integer.MIN_VALUE;
        if(root == null) {
            System.out.println("Stack is Empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    int peek() {
        if(root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        } else return root.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList s = new StackUsingLinkedList();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");

    }
}
