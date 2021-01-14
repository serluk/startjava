public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        boolean sex = true;
        float height = 2;
        char first_letter_name = 'A';

        if(age > 20){
            System.out.println("Age greater 20");
        }
        if(sex){
            System.out.println("Male");
        }
        if(!sex){
            System.out.println("Female");
        }
        if(height < 1.80){
            System.out.println("growth is almost normal");
        }else{
            System.out.println("a little high average");
        }
    }
}