/*


package algorithms.linkedlist

import scala.util.control.Breaks

case class LinkedList[T]() {
  var head: Node[T] = null;



  def delete(deleteItem: T) = {
    var previousNode: Node[T] = head
    var currentNode: Node[T] = head

    val loopBreak = new Breaks;

    loopBreak.breakable {
      while (currentNode != null) {
        if (currentNode.data.equals(deleteItem)) {
          if (currentNode.equals(previousNode)) {
            head = currentNode.next
          } else {
            previousNode.next = currentNode.next;

          }
          loopBreak.break();
        } else {
          previousNode = currentNode;
          currentNode = currentNode.next;
        }
      }
    }

  }

  def reverse(): Unit = {
    var previous:Node[T] = null;
    var current:Node[T] = head;
    var next:Node[T] = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    head = previous;
  }


}

sealed case class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data

  def getNext: Node[T] = this.next;

  def printList(): Unit = {
    print(data)

    if (next != null) {
      print(",")
      next.printList();
    }

  }

}

object SinglyLinkedListTest extends App {

  var list: LinkedList[Int] = new LinkedList();

  list.push(1);
  list.push(2);
  list.push(3);
  list.print()
  list.delete(1);
  list.print();
  list.reverse();
  list.print();
  println(list.getDataByIndex(1));
  list.prepend(23);
  list.print();
  list.reverse();
  list.print();


}


*/
