public class Main {
  public static void main(String[] args) {
    SingleTable t1 = new SingleTable(4, 60.0, 74),
                t2 = new SingleTable(8, 70.0, 74),
                t3 = new SingleTable(12, 75.0, 76);

    CombinedTable c1 = new CombinedTable(t1, t2);
    assert c1.canSeat(9);
    assert c1.getDesirability() == 65.0;
    CombinedTable c2 = new CombinedTable(t2, t3);
    assert c2.canSeat(18);
    assert c2.getDesirability() == 62.5;
    t2.setViewQuality(80);
    assert c2.getDesirability() == 67.5;
  }
}

