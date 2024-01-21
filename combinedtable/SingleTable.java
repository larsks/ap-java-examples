public class SingleTable {
  private int height;
  private int numSeats;
  private double viewQuality;

  public SingleTable(int n, double v, int h) {
    height = h;
    numSeats = n;
    viewQuality = v;
  }

  /** Returns the number of seats at this table. The value is always greater than or equal to 4. */
  public int getNumSeats() {
    return numSeats;
  }

  /** Returns the height of this table in centimeters. */
  public int getHeight() {
    return height;
  }

  /** Returns the quality of the view from this table. */
  public double getViewQuality() {
    return viewQuality;
  }

  /** Sets the quality of the view from this table to value . */
  public void setViewQuality(double value) {
    viewQuality = value;
  }
  // There may be instance variables, constructors, and methods that are not shown.
}
