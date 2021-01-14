public class Cycle {
    public static void main(String[] args) {
        for(int i = 0; i <= 20; i++){
            System.out.println(i);
        }
        
        System.out.println("");

        int num = 6;
        while(num >= -6){
            System.out.println(num);
            num -= 2;
        }

        System.out.println();

        int sum = 0;
        int currNum = 10;
        do{
            if(currNum % 2 != 0){
                sum += currNum;
            }
            currNum++;
        }while(currNum <= 20);

        System.out.println(sum);
    }
}