package algorithms.stacks

/**
  * Time Complexity: O(n)
  * Auxiliary Space: O(n) for stack.
  */
object BalancedParenthesesOfExpression1 extends App {

  val charArray: Array[Char] = Array('{', '[', '(', ')', ']', '}')
  val stack = new StackChar()

  def checkBalanced() = {
    import scala.util.control.Breaks._
    var isBalanced = false
    breakable {
      for (element <- charArray) {

        if (element == '[' || element == '{' || element == '(') stack.push(element) else {

          if (element == '}' || element == ')' || element == ']') {
            if (stack.isEmpty) {
              isBalanced = false
            } else {
              if (matchParentheses(stack.pop(), element)) isBalanced = true else {
                isBalanced = false
                break
              }
            }
          } else {
            isBalanced = false
          }
        }
      }
    }

      if (isBalanced) {
        println("Expression has balanced parentheses")
      } else {
        println("Expression doesn't have balanced parentheses")
      }


  }

  def matchParentheses(char1: Char, char2: Char): Boolean = {
     if (char1 == '[' && char2 == ']') true
    else if (char1 == '{' && char2 == '}') true
    else if (char1 == '(' && char2 == ')') true
    else false
  }

  checkBalanced()

}