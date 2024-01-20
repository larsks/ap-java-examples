class TextBook extends Book {
  private int edition;

  public TextBook(String bookTitle, double bookPrice, int bookEdition) {
    super(bookTitle,  bookPrice);
    edition = bookEdition;
  }

  public String getBookInfo() {
    return super.getBookInfo() + "-" + edition;
  }

  public int getEdition() {
    return edition;
  }

  public boolean canSubstituteFor(TextBook t) {
    return t.getTitle().equals(getTitle()) && edition > t.edition;
  }
}
