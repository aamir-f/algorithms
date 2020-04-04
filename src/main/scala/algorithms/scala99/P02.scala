package algorithms.scala99

import scala.annotation.tailrec

// P02 Find the last but one element of a list.

object P02 extends App {



  //tail recursion
  @tailrec
  def f0[T](list: List[T]): T = list match {
    case Nil => throw new NoSuchElementException("List is empty")
    //case x :: Nil => throw new NoSuchElementException("singleton list")
    case List(_)    => throw new NoSuchElementException("singleton list")
    case List(x, _) => x
    //case x :: _ :: Nil => x
    case _ :: tail => f0(tail)
  }

  //function application or chained calls
  def f1[T](list: List[T]): T = list.init.last

  //with error check
  def f2[T](list: List[T]): T = list.init.lastOption.getOrElse(throw new NoSuchElementException("---calling last of empty init----"))

  //using index
  def f3[T](list: List[T]): T = list.reverse(1)

  //with partial function lifting
  def f4[T](list: List[T]): T = list.reverse.lift(1).getOrElse(throw new NoSuchElementException("empty list or singleton list"))

  //using composition of function
  def f5[T]: List[T] => T = ((_: List[T]).last).compose((_: List[T]).init)

  println(f0(List(1, 2, 3, 4)))
  println(f1(List(1, 2, 3, 4)))
  println(f2(List(1, 2, 3, 4)))
  println(f3(List(1, 2, 3, 4)))
  println(f4(List(1, 2, 3, 4)))
  println(f5(List(1, 2, 3, 4)))

}