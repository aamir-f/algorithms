package math;

import java.util.Scanner;

public class  GCD {

    static public int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter  number2: ");
        int num2 = sc.nextInt();

        int gcd = gcd(num1, num2);
        System.out.println("GCD is :==> " + gcd);
    }
}