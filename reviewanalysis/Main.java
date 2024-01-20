public class Main {

  public static void main(String[] args) {
    ReviewAnalysis ra = new ReviewAnalysis(
      new Review[] {
        new Review(4, "Good! Thx"),
        new Review(3, "OK site"),
        new Review(5, "Great!"),
        new Review(2, "Poor! Bad."),
        new Review(3, ""),
      }
    );

    assert ra.getAverageRating() == 3.4 : String.format("expected %f, have %f", 3.4, ra.getAverageRating());
    var comments = ra.collectComments();

    System.out.println(comments);
    assert comments.get(0).equals("0-Good! Thx.");
    assert comments.get(1).equals("2-Great!");
    assert comments.get(2).equals("3-Poor! Bad.");
  }
}
