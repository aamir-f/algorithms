public class GameOfTwoStacks {

static int solve(int[] a, int[] b, int x) {
     int lengthB = 0;
     int sum = 0;
     while (lengthB < b.length && sum + b[lengthB] <= x) {
         sum += b[lengthB];
         lengthB++;
     }

     int maxScore = lengthB;
     System.out.println("lengthB --> " + lengthB);
     System.out.println("maxScore --> " + maxScore);

     for (int lengthA = 1; lengthA <= a.length; lengthA++) {
       System.out.println("sum == " + sum);
         sum += a[lengthA - 1];


         while (sum > x && lengthB > 0) {
           System.out.println("Sum Loop ==>" + sum);
             lengthB--;
             sum -= b[lengthB];
         }

         if (sum > x) {
             break;
         }
         System.out.println("lengthA --> " + lengthA);
         System.out.println("lengthB --> " + lengthB);
         System.out.println("maxScore --> " + maxScore);

         maxScore = Math.max(maxScore, lengthA + lengthB);
     }
     return maxScore;
 }
  public static void main(String[] args) {

      int [] a = {1,1,1,1,1};
      int [] b = {2,1,2,1,2};
      int x = 7;
      System.out.println(solve(a, b, x));
  }
}
