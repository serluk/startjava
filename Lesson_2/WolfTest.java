public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf = new Wolf();
		wolf.nickname = "Jack";
		wolf.sex = "male";
		wolf.weight = 30;
		wolf.color = "grey";
		wolf.age = 3;

		System.out.println("Nickname: " + wolf.nickname);
		System.out.println("Sex: " + wolf.sex);
		System.out.println("Color: " + wolf.color);
		System.out.println("Weight: " + wolf.weight);
		System.out.println("Age: " + wolf.age);

		wolf.go();
		wolf.sit();
		wolf.run();
		wolf.howl();
		wolf.hunt();
	}
}