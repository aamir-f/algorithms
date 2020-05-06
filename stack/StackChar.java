package stack;

import java.util.Scanner;

public class StackChar {
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