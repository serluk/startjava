public class MyFirstGame {
    public static void main(String[] args) {
        int hiddenNumber = 10;
        int playerNumber = 12;
        while (playerNumber != hiddenNumber) {
            if (playerNumber < hiddenNumber) {
                playerNumber++;
                System.out.println("Число меньше заданного");
            } else if (playerNumber > hiddenNumber) {
                System.out.println("Число больше заданного");
                playerNumber /= 2;
            }
        }
        System.out.println("Число угадано");
    }
}
