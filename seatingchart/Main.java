public class Main {
	public static void main(String[] args) {
		Name names[] = {
			new Name("Shaw", "Noelle"),
			new Name("Olson", "Elliot"),
			new Name("Rice", "Isabel"),
			new Name("Golden", "Graham"),
			new Name("Gregory", "Giuliana"),
			new Name("Spears", "Travis"),
			new Name("Burke", "Isabela"),
			new Name("Sloan", "Jax"),
			new Name("Arnold", "Selene"),
			new Name("Hansen", "Abraham"),
			new Name("Patel", "Hope"),
			new Name("Bryant", "Parker"),
			new Name("Smith", "Parker"),
			new Name("Zamora", "Liam"),
			new Name("Avila", "Sierra"),
			new Name("Reynolds", "Jaylen"),
			new Name("Prince", "Isabelle"),
			new Name("Sparks", "Aron"),
			new Name("Crane", "Aisha"),
			new Name("McCann", "Fox"),
			new Name("Davila", "Joyce"),
			new Name("Miranda", "Grey"),
			new Name("Douglas", "Amina"),
			new Name("Wallace", "Derek"),
			new Name("Patrick", "Arianna"),
		};
		SeatingChart s = new SeatingChart(names, 5, 5);
		System.out.println(s);
	}
}
