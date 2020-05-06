package arrays;

import java.util.Map;
import java.util.HashMap;

public class CountElementFrequency {

    //Time Complexity : O(n2)
    //Auxiliary Space : O(n)
    static void method1(int[] arr) {
        int n = arr.length;
        int j = 0;
        int count = 0;
        boolean[] counterArray = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (counterArray[i]) continue;
            j = i + 1;
            count = 1;
            while (j < n) {
                if (arr[i] == arr[j]) {
                    count++;
                    counterArray[j] = true;
                }
                j++;
            }
            System.out.println(arr[i] + " --> " + count);
        }
    }

    //Time Complexity : O(n)
    //Auxiliary Space : O(n)
    static void method2(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i : arr) {
            if (mp.containsKey(i)) {
                mp.put(i, mp.get(arr[i]) + 1);
            } else {
                mp.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 3, 2, 5, 4, 2};
        method1(arr);
        System.out.println("=================");
        method2(arr);
    }
}