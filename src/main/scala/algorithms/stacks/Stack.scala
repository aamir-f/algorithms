package algorithms.stacks

import StackSize._
/**
   *Imperative Style
  * push(), pop(), isEmpty() and peek() all take O(1) time. We do not run any loop in any of these operations
 */

class Stack {
  var top: Int = -1
  val a: Array[Int] = new Array[Int](MAX_SIZE)

  def isEmpty: Boolean = top < 0

  def peek: Int = {
    if (top < 0) {
      println("Stack Underflow")
      0
    } else a(top)
  }

  def push(x: Int): Boolean = {
    if (top >= MAX_SIZE - 1) {
      println("Stack Overflow")
      false
    } else {
      top += 1
      a(top) = x
     // println(s"$x pushed into stack")
      true
    }
  }

  def pop(): Int = {
    if (top < 0) {
      println("Stack Underflow")
      0
    } else {
      val result = a(top)
      top -= 1
      result
    }
  }

  def showStack() = println(a.filterNot(x => x == 0).mkString("[", ",", "]"))


}

object StackSize {
  val MAX_SIZE = 20
}

object TestStack extends App {

  val stack = new Stack()
  println(stack.isEmpty)
  stack.push(6)
  stack.push(8)
  println(stack.peek)
  stack.push(12)
  stack.pop()
  stack.push(4)
  stack.push(16)

  println(stack.isEmpty)
  stack.showStack()
}