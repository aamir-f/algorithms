package math;

import java.util.Scanner;

public class DecimalToBinary {

    static public String convert(int decimal, String result) {
        if (decimal == 0) return result;
        else return convert(decimal / 2, String.valueOf(decimal % 2) + result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        String result = convert(decimal, "");
        System.out.println("Binary rep. of " + decimal + " is " + result);
    }
}