public class Calculator {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        char operation = '^';
        
        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else if (operation == '%') {
            System.out.println(num1 % num2);
        } else if (operation == '^') {
            int result = 1;
            for(int i = 0; i < num2; i++) {
                result *= num1;
            }
            System.out.println(result);
        }
    }
}