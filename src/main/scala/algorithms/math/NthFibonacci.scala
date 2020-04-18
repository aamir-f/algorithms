package algorithms.math

import scala.annotation.tailrec

object NthFibonacci1 extends App {
  def nthFibonacci(n: BigInt): BigInt = {
    @tailrec
    def fibo(i: BigInt, acc1: BigInt, acc2: BigInt): BigInt = {
      if (i == 1) acc2
      else fibo(i - 1, acc2, acc1 + acc2)
    }

    if (n <= 2) BigInt(1) else {
      fibo(n, BigInt(0), BigInt(1))
    }

  }

  val currentTime = System.nanoTime()
   println(nthFibonacci(8)) //  354224848179261915075
  val elapsedTime = ((System.nanoTime() - currentTime) / 1_000_000_000).asInstanceOf[Double]
  println("total time with tail recursion: " + elapsedTime)
}

object NthFibonacci2 extends App {
  def fiboRecursive(n: BigInt): BigInt = {
    if (n <= 2) 1 else {
      fiboRecursive(n - 1) + fiboRecursive(n - 2)
    }
  }

  val currentTime = System.nanoTime()
  println(fiboRecursive(100)) // goes forever
  val elapsedTime = ((System.nanoTime() - currentTime) / 1_000_000_000).asInstanceOf[Double]
  println("total time: " + elapsedTime)

}
