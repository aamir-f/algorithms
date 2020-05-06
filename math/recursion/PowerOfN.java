package math.recursion;

import java.util.Scanner;

public class PowerOfN {

    //TC: O(n)
    static int method1(int base, int exponential) {
        if (exponential == 0) return 1;
        else return base * method1(base, exponential - 1);
    }

    //TC: O(logn)
    static int method2(int base, int exponential) {
        if (exponential == 0) return 1;
        if (exponential % 2 == 0) {
            int x = method2(base, exponential / 2);
            return x * x;
        }
        return base * method2(base, exponential - 1);
    }

    public static void main(String[] args) {

        System.out.println(method1(2, 28));
    }
}