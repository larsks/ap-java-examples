import java.util.*;

public class ReviewAnalysis {

  /** All user reviews to be included in this analysis */
  private Review[] allReviews;

  /** Initializes allReviews to contain all the Review objects to be analyzed */
  public ReviewAnalysis(Review[] reviews) {
    allReviews = reviews;
  }

  /** Returns a double representing the average rating of all the Review objects to be
   * analyzed, as described in part (a)
   * Precondition: allReviews contains at least one Review.
   * No element of allReviews is null.
   */
  public double getAverageRating() {
    int rating = 0;
    for (int i = 0; i < allReviews.length; i++) {
      rating += allReviews[i].getRating();
    }

    return (double)rating / allReviews.length;
  }

  /** Returns an ArrayList of String objects containing formatted versions of
   * selected user comments, as described in part (b)
   * Precondition: allReviews contains at least one Review.
   * No element of allReviews is null.
   * Postcondition: allReviews is unchanged.
   */
  public ArrayList<String> collectComments() {
    ArrayList<String> comments = new ArrayList<String>();

    for (int i=0; i<allReviews.length; i++) {
      String terminal;
      String comment = allReviews[i].getComment();
      if (comment.contains("!")) {
        char lastChar = comment.charAt(comment.length() - 1);
        if (lastChar != '.' && lastChar != '!')
          terminal = ".";
        else
          terminal = "";
        comments.add(String.format("%d-%s%s", i, comment, terminal));
      }
    }

    return comments;
  }
}
