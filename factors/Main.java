public class Main {

  public static void main(String[] args) {
    testFactors();
    testFindMostPairs();
  }

  public static void testFindMostPairs() {
    assert new Factors(20).findMostPairs(new Factors(24)) == 24;
    assert new Factors(20).findMostPairs(new Factors(45)) == -1;
    assert new Factors(17).findMostPairs(new Factors(45)) == 45;
  }

  public static void testFactors() {
    assert new Factors(24).toString().equals("(1 24) (2 12) (3 8) (4 6)");
    assert new Factors(45).toString().equals("(1 45) (3 15) (5 9)");
    assert new Factors(17).toString().equals("(1 17)");
    assert new Factors(20).toString().equals("(1 20) (2 10) (4 5)");
  }

}
