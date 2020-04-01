package algorithms.math

object DecimalToBinary extends App {

  def toBinary(n: Int): String = {
    @scala.annotation.tailrec
    def loop(x: Int, acc: String): String = {
      if (x == 0) acc else loop(x / 2, s"${(x % 2)}$acc")
    }

    loop(n, "")
  }
  println(toBinary(4))
  println(toBinary(7))
  println(toBinary(73))
}