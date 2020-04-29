package math.recursion;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumber {

    //TC: 2 pow n, Extra Space: O(n) if we consider the function call stack size, otherwise O(1).
    //first = 1, second = 1, third = 3
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


    //Fn = {[(√5 + 1)/2] ^ n} / √5
    //O(1)
    static int recUsingFormula(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int) Math.round(Math.pow(phi, n)
                / Math.sqrt(5));
    }

    public static void main(String[] args) {
        System.out.println(fiboRecursive(44));
        System.out.println(fiboIterative(44));
        //System.out.println(recUsingFormula(50));
    }
}