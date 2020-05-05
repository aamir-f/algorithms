package stack;

import java.util.Scanner;

public class NextGreatestElement {
    //TC: O(n * n)
    //worst case occurs when array is sorted in decreasing order.
    static void bruteForce(int[] arr) {
        int next;
        for (int i = 0; i < arr.length; i++) {
            next = -1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " --> " + next);
        }
    }

    static void usingStack(int[] arr) {

    }

    public static void main(String[] args) {

        int arr[] = {4, 1, 12, 14, 1};
        bruteForce(arr);
    }
}