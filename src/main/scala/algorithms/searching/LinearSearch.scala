package algorithms.searching

/**
  * Worst - O(n) // upper bound
  * Best - omega(1) // lower bound
  * Average - theta(n/2) 1+2+⋯+n comparisons... i.e if its in 3rd loc then we do 1 + 2-compa + 3 comparisons
  **/
object LinearSearch1 extends App {

  def linearSearch[A](list: List[A], key: A): Option[A] = list match {
    case Nil => None
    case h :: _ if h == key => Some(h)
    case _ :: tail => linearSearch(tail, key)
  }

  val result: Option[Int] = linearSearch(List(1, 2, 3, 4, 5, 6), 1)
  if (result.nonEmpty) println("Element present") else println("Not present")

}