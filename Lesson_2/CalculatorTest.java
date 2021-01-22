import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner s = new Scanner(System.in);
        do {
            int num1 = s.nextInt();
            calculator.setNum1(num1);
            String op = s.next();
            calculator.setOp(op);
            int num2 = s.nextInt();
            calculator.setNum2(num2);
            System.out.println(calculator.result());
            System.out.println("Хотите продолжить вычисления? [да/нет]:");
        } while (s.next() != "нет");
    }
}
