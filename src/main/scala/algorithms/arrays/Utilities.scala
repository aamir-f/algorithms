package algorithms.arrays

import scala.annotation.tailrec

object Utilities {
  def gcd(a: Int, b: Int): Int = {
     if(b == 0) a else gcd(b, a % b)
  }
}