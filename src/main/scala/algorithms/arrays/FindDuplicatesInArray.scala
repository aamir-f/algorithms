package algorithms.arrays

/**
  * References:
  * link1: https://www.geeksforgeeks.org/find-the-two-repeating-elements-in-a-given-array/
  **/

/**
  * array of elements n + 2, all elements in array are from range 1 to n.
  * And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
  */


/**
  * Method 1:
  * Time Complexity: O(n)
  * Auxiliary Space  O(1)
  **/
object Method1 extends App {

  //array of elements n + 2, all elements in array are from range 1 to n.
  //And all elements occur once except two numbers which occur twice. Find the two repeating numbers.
  val arr = Array(4, 2, 4, 5, 2, 3, 1)

  logRepeatingElements(arr)
  def logRepeatingElements(arr: Array[Int]): Unit = {

    for {
      i <- arr.indices
      j <- i + 1 until arr.length
    } if (arr(i) == arr(j)) println(arr(i))
  }

}
