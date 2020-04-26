package math;

import java.util.Scanner;

public class ReverseNumber {

    public static int reverseDigits(int num, int rev) {
        if (num == 0) return rev;
        else return reverseDigits(num / 10, ((10 * rev) + num % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            int result = reverseDigits(num, 0);
            System.out.println("Number :" + num + ", Reverse: " + result);
        }
    }
}