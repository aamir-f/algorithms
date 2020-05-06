
class StackChar {
    final static int MAX = 1000;
    int top;
    char a[] = new char[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    boolean nonEmpty() {
        return !isEmpty();
    }

    StackChar() {
        top = -1;
    }

    boolean push(char x) {
        if (top > (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    char pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else return a[top--];
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else return a[top];
    }

}
public class BalancedParen {

    static boolean areParenthesisBalanced(char[] inputArray) {
        StackChar stk = new StackChar();

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == '(' || inputArray[i] == '{' || inputArray[i] == '[')
                stk.push(inputArray[i]);

            if (inputArray[i] == ')' || inputArray[i] == '}' || inputArray[i] == ']') {
                if (stk.isEmpty()) return false;
                else {
                    if (!isMatching(stk.pop(), inputArray[i]))
                        return false;
                }
            }
//some changes for commit
        }
        if (stk.isEmpty()) return true;
        else return false;
    }

    static boolean isMatching(char c1, char c2) {
        if (c1 == '(' && c2 == ')') return true;
        else if (c1 == '[' && c2 == ']') return true;
        else if (c1 == '{' && c2 == '}') return true;
        else return false;
    }

    public static void main(String[] args) {

        char exp[] = {'{', '(', ')', '[', '[', ']'};
        if (areParenthesisBalanced(exp))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
