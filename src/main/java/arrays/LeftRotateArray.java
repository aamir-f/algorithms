package arrays;

public class LeftRotateArray {

    static public int gcd(int num1, int num2) {
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    static void reverse_array(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    //TC: O(n), aux space: O(d)
    static public void method2(int[] arr, int d) {
        int[] tempArray = new int[d];
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            tempArray[i] = arr[i];
        }

        for (int i = 0; i < n - d; i += 1) {
            arr[i] = arr[i + d];
        }

        for (int i = 0; i < d; i++) {
            arr[n - d + i] = tempArray[i];
        }
    }

    //TC: O(n * d)
    static public void method1(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            rotate(arr, n);
        }
    }

    //TC: O(n)
    static public void reversalAlgorigthm(int[] arr, int d) {
        int n = arr.length;
        reverse_array(arr, 0, d - 1);
        reverse_array(arr, d, n - 1);
        reverse_array(arr, 0, n - 1);
    }

    //TC: O(n)
    static public void jugglingAlgorithm1(int [] arr, int d) {
        int n = arr.length;
        for(int i = 0; i < gcd(n, d); i++) {
            int j = i;
            int temp = arr[i];
            int k = 0;
            while(true) {
                k = j + d;
                if(k >= n)
                    k = k - n;
                if(k == i) break;

                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }
    //TC: O(n)
    static public void jugglingAlgorithm2(int [] arr, int d) {
        int n = arr.length;
        for(int i = 0; i < gcd(n, d); i++) {
            int j = i;
            int temp = arr[i];
            int k = 0;
            while(true) {
                k = (j + d) % n;
                if(k == i) break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    static void rotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int i = 0;
        int[] arr = {1, 2, 3, 4, 5};
        //method1(arr, 2);
        //method2(arr, 3);
        //reversalAlgorigthm(arr, 2);
        //jugglingAlgorithm1(arr, 4);
        jugglingAlgorithm2(arr, 4);
        System.out.println("Array rotation: ");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}