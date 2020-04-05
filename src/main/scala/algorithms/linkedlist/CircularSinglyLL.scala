package algorithms.linkedlist

class CircularSinglyLL[T] {
  var last: Node[T] = null

  def addToEmpty(data: T) = {
    if (last == null) {
      val node = new Node(data, null)
      last = node
      last.next = last
    }
  }

  def prepend(data: T) = {
    if (last == null) addToEmpty(data) else {
      val node = new Node(data, null)
      node.next = last.next
      last.next = node
    }
  }

  def append(data: T) = {
    if (last == null) addToEmpty(data) else {
      val node = new Node(data, null)
      node.next = last.next
      last.next = node
      last = node
    }
  }

  /*  override def toString: String = {
      def loop(node: Node[T], acc: String): String = {
        if (node == last.next) acc
        else loop(node.next, acc + " " + node.data)
      }

      val p = last.next
      loop(p.next, p.data.toString)
    }*/

  def addAfter(data: T, nodeData: T) = {
    def loop(node: Node[T]): Any = {
      if (node == last.next) "" else {
        if (node.data == nodeData) {
          val newNode = new Node(data, null)
          newNode.next = node.next
          node.next = newNode
          if (node == last) {
            last = newNode
          }
        } else loop(node.next)
      }
    }

    val p = last.next
    if (p.data == nodeData) {
      val newNode = new Node(data, null)
      newNode.next = p.next
      p.next = newNode
    } else loop(p.next)
  }

  def traverse {
    var p: Node[T] = null
    if (last == null) {
      println("List is empty.");
    } else {
      p = last.next;
      do {
        print(p.data + " ")
        p = p.next;
      } while (p != last.next);
    }

  }

}

object CircularSinglyLLTest extends App {
  val cLL = new CircularSinglyLL[Int]()
  cLL.addToEmpty(2)
  cLL.append(3)
  cLL.append(4)
  cLL.append(5)
  cLL.prepend(1)
  cLL.addAfter(6, 5)
  cLL.traverse
}