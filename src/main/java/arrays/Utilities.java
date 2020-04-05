package arrays;

public final class Utilities {

    public static int gcd(int num1, int num2) {
        if (num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public static int[] reverseArray(int[] arr) {
        int temp;
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
    }
}
