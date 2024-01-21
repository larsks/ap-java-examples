public class Main {
  public static void main(String[] args) {
    WordMatch w1 = new WordMatch("mississippi");
    assert w1.scoreGuess("i") == 4;
    assert w1.scoreGuess("iss") == 18;
    assert w1.scoreGuess("issipp") == 36;
    assert w1.scoreGuess("mississippi") == 121;

    WordMatch w2 = new WordMatch("aaaabb");
    assert w2.scoreGuess("a") == 4;
    assert w2.scoreGuess("aa") == 12;
    assert w2.scoreGuess("aaa") == 18;
    assert w2.scoreGuess("aabb") == 16;
    assert w2.scoreGuess("c") == 0;

    WordMatch w3 = new WordMatch("concatenation");
    assert w3.scoreGuess("ten") == 9;
    assert w3.scoreGuess("nation") == 36;
    assert w3.findBetterGuess("ten", "nation").equals("nation");
    assert w3.scoreGuess("con") == 9;
    assert w3.scoreGuess("cat") == 9;
    assert w3.findBetterGuess("con", "cat").equals("con");
  }
}
