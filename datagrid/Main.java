public class Main {
  public static void main(String[] args) {
    Data d = new Data(3,3);
    d.repopulate();
    printMatrix(d.getData());
    System.out.println("increasing columns: " + d.countIncreasingCols());
  }

  private static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.printf("%4d ", matrix[i][j]);
      }
      System.out.println("");
    }
    System.out.println("");
  }

}
