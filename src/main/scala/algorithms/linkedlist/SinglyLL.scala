package algorithms.linkedlist

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

  def prepend(data: T): Unit = {
    val tempHead: Node[T] = new Node[T](data, head);
    head = tempHead;
  }

  def insertAfter(prevNode: Node[T], data: T) = {
    var newNode = new Node(data, null)
    if (prevNode == null)
      print("prev node is empty")
    else {
      newNode.next = prevNode.next
      prevNode.next = newNode
    }
  }

  def size: Int = {
    def loop(node: Node[T], acc: Int): Int = {
      if (node.next == null) acc else loop(node.next, acc + 1)
    }

    if (head == null) 0 else loop(head, 1)
  }

  def printLinkedList = {
    def loop(node: Node[T], accString: String): String = {
      if (node == null) accString
      else loop(node.next, accString + node.data + " ")
    }

    println(loop(head, ""))
  }

  def deleteNodeByData(data: T) = {

    def loop(prev: Node[T], node: Node[T]): Unit = {
      if (node == null) return else {
        if (node.data == data) {
          prev.next = node.next
        } else loop(node, node.next)
      }

    }

    if (head == null) {
      println("deleting node by data of empty linked list")
    } else if (data == head.data) head = head.next


    else loop(head, head.next)

  }

  def deleteLastNode() = {
    if (head == null) {
      println("delete last node of empty list")
    } else if (head.next == null) {
      head = null
    } else {
      def loop(node: Node[T]): Unit = {
        if (node.next.next == null) node.next = null
        else loop(node.next)
      }

      loop(head)
    }
  }

  def deleteFirstNode() = {
    if (head == null) {
      println("deleting first node of empty linked list")
    } else {
      head = head.next
    }
  }

  def deleteAtIndex(index: Int) = {
    if (index < 0) println("index must be greater than zero") else {
      if (head == null) {
        println("delete by index of empty linked list")
      } else if (index == 0) {
        head = head.next
      } else {

        def loop(temp: Node[T], counter: Int): Node[T] = {
          if (temp == null || counter >= index - 1) temp // 0 >= -21
          else loop(temp.next, counter + 1)
        }

        val temp: Node[T] = loop(head, 0)
        if (temp != null) {
          if (temp.next != null)
            temp.next = temp.next.next
        }

      }
    }
  }

  def getDataByIndex(index: Int) = {
    if (index < 0) println("index must be greater than zero") else {
      if (head == null) {
        println("delete by index of empty linked list")
      } else if (index == 0) {
        head.data
      } else {

        def loop(temp: Node[T], counter: Int): Node[T] = {
          if (temp == null || counter >= index) temp // 0 >= -21
          else loop(temp.next, counter + 1)
        }

        val temp: Node[T] = loop(head, 0)
        if (temp != null) temp.data
      }
    }
  }

    def reverse = ???


}


object SinglyLinkedListTest extends App {

  var list: SinglyLL[Int] = new SinglyLL();

  list.append(2)
  list.append(4)
  list.prepend(1)
  list.insertAfter(list.head.next, 3)
  list.append(5)
  list.append(6)
  list.append(7)

  list.printLinkedList
  println(list.getDataByIndex(6))


}