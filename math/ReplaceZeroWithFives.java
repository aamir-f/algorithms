package math;

import java.util.Scanner;

public class ReplaceZeroWithFives {

    public static int method2(int n) {
        int q = n;
        int i = 1;
        while (n > 0) {
            if (n % 10 == 0) {
                q = q + (i * 5);
            }
            n = n / 10;
            i = i * 10;
        }
        return q;
    }

    public static String method1(int num) {
        String str = String.valueOf(num);
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') finalStr.append("5");
            else finalStr.append(str.charAt(i));
        }
        return finalStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int result = method2(num);
            System.out.println("Input number: " + num + ", result: " + result);
        }

    }
}