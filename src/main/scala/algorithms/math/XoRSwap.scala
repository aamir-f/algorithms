package algorithms.math

object Swap1 extends App {
   println("Input two num1: ")
   var num1 = scala.io.StdIn.readLine().toInt
   println("Input two num1: ")
   var num2 = scala.io.StdIn.readLine().toInt

   println(s"Before swap: num1 = $num1, num2 = $num2")
     num1 = num1 ^ num2
     num2 = num1 ^ num2
     num1 = num1 ^ num2
  println(s"After swap: num1 = $num1, num2 = $num2")
}

object Swap2 extends App {
  println("Input two num1: ")
  var num1 = scala.io.StdIn.readLine().toInt
  println("Input two num1: ")
  var num2 = scala.io.StdIn.readLine().toInt

  println(s"Before swap: num1 = $num1, num2 = $num2")
  num2 = num1 + num2
  num1 = num2 - num1
  num2 = num2 - num1
  println(s"After swap: num1 = $num1, num2 = $num2")
}