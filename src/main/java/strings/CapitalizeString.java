package strings;

import java.util.Scanner;

//https://practice.geeksforgeeks.org/problems/change-the-string/0
public class CapitalizeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            System.out.println("Enter a string: ");
            String s = sc.next();

            if (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') System.out.println(s.toUpperCase());
            else System.out.println(s.toLowerCase());

        }
    }
}