public class Array2DMultiples {
  /** Builds a two-dimensional array using the length of arr as the number of rows and
   * cols as the number of columns
   * @Precondition: arr.length > 0, cols > 0
   * @Postcondition: return the two-dimensional array
   */
  public static int[][] buildMatrix(int[] arr, int cols) {
    int[][] matrix = new int[arr.length][cols];
    for (int i=0; i<arr.length; i++) {
      for (int j=0; j<cols; j++) {
        matrix[i][j] = arr[i] * (j+1);
      }
    }
    return matrix;
  }

  /** Create a new array by removing all duplicate rows from arrWithDups
   * @Postcondition: arrWithDups is not modified
   * returns the new two-dimensional array with no duplicate rows
   */
  public static int[][] eliminateDuplicateRows(int[][] arrWithDups) {
    int[][] newArr = new int[0][0];
    int cols = arrWithDups[0].length;

    for (int i=0; i<arrWithDups.length; i++) {
      boolean found = false;
      for (int j=0; j<newArr.length; j++) {
        if (newArr[j][0] == arrWithDups[i][0]) {
          found=true;
        }
      }
      if (!found) {
        int[][] tmpArr = newArr;
        newArr = new int[newArr.length + 1][cols];
        for (int ii=0; ii<tmpArr.length; ii++) {
          for (int j=0; j<cols; j++) {
            newArr[ii][j] = tmpArr[ii][j];
          }
        }
        for (int j=0; j< cols; j++) {
          newArr[newArr.length-1][j] = arrWithDups[i][j];
        }
      }
    }

    return newArr;
  }
}

