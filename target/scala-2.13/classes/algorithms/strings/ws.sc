import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
/*
(0 to 100) foreach  { n =>
  val x = Future {
    println("starting Future: " + n)
   // blocking { Thread.sleep(3000) }
    println("ending Future: " + n)
  }
  x.mapTo[Unit]
}*/

val x: Future[Int] = Future(10)

