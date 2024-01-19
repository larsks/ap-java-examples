public class Main {
	public static void main(String[] args) {
		CalorieCount sunday = new CalorieCount(1500);
		assert sunday.onTrack();

		sunday.addMeal(716, 38, 38, 45);
		sunday.addMeal(230, 16, 8, 16);
		sunday.addMeal(568, 38, 50, 24);

		assert !sunday.onTrack();
		assert Math.abs(0.24 - sunday.getProteinPercentage()) < 0.005;
	}
}
