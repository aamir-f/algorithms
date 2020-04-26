package math;

import java.util.Scanner;

public class NumberIsBinaryNumber {

    public static boolean method1(int num) {
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0' && str.charAt(i) != '1') return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            boolean result = method1(num);
            System.out.println("Input number " + num + " is binary : " + result);
        }
    }
}