package arrays.search;

import java.util.Scanner;

//https://stackoverflow.com/questions/27167943/why-leftright-left-2-will-not-overflow
public class BinarySearch {

    static int iterativeBinarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1, m = 0;
        while (l <= r) {

            m = l + (r - l) / 2;

            if (arr[m] == x) return m;

            if (x < arr[m]) r = m - 1;
            else l = m + 1;
        }
        return -1;
    }

    static int recursiveBinarySearch(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int m = l + (r - l) / 2;

            if (arr[m] == x) return m;

            if (x < arr[m]) return recursiveBinarySearch(arr, l, m - 1, x);
            else return recursiveBinarySearch(arr, m + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;
        //int result = iterativeBinarySearch(arr, x);
        int result = recursiveBinarySearch(arr, 0, arr.length - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}