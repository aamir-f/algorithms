package algorithms.leetcode


sealed case class Node(var data: Int, var next: Node) {
  def getData = this.data

  def getNext: Node = this.next;

  override def toString: String = if (next == null) data + "" else data + "," + next.toString

}

case class LinkedList[T]() {
  var head: Node = null;

  //0(n)
  def addAtTail(`val`: Int) = {
    head match {
      case null => head = Node(`val`, null)
      case _    => {
        var last = head;
        while (last.next != null) {
          last = last.next;
        }
        last.next = Node(`val`, null);
      }
    }
  }

  def size: Int = {
    def loop(node: Node, acc: Int): Int = {
      if (node.next == null) acc else loop(node.next, acc + 1)
    }

    if (head == null) 0 else loop(head, 1)
  }

  //0(1)
  def addAtHead(`val`: Int): Unit = {
    val tempHead: Node = Node(`val`, head);
    head = tempHead;
  }

  /* if position is 1 then new node is
   set infornt of head node
   head node is changing.
   */
  //0(n)
  def addAtIndex(index: Int, `val`: Int) = {
    if (index == 0) {
      val newNode = new Node(`val`, null)
      newNode.next = head
      head = newNode
    } else {
      if (index > 0 && index <= size) {
        val newNode: Node = Node(`val`, null)

        def loop(node: Node, index: Int): Unit = {
          if (index == 1) {
            newNode.next = node.next
            node.next = newNode
          } else loop(node.next, index - 1)
        }

        loop(head, index)
      } else ""
    }
  }

  override def toString: String = {
    if (head != null) head.toString else ""
  }

  def get(index: Int): Int = {
    def loop(node: Node, index: Int): Int = {
      if (index == 0) node.data else loop(node.next, index - 1)
    }

    if (head == null) {
      -1
    } else if ((index < 0 || index > size - 1)) {
      -1
    } else loop(head, index)

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
        def loop(prev: Node, node: Node, index: Int): Unit = {
          if (node.next == null && index > 0) return
          else if (index == 0) prev.next = node.next
          else loop(node, node.next, index - 1)
        }

        loop(head, head.next, index - 1)
      }
    }
  }


}

/*
["MyLinkedList","addAtHead","deleteAtIndex","addAtHead","addAtHead","addAtHead","addAtHead","addAtHead","addAtTail","get","deleteAtIndex","deleteAtIndex"]
[[],              [2],        [1],            [2],        [7],        [3],        [2]         ,[5],       [5],        [5],    [6],          [4]]
 */
object SinglyLinkedListTest extends App {

  var linkedList: LinkedList[Int] = new LinkedList();

  linkedList.addAtHead(2)
  linkedList.deleteAtIndex(1)
  linkedList.addAtHead(2)
  linkedList.addAtHead(7)
  linkedList.addAtHead(3)
  linkedList.addAtHead(2)
  linkedList.addAtHead(5)
  linkedList.addAtHead(5)
  println(linkedList)
  println(linkedList.get(5))


}