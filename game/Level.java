public class Level {

  private int points = 0;
  private boolean goalReached = false;

  Level(int points, boolean goal) {
    this.points = points;
    this.goalReached = goal;
  }

  /** Returns true if the player reached the goal on this level and returns false otherwise */
  public boolean goalReached() {
    /* implementation not shown */
    return goalReached;
  }

  /** Returns the number of points (a positive integer) recorded for this level */
  public int getPoints() {
    /* implementation not shown */
    return points;
  }
  // There may be instance variables, constructors, and methods that are not shown.
}
