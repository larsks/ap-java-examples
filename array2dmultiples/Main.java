public class Main {

  public static void main(String[] args) {
    testBuildMatrix1();
    testBuildMatrix2();
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.printf("%3d ", matrix[i][j]);
      }
      System.out.println("");
    }
    System.out.println("");
  }

  public static void testBuildMatrix1() {
    int[][] matrix = Array2DMultiples.buildMatrix(new int[] { 7, 6, 2, 6 }, 5);
    int[][] expected1 = {
      { 7, 14, 21, 28, 35 },
      { 6, 12, 18, 24, 30 },
      { 2, 4, 6, 8, 10 },
      { 6, 12, 18, 24, 30 },
    };
    int[][] expected2 = {
      { 7, 14, 21, 28, 35 },
      { 6, 12, 18, 24, 30 },
      { 2, 4, 6, 8, 10 },
    };

    printMatrix(matrix);
    assertMatrixEquals(matrix, expected1);
    matrix = Array2DMultiples.eliminateDuplicateRows(matrix);
    printMatrix(matrix);
    assertMatrixEquals(matrix, expected2);
  }

  public static void testBuildMatrix2() {
    int[] arr = { 5, 2, 3, 5 };
    int[][] matrix = Array2DMultiples.buildMatrix(arr, 6);
    int[][]  expected1 = {
      {5, 10, 15, 20, 25, 30},
      {2, 4, 6, 8, 10, 12},
      {3, 6, 9, 12, 15, 18},
      {5, 10, 15, 20, 25, 30},
    };
    int[][]  expected2 = {
      {5, 10, 15, 20, 25, 30},
      {2, 4, 6, 8, 10, 12},
      {3, 6, 9, 12, 15, 18},
    };

    printMatrix(matrix);
    assertMatrixEquals(matrix, expected1);
    matrix = Array2DMultiples.eliminateDuplicateRows(matrix);
    printMatrix(matrix);
    assertMatrixEquals(matrix, expected2);
  }

  private static void assertMatrixEquals(int[][] m1, int[][] m2) {
    assert m1.length == m2.length;
    for (int i = 0; i < m1.length; i++) {
      assert m1[i].length == m2[i].length;
      for (int j = 0; j < m1[i].length; j++) {
        assert m1[i][j] == m2[i][j] : String.format(
            "matrices do not match at (%d,%d)",
            i,
            j
            );
      }
    }

  }
}
