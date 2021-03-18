public class JaegerTest {
    public static void main(String[] args){
        Jaeger jaegerOne = new Jaeger();
        Jaeger jaegerTwo = new Jaeger();
        jaegerOne.setModelName("Kong");
        jaegerTwo.setModelName("Gozilla");
        System.out.println("Name robot 1 is " + jaegerOne.getModelName());
        System.out.println("Name robot 2 is " + jaegerTwo.getModelName());
        jaegerOne.setArmor(10);
        jaegerTwo.setArmor(9);
        System.out.println("Level armor robot 1: " + jaegerOne.getArmor());
        System.out.println("Level armor robot 2: " + jaegerTwo.getArmor());
        jaegerOne.setOrigin("Japan");
        jaegerTwo.setOrigin("USA");
        System.out.println("Origin robot 1: " + jaegerOne.getOrigin());
        System.out.println("Origin robot 2: " + jaegerTwo.getOrigin());
        jaegerOne.setHeight(121);
        jaegerTwo.setHeight(150);
        System.out.println("Height robot 1: " + jaegerOne.getHeight());
        System.out.println("Height robot 2: " + jaegerTwo.getHeight());
    }
}
