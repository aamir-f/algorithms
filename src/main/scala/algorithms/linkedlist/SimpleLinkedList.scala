package algorithms.linkedlist

sealed case class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data

  def getNext: Node[T] = this.next;

  override def toString: String = if (next == null) data + "" else data + "," + next.toString

}

case class LinkedList[T]() {
  var head: Node[T] = null;

  //0(n)
  def append(data: T) = {
    head match {
      case null => head = Node(data, null)
      case _    => {
        var last: Node[T] = head;
        while (last.next != null) {
          last = last.next;
        }
        last.next = Node[T](data, null);
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
    val tempHead: Node[T] = Node[T](data, head);
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
        val newNode: Node[T] = Node(data, null)

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
}


object SinglyLinkedListTest extends App {

  var list: LinkedList[Int] = new LinkedList();

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
  list.insertMiddle(12, 8)
  println(list)
  println(list.size)

}