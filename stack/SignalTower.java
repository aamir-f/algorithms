package stack;

public class SignalTower {

    //TC: O(n*n)
    static int[] bruteForce(int[] arr) {
        int[] res = new int[arr.length];
        res[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j] <= arr[i]) res[i]++;
                else break;
            }
        }
        return res;
    }

    static int [] usingStack(int [] arr) {
        int [] res = new int[arr.length];
        StackInt stack = new StackInt();
        for(int i = 0; i < arr.length; i++) {
            while(stack.nonEmpty() && arr[i] > arr[stack.peek()])
                stack.pop();

            if(stack.isEmpty()) res[i] = i + 1;
            else res[i] = i - stack.peek();

            stack.push(i);
        }
        return res;
    }

    static void print(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {100, 80, 60, 70, 60, 75, 85
        };
        print(arr);
        //int[] res = bruteForce(arr);
        int[] res = usingStack(arr);
        print(res);

    }
}