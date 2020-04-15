package algorithms.runtimecomplexity

object SortRunTime1 extends App {

  val start = System.currentTimeMillis()

  println("Enter array size: ")
  val size = scala.io.StdIn.readInt()
  val arr: Array[Int] = (1 to size).toArray

  println( arr.mkString("[", ",", "]"))
  val shuffledArray = scala.util.Random.shuffle(arr).toArray
  println( shuffledArray.mkString("[", ",", "]"))

 selectionSort(shuffledArray)

  val end = System.currentTimeMillis()
  println("Sorted array is: ")
  println( shuffledArray.mkString("[", ",", "]"))
  val seconds = ((end - start) / 1000) % 60
  println("Time taken by algorithm: " + seconds + " seconds")

  def selectionSort(list: Array[Int]): Unit = {

    def swap(list: Array[Int], i: Int, j: Int) = {
      var tmp = list(i)
      list(i) = list(j)
      list(j) = tmp
    }

    var i = 0
    while (i < (list.length - 1)) {
      var min = i
      var j = i + 1

      while (j < list.length) {
        if (list(j) < list(min)) {
          min = j
        }
        j += 1
      }

      swap(list, i, min)
      i += 1
    }
  }
}