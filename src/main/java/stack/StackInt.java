package stack;

/**
Pros: Easy to implement. Memory is saved as pointers are not involved.
Cons: It is not dynamic. It doesn’t grow and shrink depending on needs at runtime.
 */
public class StackInt {
    final static int MAX = 1000;
    int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    boolean nonEmpty() {
        return !isEmpty();
    }

    StackInt() {
        top = -1;
    }

    boolean push(int x) {
        if(top > (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else return a[top--];
    }

    int peek() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else return a[top];
    }

    public static void main(String[] args) {

        StackInt s = new StackInt();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop() + " Popped from stack");
    }
}