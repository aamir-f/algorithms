package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveMaxMinTillOne {

    static int removeMaxMine(int [] a) {
        Arrays.sort(a);
        int n = a.length;
        if(n % 2 == 0) return a[n/2 - 1];
        else return a[n / 2];
    }
    public static void main(String[] args) {

        int arr [] = {8, 1, 2, 9, 4, 3, 7, 5};
        int res = removeMaxMine(arr);
        System.out.println(res);

    }
}