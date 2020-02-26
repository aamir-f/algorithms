package algorithms.arrays

import scala.annotation.tailrec

object Utilities {
  def arrayReverse(arr: Array[Int]): Array[Int] = {
    val start = 0
    val end = arr.length - 1

    @tailrec
    def reverse(start: Int, end: Int): Array[Int] = {
      if (start >= end) arr else {
        var temp = arr(start)
        arr(start) = arr(end)
        arr(end) = temp
        reverse(start + 1, end - 1)
      }
    }

    def reverseFromIndexes(arr: Array[Int], start: Int, end: Int) = {

    }

    reverse(start, end)
  }


  def gcd(a: Int, b: Int): Int = {
     if(b == 0) a else gcd(b, a % b)
  }
}