package algorithms.stacks

/**
  * Brute Force: O(n * n)
  */
object TrappingRainWater1 extends App {

    val arr = Array(0,1,0,2,1,0,1,3,2,1,2,1)

    var i = 0
    var left = 0
    var right = 0
    var leftMax = 0
    var rightMax = 0
    var count = 0

   while(i < arr.length) {
     leftMax = arr(i)
     rightMax = arr(i)
     left = i - 1
     while(left >= 0) {
       if(arr(left) > leftMax) {
         leftMax = arr(left)
       }
       left -= 1
     }
     right = i + 1
     while(right < arr.length) {
       if(arr(right) > rightMax) {
         rightMax = arr(right)
       }
       right += 1
     }
     count = count + Math.abs(Math.min(leftMax, rightMax) - arr(i))
     i += 1
   }

  println(s"Total Water trapped: $count units...")
}
