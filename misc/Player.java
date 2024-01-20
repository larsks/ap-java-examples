public class Player extends Person {
	private String position;

	Player(String name, int age, String pos) {
		super(name, age);
		position = pos;
	}

	public void changePosition(String pos) {
		position = pos;
	}
}
