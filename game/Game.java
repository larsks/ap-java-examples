public class Game {

  private Level levelOne;
  private Level levelTwo;
  private Level levelThree;
  private boolean isBonus;

  /** Postcondition: All instance variables have been initialized. */
  public Game() {
    /* implementation not shown */
  }

  public Game(Level l1, Level l2, Level l3, boolean bonus) {
    levelOne = l1;
    levelTwo = l2;
    levelThree = l3;
    isBonus = bonus;
  }

  /** Returns true if this game is a bonus game and returns false otherwise */
  public boolean isBonus() {
    return isBonus;
  }

  /** Simulates the play of this Game (consisting of three levels) and updates all relevant
   * game data
   */
  public void play() {
        levelOne = new Level((int)(1000 * Math.random()), Math.random() < 0.5);
        levelTwo = new Level((int)(1000 * Math.random()), Math.random() < 0.5);
        levelThree = new Level((int)(1000 * Math.random()), Math.random() < 0.5);
        isBonus = Math.random() < 0.5;
  }

  /** Returns the score earned in the most recently played game, as described in part (a) */
  public int getScore() {
    int score = 0;

    if (levelOne.goalReached()) {
      score += levelOne.getPoints();
      if (levelTwo.goalReached()) {
        score += levelTwo.getPoints();
        if (levelThree.goalReached()) {
          score += levelThree.getPoints();
        }
      }
    }

    if (isBonus()) {
      score *= 3;
    }

    return score;
  }

  /** Simulates the play of num games and returns the highest score earned, as
   * described in part (b)
   * Precondition: num > 0
   */
  public int playManyTimes(int num) {
    int maxScore = 0;

    for (int i=0; i<num; i++) {
      play();
      int score = getScore();
      System.out.printf("Game %d score %d\n", i, score);
      if (score > maxScore)
        maxScore = score;
    }

    return maxScore;
  }
  // There may be instance variables, constructors, and methods that are not shown.
}
