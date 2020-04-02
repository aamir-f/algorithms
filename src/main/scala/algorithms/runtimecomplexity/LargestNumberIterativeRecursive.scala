package algorithms.runtimecomplexity

//worst case scenario ==> 0(n)
object LargestNumberIterative extends App {

    def largestIterative(array: Array[Int]) = {
       var biggestNumber = array(0)
       array foreach { elem =>
         if(elem > biggestNumber) biggestNumber = elem
       }
      biggestNumber
    }
  println(largestIterative(Array(3, 6, 8, 7, 5, 2)))

}

//0(n)
object LargestNumberRecursive extends App {

  def largestRecursive(array: Array[Int]) = {
     def rec(n: Int, highest: Int):Int = {
       if(n == -1) highest else {
         if(array(n) > highest)
            rec(n - 1, array(n))
         else rec(n - 1, highest)
       }
     }
    rec(array.length - 1, Integer.MIN_VALUE)
  }
  println(largestRecursive(Array(3, 6, 8, 7, 5, 2, 1, 28, 6, -20)))

}

/*
* Recursive time complexity
* T(n) = 0(1)(simple assignments and steps) + T(n - 1)
* T(-1) = 0(1) ==> Base condition
* T(n-1) = 0(1) + T((n-1) - 1) = 0(1) + T(n-2)
* T(n-2) = 0(1) +T(n-3)
*
* So T(n) = 1 + T(n-1)
*         = 1 + (1 + T(n - 2))
*         = 1 + (1 + (1 + T(n-3)))
*         = 3 + T(n-3)
*         = k + T(n - K)
*
* put k = n + 1
*         = n + 1 + T(n - n + 1)
*         = n + 1 + 1
*         = n
*/
