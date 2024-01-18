public class CalorieCount {
	private int calorieLimit;
	private int calorieIntake = 0;
	private int gramsOfProtein = 0;
	private int gramsOfCarbs = 0;
	private int gramsOfFat = 0;

	public CalorieCount(int limit) {
		calorieLimit = limit;
	}

	public void addMeal(int calories, int protein, int carbs, int fat) {
		calorieIntake += calories;
		gramsOfProtein += protein;
		gramsOfCarbs += carbs;
		gramsOfFat += fat;
	}

	public double getProteinPercentage() {
		return 4.0 * gramsOfProtein/calorieIntake;
	}

	public boolean onTrack() {
		return calorieIntake <= calorieLimit;
	}
}
