package arrays;

import java.util.Arrays;

public class ArrayZigZag {

    //TC: O(nlogn)
    public static void method1(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
        System.out.println("ZigZag array: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    //TC: O(n)
    public static void method2(int[] arr) {

        boolean flag = true;

        for (int i = 0; i < arr.length - 2; i += 1) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
        System.out.println("ZigZag array: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 10, 12, 20, 40};
        method1(arr);
        System.out.println();
        method2(arr);
    }
}