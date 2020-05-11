public class TappingRainWater {

static int calculate(int [] arr) {
  int sum = 0;
  int n = arr.length;
  for(int i = 0; i < arr.length; i++) {

    int left = arr[i];
    for(int j = 0; j < i; j++) {
      left = Math.max(left, arr[j]);
    }
    int right = arr[i];
    for(int j = i + 1; j < n; j++) {
      right = Math.max(right, arr[j]);
    }

     sum = sum + (Math.min(left, right) - arr[i]);
  }
  return sum;
}
  public static void main(String [] args) {
    int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    int res= calculate(arr);
    System.out.println("Water: " + res);
  }
}
