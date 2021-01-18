public class MyFirstGame {
    public static void main(String[] args){
        int hiddenNumber = 10;
        int playerNumber = 5;

        do {
            if(hiddenNumber > playerNumber) {
                System.out.println("Заданное число болльше введенного");
            } else if(hiddenNumber < playerNumber){
                System.out.println("Заданное число меньше введенного");
            }
            playerNumber += 5;         
        }while (playerNumber != hiddenNumber);
        System.out.println("Число угадано");
    }
}
