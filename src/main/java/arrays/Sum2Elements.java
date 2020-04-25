package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sum2Elements {

    public static void method2(int[] arr, int sum) {
        java.util.HashSet<Integer> s = new HashSet<Integer>();
        for (int item : arr) {
            int diff = sum - item;
            if (s.contains(diff)) {
                System.out.println("arr element " + diff + " and " + item + " equal to sum " + sum);
            } else {
                s.add(item);
            }
        }
    }

    public static void method1(int[] arr, int sum) {
        int n = arr.length;
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (arr[start] + arr[end] == sum) {
                System.out.println("arr element " + arr[start] + " and " + arr[end] + " equal to sum " + sum);
                return;
            } else if (arr[start] + arr[end] < sum) start++;
            else end--;
        }
    }


    public static void main(String[] args) {
        int[] arr = {11, 23, 3, 16, 1, 2};
        method1(arr, 26);
        method1(arr, 26);
        System.out.println();
    }
}