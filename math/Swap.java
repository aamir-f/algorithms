package math;

import java.util.Scanner;

public class Swap {

    static public void method1(int num1, int num2) {
        System.out.println("Before Swap: num1, num2 :" + num1 + " , " + num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swap: num1, num2 :" + num1 + " , " + num2);
    }

    static public void method2(int num1, int num2) {
        System.out.println("Before Swap: num1, num2 :" + num1 + " , " + num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num2 ^ num1;
        System.out.println("After Swap: num1, num2 :" + num1 + " , " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter  number2: ");
        int num2 = sc.nextInt();
        method1(num1, num2);
        method2(num1, num2);
    }
}