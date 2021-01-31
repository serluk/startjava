package player.guessnumber;

public class GuessNumber {
    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start(GuessNumber players, int n){
        System.out.println("Игрок 1 ввел число: " + players.player1.getNumber());
        System.out.println("Игрок 2 ввел число: " + players.player2.getNumber());
        while (true) {
            if (players.player1.getNumber() < n) {
                System.out.println("Угадал игрок1");
                break;
            } else if (players.player2.getNumber() == n) {
                System.out.println("Угадал игрок2");
                break;
            }
        }
    }
}
