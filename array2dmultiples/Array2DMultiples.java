import java.util.*;

public class Array2DMultiples {

  /** Builds a two-dimensional array using the length of arr as the number of rows and
   * cols as the number of columns
   * @Precondition: arr.length > 0, cols > 0
   * @Postcondition: return the two-dimensional array
   */
  public static int[][] buildMatrix(int[] arr, int cols) {
    int[][] matrix = new int[arr.length][cols];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < cols; j++) {
        matrix[i][j] = arr[i] * (j + 1);
      }
    }
    return matrix;
  }

  /** Create a new array by removing all duplicate rows from arrWithDups
   * @Postcondition: arrWithDups is not modified
   * returns the new two-dimensional array with no duplicate rows
   */
  public static int[][] eliminateDuplicateRows(int[][] arrWithDups) {
    return eliminateDuplicateRowsIterative(arrWithDups);
  }

  public static int[][] eliminateDuplicateRowsStream(int[][] arrWithDups) {
    Set<Integer> seen = new HashSet<>();

    return Arrays
      .stream(arrWithDups)
      .filter(x -> seen.add(x[0]))
      .toArray(int[][]::new);
  }

  public static int[][] eliminateDuplicateRowsIterative(int[][] arrWithDups) {
    Set<Integer> seen = new HashSet<>();
    ArrayList<int[]> cleaned = new ArrayList<>();

    for (int i = 0; i < arrWithDups.length; i++) {
      if (seen.add(arrWithDups[i][0])) {
        cleaned.add(arrWithDups[i]);
      }
    }
    return cleaned.toArray(int[][]::new);
  }
}
