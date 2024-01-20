public class FrequentFlyerMember {

  private int acctNumber;
  private String flyerName;
  private int lifetimeMiles;
  private int statusLevel;

  FrequentFlyerMember(int n, String name, int miles) {
    acctNumber = n;
    flyerName = name;
    lifetimeMiles = miles;
    statusLevel = 1;
  }

  //* Adds miles to lifetimeMiles */
  public void addMiles(int miles) {
    lifetimeMiles += miles;
  }

  //* Changes the status level */
  public void setStatusLevel(int level) {
    statusLevel = level;
  }

  //* Prints selected status information */
  public String getStatusInfo() {
    return acctNumber + " " + flyerName + " level " + statusLevel;
  }
}
