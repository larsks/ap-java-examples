import java.util.*;

public class Factors {

  private int number;
  private ArrayList<FactorPair> pairs = new ArrayList<FactorPair>();

  Factors(int n) {
    number = n;
    pairs = buildArrayList(n);
  }

  /** Builds an ArrayList of all FactorPair objects of number
   * Precondition: n > 0
   * Postcondition: the ArrayList will contain all FactorPair objects for number
   * the ArrayList will not contain duplicate FactorPair objects
   * return the ArrayList of FactorPair objects
   */
  public ArrayList<FactorPair> buildArrayList(int n) {
    ArrayList<FactorPair> pairs = new ArrayList<FactorPair>();
    Set<Integer> seen = new HashSet<Integer>();

    for (int i = 1; i <= n / 2; i++) {
      for (int j = 1; j <= n; j++) {
        if (i*j == n) {
          if (seen.contains(i) || seen.contains(j))
            continue;
          pairs.add(new FactorPair(i, j));
          seen.add(i);
          seen.add(j);
        }
      }
    }

    return pairs;
  }

  /** Given two numbers as parameters, the method will return the
   * number with the most FactorPair objects
   * Precondition: n1 > 0, n2 > 0
   * Postcondition: The numbers are not modified
   * return the number with the most FactorPair objects; if tied, –1 will be returned
   */
  public int findMostPairs(Factors f) {
    /* to be implemented in part (b) */
    if (this.pairs.size() > f.pairs.size()) {
      return this.number;
    } else if (f.pairs.size() > this.pairs.size()) {
      return f.number;
    } else {
      return -1;
    }
  }

  /** Returns a string containing all the FactorPair objects in the ArrayList */

  public String toString() {
    String[] tuples;
    tuples = pairs.stream().map((pair) -> String.format("(%d %d)", pair.getFactor1(), pair.getFactor2())).toArray(String[]::new);
    return String.join(" ", tuples);
  }

  /* other methods may be implemented but not shown */
}
