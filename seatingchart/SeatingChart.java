public class SeatingChart {
	private String [][] chart;
	/** Constructs a SeatingChart having r rows and c columns. All elements contained in the
	 * names array should be placed randomly in the chart array using the format:
	 * lastName, firstName (e.g. Jolie, Angelina).
	 * Any locations not used in the chart should be
	 * initialized to the empty string.
	 */
	SeatingChart(Name[] names, int rows, int cols){
		chart = new String[rows][cols];
		int row;
		int col;

		// Initialize all positions to empty string
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				chart[i][j] = "";
			}
		}

		for (Name name: names) {
			String fullName = name.getLastName() + ", " + name.getFirstName();
			do {
				row = (int)(Math.random() * rows);
				col = (int)(Math.random() * cols);
			} while(! chart[row][col].equals(""));

			chart[row][col] = fullName;
			//System.out.println(fullName + " is seating at (" + row + ", " + col + ")");
		}
	}
	/** Returns a string containing all elements of the chart array in row-major order.
	 * The method should return a string containing all the elements in the chart array.
	 * The method padWithSpaces should be called on each
	 * element of the chart before it is added to the string to ensure each name will be
	 * printed with the same length.
	 * Each row of the chart should be separated by a line break.
	 */
	public String toString() {
		String output = new String();

		for (String[] cols: chart) {
			for (String name: cols) {
				output += padWithSpaces(name);
			}
			output += "\n";
		}

		return output;
	}
	/** Pads a string with spaces to ensure each string is exactly 35 characters long. */
	private String padWithSpaces(String s) {
		String str = s;
		for (int a = s.length(); a < 35; a++) {
			str += " ";
		}
		return str;
	}
}
