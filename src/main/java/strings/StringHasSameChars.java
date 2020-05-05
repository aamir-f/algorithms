package strings;

import java.util.Scanner;

public class StringHasSameChars {

    static boolean check(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            System.out.println("Enter a string: ");
            String s = sc.next();
            System.out.println(check(s));
        }

    }
}