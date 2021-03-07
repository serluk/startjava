import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public GuessNumber() {
    }

    public int numberRandom(){
        Random random = new Random();
        int rand = random.nextInt(100);
        return rand;
    }

    public void start(){
      int rand = numberRandom();
      Scanner scan = new Scanner(System.in);
      while (true){
          System.out.print("Число игрока " + player1.getName() + ": ");
          player1.setNumber(scan.nextInt());
          if (player1.getNumber() == rand) {
              System.out.println(player1.getName() + " win");
              break;
          } else if(player1.getNumber() < rand){
              System.out.println("Число " + player1.getName() + " меньше заданного");
          } else {
              System.out.println("Число " + player1.getName() + " больше заданного");
          }
          System.out.print("Число игрока " + player2.getName() + ": ");
          player2.setNumber(scan.nextInt());
          if (player2.getNumber() == rand) {
              System.out.println(player2.getName() + " win");
              break;
          } else if(player2.getNumber() < rand){
              System.out.println("Число " + player2.getName() + " меньше заданного");
          } else {
              System.out.println("Число " + player2.getName() + " больше заданного");
          }
      }
    }
}
