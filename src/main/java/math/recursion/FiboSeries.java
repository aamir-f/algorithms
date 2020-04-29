package math.recursion;

import java.math.BigInteger;
import java.util.Scanner;
//http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
public class FiboSeries {
    static BigInteger fiboRecursive(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        else return fiboRecursive(n - 1).add(fiboRecursive(n - 2));
    }

    //TC: O(n)
    static BigInteger fiboIterative(int n) {
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("1");
        if (n <= 1) return BigInteger.valueOf(n);

        while (n > 2) {
            a = b;
            b = c;
            c = a.add(b);
            n--;
        }
        return c;
    }

    static void fiboSeries(int till) {
        for (int i = 0; i < till; i++) {
            System.out.println(fiboIterative(i));
        }
    }

    public static void main(String[] args) {

        fiboSeries(100);
    }
}