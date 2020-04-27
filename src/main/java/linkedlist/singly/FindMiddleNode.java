package linkedlist.singly;


public class FindMiddleNode {


    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.head = ll.newNode(1);
        ll.head.next = ll.newNode(2);
        ll.head.next.next = ll.newNode(3);
        ll.head.next.next.next = ll.newNode(4);
        ll.head.next.next.next.next = ll.newNode(5);
        ll.head.next.next.next.next.next = ll.newNode(6);

        ll.getMiddleNodeUsingCount();
        ll.getMiddleNodeTwoPointer();
        ll.getMiddleUsingOddCheck();

    }
}