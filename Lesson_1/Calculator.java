public class Calculator {
    public static void main(String[] args){
        int num1 = 3;
        int num2 = 6;
        char operation = '*';
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
            int count = 0;
            int prod = 1;
            do {
                prod *= num1;
                count++;
            } while (count < num2);
            System.out.println(prod);
        }
    }
}