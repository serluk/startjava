import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the first player: ");
        String name1 = scan.next();
        System.out.print("Enter the name of the second player: ");
        String name2 = scan.next();
        Player player1 = new Player(name1);
        Player player2 = new Player(name2);
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "";
        game.start();
        do {
            System.out.println("Хотите продолжить игру? [yes/no]:");
            answer = scan.next();
            if (answer.equals("yes")) {
                game.start();
            }
        } while (!answer.equals("no"));
    }
}
