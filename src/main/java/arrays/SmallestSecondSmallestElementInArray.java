package arrays;

import java.util.Scanner;

public class SmallestSecondSmallestElementInArray {

    //sort and get arr[i] and arr[i+ 1]...O(nlogn)
    //traverse twice...one pass find smallest...second pass find second smallest..O(n)
    //best approach.... traverse only once

    static void method(int[] arr) {
        int first, second, third;
        first = second = third = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < first) {
                third = second;
                second = first;
                first = arr[i];
            }
            if (arr[i] < second && arr[i] != first)
                second = arr[i];
            if(arr[i] < third && arr[i] != second && arr[i] != first)
                third = arr[i];
        }
        if (second == Integer.MAX_VALUE)
            System.out.println("There is no second" +
                    "smallest element");
        else if (third == Integer.MAX_VALUE)
            System.out.println("There is no third" +
                    " smallest element");
        else
            System.out.println("The smallest element is " +
                    first + " and second Smallest" +
                    " element is " + second + " and third smallest" +
                    " element is " + third);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,1,1,3,1};
        method(arr);
    }
}