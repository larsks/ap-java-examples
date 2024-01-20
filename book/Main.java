public class Main {
  public static void main(String[] args) {
    TextBook bio2015 = new TextBook("Biology", 49.75, 2),
             bio2019 = new TextBook("Biology", 39.75, 3);

    assert bio2019.getEdition() == 3;
    assert bio2019.getBookInfo().equals("Biology-39.75-3");
    assert bio2019.canSubstituteFor(bio2015);
    assert !bio2015.canSubstituteFor(bio2019);

    TextBook math = new TextBook("Calculus", 45.25, 1);
    assert !bio2015.canSubstituteFor(math);
  }
}

