package algorithms.arrays

object Sum2ItemsList1 extends App {
  //Time Complexity: Depends on what sorting algorithm we use.
  def sum2ItemsCheck(list: List[Int], sum: Int) = {
    def loop(list: List[Int]): (Int, Int) = {
      if (list.tail.isEmpty) (-1, -1)
        else if (list.head + list.last == sum) (list.head, list.last)
        else if (list.head + list.last < sum) loop(list.tail)
        else loop(list.init)
    }
    loop(list)
  }

  val l = List(1, 4, 45, 6, 10, -8 )
  println{
    sum2ItemsCheck(l.sorted, 16)
  }
}

object Sum2ItemsList2 extends App {
  //Time Complexity: Depends on what sorting algorithm we use.
  def sum2ItemsCheck(list: List[Int], sum: Int) = {
    def loop(list: List[Int]): (Int, Int) = {
      if (list.tail.isEmpty) (-1, -1)
      else if (list.head + list.last == sum) (list.head, list.last)
      else if (list.head + list.last < sum) loop(list.tail)
      else loop(list.init)
    }
    loop(list)
  }

  val l = List(1, 4, 45, 6, 10, -8 )
  println{
    sum2ItemsCheck(l.sorted, 16)
  }
}