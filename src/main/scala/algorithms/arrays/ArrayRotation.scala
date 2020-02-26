package algorithms.arrays

/**
  * Reference: https://www.geeksforgeeks.org/array-rotation/
  * including scala99 solutions also
  */

/**
  * Method1:
  * Time complexity : O(n)
  * Auxiliary Space : O(d)
  */
object ArrayRotation1 extends App {

  var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val n = arr.length
  println("Enter number of rotations: ")
  val d: Int = scala.io.StdIn.readInt()
  val tempArray = new Array[Int](d)
  //val tempArray = Array.fill(3){0}

  for (i <- 0 until n) {
    if (i < d) {
      tempArray(i) = arr(i)
    } else {
      arr(i - d) = arr(i)
    }
  }
  println(s"rotated array is ${tempArray.mkString("[", ",", "]")}")

  for (i <- 0 until d) {
    arr(n - (d - i)) = tempArray(i)
  }


  println(s"rotated array is ${arr.mkString("[", ",", "]")}")

}

/**
  * Method2:
  * Time complexity : O(n * d)
  * Auxiliary Space : O(1)
  */

object ArrayRotation2 extends App {

  var arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val n = arr.length
  println("Enter number of rotations: ")
  val d: Int = scala.io.StdIn.readInt()

  def leftRotate(size: Int, rotations: Int) = {
    def leftRotateByOne(rotations: Int) = {
      if (rotations == 0) arr else {
      }
    }
  }

  leftRotate(n, d)
  println(s"rotated array is ${arr.mkString("[", ",", "]")}")

}

/**
  * Juggling Algorithm
  * Time complexity: 0(n)
  * Space complexity: 0(1)
  */

object ArrayRotation3 extends App {

  var arr = Array(1, 2, 3, 4, 5, 6, 7)
  val n = arr.length
  println("Enter number of rotations: ")
  val d: Int = scala.io.StdIn.readInt()

  import scala.util.control.Breaks._

  def rightRotate(n: Int, k: Int) = {
    var i = 0
    while (i < Utilities.gcd(n, k)) {
      val temp = arr(i)
      var j = i
      breakable {
        while (true) {
          val nextIndex = (j + k) % n
          if (nextIndex == i) break
          arr(j) = arr(nextIndex)
          j = nextIndex
        }
      }

      arr(j) = temp
      i += 1
    }

  }

  rightRotate(n, d)
  println(s"right rotated array is ${arr.mkString("[", ",", "]")}")

}
