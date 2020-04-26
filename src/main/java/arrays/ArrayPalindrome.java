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
        for (int item : arr) {
            if (item != reverseDigits(item, 0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        boolean check1 = isPalindrome(arr);
        if (check1) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");

        System.out.println("");
        System.out.println("============================");
        int[] arr1 = {111, 222, 333, 444, 555};
        boolean check2 = arrayOfPalindromesCheck(arr1);
        if (check2) System.out.println("array of Palindrome");
        else System.out.println("Not array of Palindrome");
    }
}