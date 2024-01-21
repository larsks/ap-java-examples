public class CombinedTable {
  private SingleTable table1, table2;

  public CombinedTable(SingleTable t1, SingleTable t2) {
    table1 = t1;
    table2 = t2;
  }

  public boolean canSeat(int people) {
    return people <= (table1.getNumSeats() + table2.getNumSeats() - 2);
  }

  public double getDesirability() {
    double score = (table1.getViewQuality() + table2.getViewQuality())/2.0;
    if (table1.getHeight() != table2.getHeight())
      score -= 10;

    return score;
  }
}
