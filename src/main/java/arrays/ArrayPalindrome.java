package arrays;

public class ArrayPalindrome {

    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            if (arr[i] != arr[n - i - 1]) return false;
        return true;
    }

    public static int reverseDigits(int num, int rev) {
        if (num == 0) return rev;
        else return reverseDigits(num / 10, ((10 * rev) + num % 10));
    }

    public static boolean arrayOfPalindromesCheck(int[] arr) {
        for (int item: arr) {

        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 1};
        boolean check = isPalindrome(arr);
        if (check) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        System.out.println("Now...arr of palindromes check");
        int[] arr1 = {111, 222, 333, 444, 555};
    }
}