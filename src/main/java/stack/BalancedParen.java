package stack;

import java.util.Scanner;

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