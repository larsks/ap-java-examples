public class PremierMember extends FrequentFlyerMember {

  private boolean premierClubMembership = true;
  private int freeBags = 2;
  private String otherFrequentFlyerMember;

  PremierMember(int n, String name, String other, int miles) {
    super(n, name, miles);
    otherFrequentFlyerMember = other;
  }

  public String getStatusInfo() {
	  String status = super.getStatusInfo();
	  return status + " also a member of " + otherFrequentFlyerMember;
  }
}
