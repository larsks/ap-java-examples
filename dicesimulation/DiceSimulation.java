import static java.lang.Math.*;

public class DiceSimulation {
	/** Sample size of simulation */
	private int numSampleSize;
	/** Number of faces on each die */
	private int numFaces;
	/** Constructs a DiceSimulation where sampleSize is the number of rolls to be simulated and
	 * faces is the number of faces on each die (some dice have more or fewer than 6 faces)
	 */
	public DiceSimulation(int numSamples, int faces) {
		numSampleSize = numSamples;
		numFaces = faces;
	}
	/** Returns an integer from 1 to the number of faces to simulate a die roll */
	public int roll() {
		return (int)(random()*numFaces) + 1;
	}
	/** Simulates rolling two dice with the number of faces given, for the number of sample size
	 * rolls. Returns the percentage of matches that were rolled
	 * as an integer (eg. 0.50 would be 50).
	 */
	public int runSimulation() {
		int matches = 0;

		for (int i=0; i<numSampleSize; i++) {
			int d1 = roll();
			int d2 = roll();

			if (d1 == d2) {
				matches++;
			}
		}
		
		return (int)(100 * (matches*1.0)/numSampleSize);
	}
}
