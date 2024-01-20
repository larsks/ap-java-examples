public class Main {

  public static void main(String[] args) {
    testFrequentFlyer();
    testPremierMember();
  }

  public static void testPremierMember() {
    PremierMember jones1 = new PremierMember(
      97531,
      "Marcie Jones",
      "British Airways",
      9000
    );

    assert jones1.getStatusInfo().equals("97531 Marcie Jones level 1 also a member of British Airways");

    jones1.addMiles(10000);
    jones1.setStatusLevel(5);

    assert jones1.getStatusInfo().equals("97531 Marcie Jones level 5 also a member of British Airways");
  }

  public static void testFrequentFlyer() {
    FrequentFlyerMember smith1 = new FrequentFlyerMember(
      14256,
      "Luke Smith",
      1000
    );

    assert smith1.getStatusInfo().equals("14256 Luke Smith level 1");

    smith1.addMiles(3025);
    smith1.setStatusLevel(2);

    assert smith1.getStatusInfo().equals("14256 Luke Smith level 2");
  }
}
