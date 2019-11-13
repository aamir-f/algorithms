package algorithms.stacks

import scala.util.control.Breaks._

/**
  * Time Complexity: O(n * n)
  */
object SignalTraversal1 extends App {

  val arr = Array(10, 50, 30, 40, 60)
  var index = 1
  println(s"${arr(0)} --> $index")
  var i = 1
  var j = 0
  while (i < arr.length) {

    j = i - 1
    index = 1
    breakable {
      while (j >= 0) {
        if (arr(j) < arr(i)) index += 1 else break
        j -= 1

      }
    }
    println(s"${arr(i)} --> $index")
    i += 1
  }
}

/**
 *Time Complexity: O(n)
 */

object SignalTraversal2 extends App {

  //val arr = Array(10, 50, 30, 40, 60)
  //val arr = Array(1,2,3,4,5)
  //val arr = Array(5,4,3,2,1)
  val arr = Array(1,1,1,1,1)

  val stack = new StackInt()
   var i = 0

  while(i < arr.length) {

    while(!stack.isEmpty && arr(stack.peek()) < arr(i)) {
      stack.pop()
    }

    if(stack.isEmpty) {
      println(s"${arr(i)} --> ${i + 1}")
    } else {
      println(s"${arr(i)} --> ${i - stack.peek()}")
    }
    stack.push(i)
    i += 1
  }


}
