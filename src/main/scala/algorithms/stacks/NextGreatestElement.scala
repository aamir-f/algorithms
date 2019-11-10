package algorithms.stacks

import scala.util.control.Breaks._

/**
  * Time Complexity: O(n * n). The worst case occurs when all elements are sorted in decreasing order.
  */

object NextGreatestElement1 extends App {
  //val arr = Array(4, 5, 2, 1, 25)
  // val arr = Array(6, 5, 4, 3, 2)
  val arr = Array(4, 5, 7, 8, 12)
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