import java.util.Scanner;


public class ProgrammerSkill {
  static void checkSkill(int [] player1Skills, int [] player2Skills)  {
     int player1 = 0;
     int player2 = 0;
     for(int i = 0 ; i < 3; i++) {
       if(player1Skills[i] > player2Skills[i]) player1++;
       if(player2Skills[i] > player1Skills[i]) player2++;

     }
     System.out.println(player1 + " " + player2);
  }

  public static void main(String[] args) {

      int [] player1 = {4, 2, 7};
      int [] player2 = {5, 6, 3};

      checkSkill(player1, player2);

}
}
