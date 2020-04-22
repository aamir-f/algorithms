package arrays;

public class LeftRotateArray {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        int arr [] = {1,2,3,4,5,6};
        while(true) {
            System.out.println(arr[i % arr.length]);
            Thread.sleep(1000);
            i++;
        }
    }
}