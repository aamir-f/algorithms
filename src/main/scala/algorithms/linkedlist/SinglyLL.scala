package algorithms.linkedlist

import algorithms.linkedlist.Node

case class SinglyLL[T]() {
  var head: Node[T] = null;

  //0(n)
  def append(data: T) = {
    head match {
      case null => head = new Node(data, null)
      case _    => {
        var last: Node[T] = head;
        while (last.next != null) {
          last = last.next;
        }
        last.next = new Node[T](data, null);
      }
    }
  }

  def size: Int = {
    def loop(node: Node[T], acc: Int): Int = {
      if (node.next == null) acc else loop(node.next, acc + 1)
    }

    if (head == null) 0 else loop(head, 1)
  }

  //0(1)
  def prepend(data: T): Unit = {
    val tempHead: Node[T] = new Node[T](data, head);
    head = tempHead;
  }

  /* if position is 1 then new node is
   set infornt of head node
   head node is changing.
   */
  //0(n)
  def insertMiddle(data: T, pos: Int) = {
    if (pos == 1) {
      val newNode = new Node(data, null)
      newNode.next = head
      head = newNode
    } else {
      if (pos > 1 && pos <= size + 1) {
        val newNode: Node[T] = new Node(data, null)

        def loop(node: Node[T], pos: Int): Unit = {
          if (pos == 1) {
            newNode.next = node.next
            node.next = newNode
          } else loop(node.next, pos - 1)
        }

        loop(head, pos - 1)
      } else throw new IllegalArgumentException("invalid position")
    }
  }

  override def toString: String = {
    if (head != null) head.toString else ""
  }

  def getDataByIndex(index: Int): T = {
    def loop(node: Node[T], index: Int): T = {
      if (index == 0) node.data else loop(node.next, index - 1)
    }

    if (head == null) {
      throw new NoSuchElementException("empty.singlylinkedlist")
    } else if ((index < 0 || index > size - 1)) {
      throw new IllegalArgumentException("invalid index")
    } else loop(head, index)

  }

  def searchNodeByData(data: T) = ???

  def deleteNodeByData(data: T) = {
    if (head != null && data == head.data) head = head.next

    def loop(prev: Node[T], node: Node[T]): Unit = {
      if (node == null) return else {
        if (node.data == data) {
          prev.next = node.next
        } else loop(node, node.next)
      }

    }

    if (head == null) {
      throw new NoSuchElementException("empty singly linked list")
    } else loop(head, head.next)

  }

  def deleteAtIndex(index: Int) = {
    if (index == 0) {
      if (head == null) {
        ""
      } else {
        head = head.next
      }
    } else {
      if (index > size - 1) {
        ""
      } else {
        def loop(prev: Node[T], node: Node[T], index: Int): Unit = {
          if (node.next == null && index > 0) return
          else if (index == 0) prev.next = node.next
          else loop(node, node.next, index - 1)
        }

        loop(head, head.next, index - 1)
      }
    }
  }

  def deleteList = head = null
  def reverse = ???


}


object SinglyLinkedListTest extends App {

  var list: SinglyLL[Int] = new SinglyLL();

  list.append(2);
  list.append(3);
  list.append(4);
  list.prepend(1);
  println(list)
  println(list.size)
  list.insertMiddle(5, 1)
  println(list)
  println(list.size)
  list.insertMiddle(6, 3)
  println(list)
  println(list.size)
  list.insertMiddle(12, 7)
  println(list)
  println(list.size)

  println("*" * 20)
  println(list.getDataByIndex(3))
  println("-" * 20)
  list.deleteNodeByData(666)
  println(list)
  println("==" * 20)
  list.deleteAtIndex(0)
  println(list)
  list.deleteAtIndex(5)
  println(list)
  list.deleteAtIndex(12)
  println(list)


}