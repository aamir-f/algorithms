package algorithms.scala99

import java.util.NoSuchElementException

import scala.annotation.tailrec

object P01 extends App {

  //Predefined function
  def f0[T](list: List[T]): T = list.last

  //Tail recursion
  @tailrec
  def f1[T](list: List[T]): T = list match {
    case h :: Nil  => h
    case _ :: tail => f1(tail)
    case _         => throw new NoSuchElementException("list.empty")
  }

  //Chained calls
  def f2[T](list: List[T]): T = list.reverse.head

  // Haskell-like function composition, point-free style
  def f3[T]() = ((_: List[T]).head).compose((_: List[T]).reverse)
  def f4[T]() = ((_: List[T]).reverse).andThen((_ :List[T]).head)

  //java like implementation with side effects
  def f5[T](list: List[T]): T = {
    var result: Option[T] = None
    for(each <- list) result = Some(each)
    result.getOrElse(throw new NoSuchElementException("list.empty"))
  }

  //folding
  def f6[T](list: List[T]):T =
    if(list.nonEmpty) list.reduce((a, b) => b) else throw new NoSuchElementException("list.empty")


  val list: List[Int] = List(3,4,2,1,8)

  println(f0(list))
  println(f1(list))
  println(f2(list))
  println(f3()(list))
  println(f4()(list))
  println(f5(list))
  println(f6(list))


}