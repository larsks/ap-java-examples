public class WordMatch {
  /** The secret string. */
  private String secret;

  public int countMatches(String haystack, String needle) {
    int count = 0, base=0, index = 0;

    while (base <= haystack.length()) {
      index = haystack.substring(base).indexOf(needle);
      if (index == -1) break;
      count++;
      base += index + 1;
    }

    return count;
  }

  /** Constructs a WordMatch object with the given secret string of lowercase letters. */
  public WordMatch(String word)
  {
    secret = word;
  }

  /** Returns a score for guess, as described in part (a).
   * Precondition: 0 < guess.length() <= secret.length()
   */
  public int scoreGuess(String guess)
  {
    return countMatches(secret, guess) * guess.length() * guess.length();
  }

  /** Returns the better of two guesses, as determined by scoreGuess and the rules for a
   * tie-breaker that are described in part (b).
   * Precondition: guess1 and guess2 contain all lowercase letters.
   *
   guess1 is not the same as guess2.
   */
  public String findBetterGuess(String guess1, String guess2)
  {
    int score1 = scoreGuess(guess1);
    int score2 = scoreGuess(guess2);

    if (score1 > score2) {
      return guess1;
    } else if (score2 > score1) {
      return guess2;
    } else if (guess1.compareTo(guess2) > 0) {
      return guess1;
    } else {
      return guess2;
    }
  }
}
