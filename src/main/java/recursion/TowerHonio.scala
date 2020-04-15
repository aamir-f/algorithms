package recursion

import java.util.Scanner

object TowerOfHanoi extends App {

  def solve(n: Int, start: String, end: String, auxillary: String): Unit = {
    println(s"start: $start, end: $end, aux: $auxillary")
    if (n == 1) System.out.println(start + " -> " + end)
    else {
      solve(n - 1, start, auxillary, end)
      System.out.println(start + " -> " + end)
      println("---n------" + n)
      solve(n - 1, auxillary, end, start)
    }
  }

  println("Enter number of discs: ")
  val scanner = new Scanner(System.in)
  val discs = scanner.nextInt
  solve(discs, "A", "B", "C")
}