package math;

import java.util.Scanner;

public class BinaryToDecimal {

    static public int convert(int binary, int result, int base) {
        if (binary == 0) return result;
        else {
            int temp = result + (binary % 10) * base;
            return convert(binary / 10, temp, base * 2);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Binary number: ");
        int binary = sc.nextInt();
        int result = convert(binary, 0, 1);
        System.out.println("Decimal rep. of " + binary + " is " + result);
    }
}