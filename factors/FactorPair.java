public class FactorPair {

  /** factor1 and factor2 represent two factors of a number */

  private int factor1;

  private int factor2;

  FactorPair(int f1, int f2) {
    factor1 = f1;
    factor2 = f2;
  }

  /* returns the first factor of a pair */
  public int getFactor1() {
    return factor1;
  }

  /* returns the second factor of a pair */
  public int getFactor2() {
    return factor2;
  }
}
