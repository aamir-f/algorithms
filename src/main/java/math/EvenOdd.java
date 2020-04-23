package math;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number & 1;
        if (result == 1)
            System.out.println("odd number");
        else
            System.out.println("even number");

    }
}