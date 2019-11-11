package algorithms;

// A Stack based Java program to find next
// greater element for all array elements
// in same order as input.

import java.util.*;

public class JavaProgram {

    /* prints element and NGE pair for all
    elements of arr[] of size n */
    static void printNGE(int arr[], int n) {
        Stack<Integer> s = new Stack<Integer>();

        int arr1[] = new int[n];

        // iterating from n-1 to 0
        for (int i = n - 1; i >= 0; i--) {
		/*We will pop till we get the
		greater element on top or stack gets empty*/

            while (!s.isEmpty() && s.peek() <= arr[i]) {
                System.out.println("peek :  =>" + s.peek());
                s.pop();
            }

		/*if stack gots empty means there
		is no element on right which is greater
		than the current element.
		if not empty then the next greater
		element is on top of stack*/

            System.out.println(s.isEmpty());
            System.out.println(";;111; arr1[" + i + "]" + ":  =>" + arr1[i]);

            if (s.empty())
                arr1[i] = -1;
            else
                arr1[i] = s.peek();
            System.out.println(";;222; arr1[" + i + "]" + ":  =>" + arr1[i]);

            System.out.println("arr[" + i + "]" + ":  =>" + arr[i]);
            s.push(arr[i]);
            System.out.println("==================================================");
        }

        for (int i = 0; i < n; i++)
            System.out.println(arr[i] + " ---> " + arr1[i]);
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        int arr[] = {11, 13, 21, 3};
        int n = arr.length;
        printNGE(arr, n);
    }
}

