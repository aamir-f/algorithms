package math.recursion;

import scala.math.BigInt;

import java.math.BigInteger;
import java.util.Scanner;

//http://www.maths.surrey.ac.uk/hosted-sites/R.Knott/Fibonacci/fibtable.html
public class FiboSeries {
    static BigInteger[] cache = new BigInteger[100];

    static BigInteger fiboRecursive(int n) {
        if (n <= 1) return BigInteger.valueOf(n);
        if (cache[n] != null) return cache[n];
        else
            cache[n] = fiboRecursive(n - 1).add(fiboRecursive(n - 2));
        return cache[n];
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
        for (int i = 0; i <= till; i++) {
            //System.out.println(i + "th :  " + fiboIterative(i));
            System.out.println(i + "th :  " + fiboRecursive(i));
        }
    }

    static void print(BigInteger[] arr) {
        for (BigInteger item : arr)
            System.out.println("item : " + item);
    }

    public static void main(String[] args) {
        long currentTime = System.nanoTime();
        fiboSeries(45);
        long elapsedTime = ((System.nanoTime() - currentTime) / 1_000_000_000);
        System.out.println("total time elapsed: " + elapsedTime + " seconds");
    }
}