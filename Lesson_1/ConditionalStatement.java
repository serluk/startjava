public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if(age > 20) {
            System.out.println("Age greater 20");
        }
        System.out.println();

        boolean sex = true;
        if(sex) {
            System.out.println("Male");
        }
        if(!sex) {
            System.out.println("Female");
        }
        System.out.println();

        float height = 2;
        if(height < 1.80) {
            System.out.println("growth is almost normal");
        } else {
            System.out.println("a little high average");
        }
        System.out.println();

        char firstLetterName = 'A';
        if(firstLetterName == 'M') {
            System.out.println("First letter is M");
        } else if(firstLetterName == 'I') {
            System.out.println("First letter is I");
        } else {
            System.out.println("Another letter");
        }
    }
}