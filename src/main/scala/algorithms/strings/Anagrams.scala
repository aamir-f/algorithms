package algorithms.strings
object Anagrams1 extends App {
  //Time Complexity: O(nLogn)

  def checkUsingSorting(s1: String, s2: String) = {
    val charArray1 = s1.toCharArray.sorted

    val charArray2 = s2.toCharArray.sorted

    println(charArray1.mkString)
    println(charArray2.mkString)
    println(charArray1 sameElements charArray2)

  }

}

object Anagrams2 extends App {
def primeStream(stream: Stream[Int] = Stream.from(3, 2)): Stream[Int] = {
  stream.head #:: primeStream(stream.tail.filter(_ % stream.head != 0))
}

val primeList = 2 :: primeStream().take(25).toList
val charList = ('a' to 'z').toList
val primeAlphabet: Map[Char, Int] = charList.zip(primeList).toMap

def hashOf(string : String): Int = {
  string.trim().toLowerCase.foldLeft(1) { (hash, c) => hash *  primeAlphabet(c)}
  }

 def isAnagram(s : String , t : String ) : Boolean ={
   if(s == null || t == null || s.length != t.length) false
    else if(hashOf(s).equals(hashOf(t))) true
  else false
}

val pairs = Array(Array("apple", "papel"), Array("carrot", "tarroc"),Array("hello", "llloh"),Array("abba", "xyzz"))

for(p <- pairs){
  val word1 = p(0)
  val word2 = p(1)
  val anagram = isAnagram(word1, word2)
  println(word1 + ", " + word2 + ": " + anagram)
}
}

object Anagrams3 extends App {
 // (count charcters using one array)
  // O(n)
}
