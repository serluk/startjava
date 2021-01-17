public class MyFirstGame {
    public static void main(String[] args){
        int hiddenNumber = 10;
        int num = 5;

        do {
            if(hiddenNumber > num) {
                System.out.println("Заданное число болльше введенного");
            } else {
                System.out.println("Заданное число меньше введенного");
            }
            num = num + 6;
            if(hiddenNumber < num) {
            	System.out.println("Заданное число меньше введенного");
            }
            num = num - 1;
         
        }while (num != hiddenNumber);
        System.out.println("Число угадано");
    }
}
