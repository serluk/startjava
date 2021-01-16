public class MyFirstGame {
    public static void main(String[] args){
        int hiddenNumber = 10;
        int num1 = 5;
        int num2 = 21;
        int num3 = 9;
        int num4 = 10;
        do {
            if(hiddenNumber > num1) {
                System.out.println("Заданное число болльше введенного");
            } else {
                System.out.println("Заданное число меньше введенного");
            }
            if(hiddenNumber > num2) {
                System.out.println("Заданное число болльше введенного");
            } else {
                System.out.println("Заданное число меньше введенного");
            }
            if(hiddenNumber > num3) {
                System.out.println("Заданное число болльше введенного");
            } else {
                System.out.println("Заданное число меньше введенного");
            }
        }while (num4 != hiddenNumber);
        System.out.println("Число угадано");
    }
}
