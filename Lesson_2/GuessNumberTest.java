package player.guessnumber;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args){
        Player player1 = new Player("Play1", 40);
        Player player2 = new Player("Play2", 65);
        Random rand = new Random();
        int random = rand.nextInt(100);
        GuessNumber gs = new GuessNumber(player1, player2);
        gs.start(gs, random);
    }
}
