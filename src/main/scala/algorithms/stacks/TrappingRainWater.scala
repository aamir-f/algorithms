package algorithms.stacks

/**
  * Brute Force: O(n * n)
  */
object TrappingRainWater1 extends App {

  val arr = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)

  var i = 0
  var left = 0
  var right = 0
  var leftMax = 0
  var rightMax = 0
  var count = 0

  while (i < arr.length) {
    leftMax = arr(i)
    rightMax = arr(i)
    left = i - 1
    while (left >= 0) {
      if (arr(left) > leftMax) {
        leftMax = arr(left)
      }
      left -= 1
    }
    right = i + 1
    while (right < arr.length) {
      if (arr(right) > rightMax) {
        rightMax = arr(right)
      }
      right += 1
    }
    count = count + Math.abs(Math.min(leftMax, rightMax) - arr(i))
    i += 1
  }

  println(s"Total Water trapped: $count units...")
}

/**
  * Stack implementation: O(n)
  */

object TrappingRainWater2 extends App {

  val stackInt = new StackInt
  val arr = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
  var i = 0
  var counter = 0
  while (i < arr.length) {

    while (!stackInt.isEmpty && arr(stackInt.peek()) < arr(i)) {
      val poppedElement = arr(stackInt.pop())
      val maxLeft = if(stackInt.isEmpty) poppedElement else arr(stackInt.peek())
      val maxRight = arr(i)
      val height = Math.abs(Math.min(maxLeft, maxRight) - poppedElement)
      val width = if(stackInt.isEmpty) (i - 0) - 1 else (i - stackInt.peek()) - 1
      counter = counter + (height * width)
    }
    stackInt.push(i)
    i += 1
  }

  println("Total Water trapped: " + counter)
}
