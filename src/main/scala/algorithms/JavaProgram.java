package algorithms;

import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of games to play:");
        int g = 1; //sc.nextInt();
        for (int tc = 0; tc < g; tc++) {

            System.out.println("Enter Stack A size");
            int n = 4;//sc.nextInt();
            System.out.println("Enter Stack B size");
            int m = 4;//sc.nextInt();
            System.out.println("Enter Sum limit:");
            int x = 35;//sc.nextInt();
            System.out.println("Enter Stack A");
            int[] a = {5,10,4,5};//readArray(sc, n);
            System.out.println("Enter Stack B");
            int[] b = {4,5,4,5};//readArray(sc, m);

            System.out.println("Score :");
            System.out.println(solve(a, b, x));
        }

        sc.close();
    }

    static int[] readArray(Scanner sc, int size) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            result[i] = sc.nextInt();
        }
        return result;
    }

    static int solve(int[] a, int[] b, int x) {
        int lengthB = 0;
        int sum = 0;
        while (lengthB < b.length && sum + b[lengthB] <= x) {
            sum += b[lengthB];
            lengthB++;
        }

        int maxScore = lengthB;
        for (int lengthA = 1; lengthA <= a.length; lengthA++) {
            sum += a[lengthA - 1];

            while (sum > x && lengthB > 0) {
                lengthB--;
                sum -= b[lengthB];
            }

            if (sum > x) {
                break;
            }

            maxScore = Math.max(maxScore, lengthA + lengthB);
        }
        return maxScore;
    }
}