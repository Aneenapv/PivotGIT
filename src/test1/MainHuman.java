package test1;

public class MainHuman {

	public static void main(String[] args) {
		Human human = new Human();

		human.speak();
		human.write();
		human.run();

		String colourType = human.colour;
		System.out.println(colourType);

		human.read();

	}

}
