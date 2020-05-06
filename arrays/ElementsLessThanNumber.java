package arrays;

import java.util.Scanner;
//condition , arr will be sorted always
public class ElementsLessThanNumber {

    //TC: O(log n)
    static int binarySearchCount(int arr[], int key) {
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= key) {
                count = mid + 1;
                left = mid + 1;
            } else right = mid - 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr [] = {1, 2, 4, 32, 44, 55};
        int key = 45;
        int n = arr.length;

        System.out.println(binarySearchCount(arr, key));
    }

}