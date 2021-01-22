public class Calculator {
    private int num1;
    private int num2;
    private String sign;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void setOp(String sign) {
        this.sign = sign;
    }

    public double result() {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "%":
                return num1 % num2;
            case "^":
               double result = 1;
                for(int i = 0; i < num2; i++) {
                    result *= num1;
                }
                return result;                
        }
        return 0;        
      }
}
