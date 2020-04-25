package arrays;

public class ArrayPalindrome {

    public static boolean isPalindrome(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++)
            if (arr[i] != arr[n - i - 1]) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 1};
        boolean check = isPalindrome(arr);
        if (check) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}