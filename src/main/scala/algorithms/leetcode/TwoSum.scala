package algorithms.leetcode

import java.util

import scala.util.control.Breaks._

/**
  * Time Complexity = Sorting Algorithm Time Complexity plus < O(n)
  */
object TwoSum1 extends App {

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

/**
  * Time Complexity = O(n)
  */
object TwoSum2 extends App {

  def twoSums(nums: Array[Int], target: Int): Array[Int] = {
    def tailRec(map: Map[Int, Int], index: Int): Array[Int] = {
      if (index >= nums.length) Array() else {
        if (map.contains(nums(index))) {
          Array(map(nums(index)), index)
        } else {
          val t = nums(index)
          tailRec(map + (target - nums(index) -> index), index + 1)
        }
      }
    }
    tailRec(Map(), 0)
  }

  val res = twoSums(Array(11, 4, 5, 7, 6), 10)
  res foreach println


}