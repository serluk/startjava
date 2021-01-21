public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setNickname("Jack");
        System.out.println("Nickname: " + wolf.getNickname());
        wolf.setSex("male");
        System.out.println("Sex: " + wolf.getSex());
        wolf.setWeight(25);
        System.out.println("Weight: " + wolf.getWeight());
        wolf.setAge(8);
        System.out.println("Age: " + wolf.getAge());
        wolf.setColor("grey");
        System.out.println("Color: " + wolf.getColor());


        

        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}