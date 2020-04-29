package math.recursion;
import java.util.Scanner;
//https://www.youtube.com/watch?v=Ajy8XweC3L8
public class TowerOfHanoi {

    static void tower(int n, char s, char a, char d) {
        if(n == 1) {
            System.out.println(s + " -> " + d);
            return;
        } else {
            tower(n - 1, s, d, a);
            System.out.println(s + " -> " + d);
            tower(n - 1, a, s, d);
        }
    }
    public static void main(String[] args) {

      tower(3, 's', 'a', 'd');
    }
}