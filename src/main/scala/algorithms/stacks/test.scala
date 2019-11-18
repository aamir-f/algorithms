package algorithms.stacks

object Solution extends App {

  class StackInt {
    var top: Int = -1
    val MAX_SIZE = 10000
    val a: Array[Int] = new Array[Int](MAX_SIZE)

    def isEmpty: Boolean = top < 0

    def peek(): Int = {
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

    //  def showStack() = println(a.filterNot(x => x == 0).mkString("[", ",", "]"))


  }

  def trap(height: Array[Int]): Int = {
    val stackInt = new StackInt()
    var i = 0
    var counter = 0
    while (i < height.length) {

      while (!stackInt.isEmpty && height(stackInt.peek()) < height(i)) {
        val poppedElement = height(stackInt.pop())
        val maxLeft = if (stackInt.isEmpty) poppedElement else height(stackInt.peek())
        val maxRight = height(i)
        val h = Math.abs(Math.min(maxLeft, maxRight) - poppedElement)
        val w = if (stackInt.isEmpty) (i - 0) - 1 else (i - stackInt.peek()) - 1
        counter = counter + (h * w)
      }
      stackInt.push(i)
      i += 1
    }
    counter
  }

  println(trap(Array(10, 6, 12, 4)))

}