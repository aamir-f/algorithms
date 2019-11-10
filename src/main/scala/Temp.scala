/*object Temp extends App {

  import scala.tools.reflect._
  import scala.reflect.runtime.currentMirror
  import scala.reflect.runtime.universe._

   val toolbox = currentMirror.mkToolBox()

   val code1 = q"""concat(lit("Aamir-"), col("first_name"), lit("-Deb-"), col("middle_name"))"""
  val result1 = toolbox.compile(code1)()
  println(result1)

}*/

