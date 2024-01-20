public class Data {

  public static final int MAX = 1000;
  private int[][] grid;

  public Data(int rows, int cols) {
    grid = new int[rows][cols];
  }

  /** Fills all elements of grid with randomly generated values, as described in part (a)
   * Precondition: grid is not null.
   * grid has at least one element.
   */
  public void repopulate() {
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        while (true) {
          int val = (int) (Math.random() * MAX);
          if (val % 100 != 0 && val % 10 == 0) {
            grid[i][j] = val;
            break;
          }
        }
      }
    }
  }

  /** Returns the number of columns in grid that are in increasing order, as described
   * in part (b)
   * Precondition: grid is not null.
   * grid has at least one element.
   */
  public int countIncreasingCols() {
    int cols = 0;

    for (int j=0; j<grid[0].length; j++) {
      boolean increasing = false;
      for (int i=0; i<grid.length; i++) {
        increasing = (i == 0 || (increasing && grid[i-1][j] <= grid[i][j]));
      }
      if (increasing) cols++;
    }
    return cols;
  }
  // There may be instance variables, constructors, and methods that are not shown.

  public int[][] getData() {
    return grid;
  }
}
