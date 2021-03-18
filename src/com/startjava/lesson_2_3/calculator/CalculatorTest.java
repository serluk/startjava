import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();        
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        calculator.setNum1(num1);
        System.out.print("Введите операцию: ");
        String sign = scan.next();
        calculator.setSign(sign);
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        calculator.setNum2(num2);
        System.out.println(calculator.result());
        String answer = "";
        do {
            System.out.println("Хотите продолжить вычисления? [да/нет]:"); 
            answer = scan.next();           
        } while (!(answer.contains("нет")) || (!answer.contains("нет")));
    }
}
