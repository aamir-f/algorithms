package linkedlist.singly;


public class FindMiddleNode {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);
        ll.head.next.next.next.next = new Node(5);
        ll.head.next.next.next.next.next = new Node(6);

        ll.getMiddleNodeUsingCount();
        ll.getMiddleNodeTwoPointer();
        ll.getMiddleUsingOddCheck();

    }
}