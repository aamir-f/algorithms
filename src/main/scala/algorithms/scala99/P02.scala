package algorithms.scala99

object P02 extends App {
  val l: PartialFunction[Int , Int] = List(1, 2, 3)
  val lifted: Int => Option[Int] = l.lift
  println(l)
}