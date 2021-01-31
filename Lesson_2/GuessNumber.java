package player.guessnumber;
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

    public void start(GuessNumber players, int number){
        Scanner scan = new Scanner(System.in);
        int playerNumber1 = players.player1.getNumber();
        int playerNumber2 = players.player2.getNumber();
        System.out.println("Игрок 1 ввел число: " + playerNumber1);
        System.out.println("Игрок 2 ввел число: " + playerNumber2);
        while (true) {
            if (playerNumber1 < number) {
                playerNumber1++;
                System.out.println("Число игрока 1 меньше заданного");
            } else if (playerNumber1 > number) {
                System.out.println("Число игрока 1 больше заданного");
                playerNumber1 /= 2;
            } else if (playerNumber1 == number) {
                System.out.println("Игрок 1 угадал число");
                break;
            }  else if (playerNumber2 < number) {
                playerNumber1++;
                System.out.println("Число игрока 2 меньше заданного");
            } else if (playerNumber2 > number) {
                System.out.println("Число игрока 2 больше заданного");
                playerNumber1 /= 2;
            } else if (playerNumber2 == number) {
                System.out.println("Игрок 2 угадал число");
                break;
            }
        }
    }
}
