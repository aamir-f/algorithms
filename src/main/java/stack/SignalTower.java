package stack;

import java.util.Scanner;

public class SignalTower {

    static void bruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int count = 1;

            while (j >= 0) {
                if (arr[j] > arr[i]) break;
                count++;
                j--;
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }

    public static void main(String[] args) {

        int [] arr = {100, 80, 70, 90, 120};
        bruteForce(arr);

    }
}