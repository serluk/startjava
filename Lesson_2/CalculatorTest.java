import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        do {
            int num1 = scan.nextInt();
            System.out.println("Введите первое число: " + num1);
            calculator.setNum1(num1);
            String op = scan.next();
            System.out.println("Введите знак математической операции: " + op);
            calculator.setOp(op);
            int num2 = scan.nextInt();
            System.out.println("Введите первое число: " + num2);
            calculator.setNum2(num2);
            System.out.println(calculator.result());
            System.out.println("Хотите продолжить вычисления? [да/нет]:");
            if (scan.next() == "нет") {
                break;
            }
            System.out.println("Хотите продолжить вычисления? [да/нет]:");
        } while (scan.next() != "нет");
    }
}
