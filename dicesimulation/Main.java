public class Main {
	public static void main(String[] args) {
		DiceSimulation d = new DiceSimulation(100, 6);
		int matches = d.runSimulation();
		System.out.println(matches + " matches");
	}
}
