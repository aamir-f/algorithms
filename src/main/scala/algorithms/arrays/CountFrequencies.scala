package algorithms.arrays

object CountFrequencies1 extends App {

  def countFreq(list: List[Int]) = {

    def loop(list: List[Int], map: Map[Int, Int]): Map[Int, Int] = {
      if (list.isEmpty) map else {
        if (map.contains(list.head)) loop(list.tail, map + (list.head -> (map(list.head) + 1)))
        else loop(list.tail, map + (list.head -> 1))
      }
    }

    loop(list, Map())
  }

  val l = List(10, 20, 10, 20, 30, 10)
  val res: Map[Int, Int] = l.groupBy(identity).map(x => (x._1, x._2.size))
  val arr = Array(10, 20, 10, 20, 30, 10)
  println {
    countFreq(l)
  }


}