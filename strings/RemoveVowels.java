package strings;

import java.util.Arrays;
import java.util.List;

import java.util.Scanner;

public class RemoveVowels {

    static String removeVowels(String str) {
        Character[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> list = Arrays.asList(vowels);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) res = res + "";
            else res = res + str.charAt(i);
        }
        return res;
    }

    static String usingRegex(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        while (t > 0) {
            System.out.println("Enter a string: ");
            String str = sc.nextLine();
            String result = removeVowels(str);
            System.out.println(result);
            t--;
        }
    }
}