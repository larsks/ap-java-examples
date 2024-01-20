public class Main {
  record TestInput (Level l1, Level l2, Level l3, boolean isBonus, int expectedScore){}

  public static void main(String[] args) {
    testGetScore();
    var g = new Game();
    System.out.println("high score: " + g.playManyTimes(10));
  }

  public static void testGetScore() {
    TestInput[] inputs = {
      new TestInput(new Level(200, true), new Level(100, true), new Level(500, true), true, 2400),
      new TestInput(new Level(200, true), new Level(100, true), new Level(500, false), false, 300),
      new TestInput(new Level(200, true), new Level(100, false), new Level(500, true), true, 600),
      new TestInput(new Level(200, false), new Level(100, true), new Level(500, true), false, 0),
    };

    for (TestInput input: inputs) {
      Game g = new Game(input.l1, input.l2, input.l3, input.isBonus);
      assert g.getScore() == input.expectedScore;
    }
  }
}
