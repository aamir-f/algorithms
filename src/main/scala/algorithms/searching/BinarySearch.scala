package algorithms.searching

/**
  * Reference: https://stackoverflow.com/questions/27167943/why-leftright-left-2-will-not-overflow
  */
object BinarySearch extends App {
   var n = 0
  def binarySearch(array: Array[Int], target: Int) = {
    def rec(start: Int, end: Int): Int = {
      n = n + 1
      if (start > end) -1 else {
        //val mid = (start + end) / 2
        val mid = start + Math.abs(start - end) / 2
        if (array(mid) == target) mid
        else if (array(mid) > target) rec(start, mid - 1)
        else rec(mid + 1, end)
      }
    }
    rec(0, array.length - 1)
  }

  val arr: Array[Int] = (1 to 512).toArray
  println(binarySearch(arr, 400))
  println("Number of steps: " + n)
}