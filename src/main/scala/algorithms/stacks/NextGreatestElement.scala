package algorithms.stacks

import scala.util.control.Breaks._


/**
  * Approach 1
  * 10-Nov-2019
  * Time Complexity: O(n * n). The worst case occurs when all elements are sorted in decreasing order.
  */

object NextGreatestElement1 extends App {
  //val arr = Array(4, 5, 2, 1, 25)
  // val arr = Array(6, 5, 4, 3, 2)
  val arr = Array(7 ,8, 1, 4)
  var next = 0
  var i = 0
  var j = 0
  while (i < arr.length) {
    next = -1
    j = i + 1
    breakable {
      while (j < arr.length) {
        if (arr(i) < arr(j)) {
          next = arr(j)
          break
        }
        j += 1
      }
    }
    println(arr(i) + " -- " + next)
    i += 1
  }
}

/**
  * Approach 2
  * 10-Nov-2019
  * Time Complexity: O(n).
  * The worst case occurs when all elements are sorted in decreasing order. If elements are sorted in decreasing order, then every element is processed at most 4 times.
  * *
  * Initially pushed to the stack.
  * Popped from the stack when next element is being processed.
  * Pushed back to the stack because the next element is smaller.
  * Popped from the stack in step 3 of algorithm (when assigning -1 in last loop).
  *
  */

object NextGreatestElement2 extends App {

  val stack = new Stack()
  val arr = Array(5,4,6,1,2)
  stack.push(arr(0))

  for (i <- arr.tail) {

    var element = stack.pop()
    val next = i

    breakable {
      while (next > element) {
        println(s"$element ---> $next")
        if (stack.isEmpty) break
        element = stack.pop()
      }
    }

    if (element > next) stack.push(element)
    stack.push(next)
  }

  while (!stack.isEmpty) {
    val element = stack.pop()
    println(s"$element ---> -1")
  }

}

/**
  *
  * Next greater element in same order as input
  * Time Complexity: O(n)
  * Auxiliary Space: O(n)
  */
object NextGreatestElement3 extends App {

  val stack = new Stack()
  val arr = Array(5,200,50,100)
  val arr1 = Array.fill(arr.length)(0)
  var i = arr.length  - 1
  while (i >= 0) {

       while(!stack.isEmpty && stack.peek() < arr(i)) {
         stack.pop()
       }

      if(stack.isEmpty) arr1(i) = -1 else arr1(i) = stack.peek()

       stack.push(arr(i))

    i -= 1
  }
 i = 0
  while(i < arr.length) {
    println(s"${arr(i)} ----> ${arr1(i)}")
    i = i + 1
  }
}
