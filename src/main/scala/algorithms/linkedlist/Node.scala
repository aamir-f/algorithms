package algorithms.linkedlist

class Node[T](var data: T, var next: Node[T]) {
  def getData: T = this.data

  def getNext: Node[T] = this.next;

  //override def toString: String = if (next == null) data + "" else data + "," + next.toString

}