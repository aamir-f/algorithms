package algorithms.stacks

/**
  * Time Complexity: O(n)
  * Auxiliary Space: O(n) for stack.
  */
object BalancedParenthesesOfExpression1 extends App {

  val charArray: Array[Char] = Array('{', '[', '(', ')', ']', '}', '(', ')')
  val stack = new StackChar()

  def checkBalanced(): Boolean = {
    import scala.util.control.Breaks._
    breakable {
      for (element <- charArray) {

        if (element == '[' || element == '{' || element == '(') stack.push(element)

        if (element == '}' || element == ')' || element == ']') {
          if (stack.isEmpty) {
            return false
          } else {
            if (!matchParentheses(stack.pop(), element)) {
              return false
            }
          }
        }

      }
    }

    if (stack.isEmpty) true else false
  }

  def matchParentheses(char1: Char, char2: Char): Boolean = {
    if (char1 == '[' && char2 == ']') true
    else if (char1 == '{' && char2 == '}') true
    else if (char1 == '(' && char2 == ')') true
    else false
  }

  if (checkBalanced()) {
    println("Balanced")
  } else {
    println("Not Balanced")
  }

}