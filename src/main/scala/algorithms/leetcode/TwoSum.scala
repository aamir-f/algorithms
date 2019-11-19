package algorithms.leetcode

import scala.util.control.Breaks._

/**
  * Time Complexity = Sorting Algorithm Time Complexity plus < O(n)
  */
object TwoSum extends App {

  val arr = Array(2, 7, 11, 15).sorted

  var low = 0
  var high = arr.length - 1
  var sum = 9
  breakable {
    while (low < high) {
      if (arr(low) + arr(high) == sum) {
        println(s"indices of the two numbers, [${arr(low)}, ${arr(high)}] such that they add up to a $sum is, [$low, $high]")
        break
      } else if (arr(low) + arr(high) < sum) low = low + 1
      else high = high - 1
    }
  }

}