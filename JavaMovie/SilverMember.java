/**Created by: Jigishaben Pragnesh Padhiyar */
/**Task:The SilverMember class is a subclass of MovieMembership and represents members with a rank of Silver. */

public class SilverMember extends MovieMembership {
    double discountRate;
    double pointsRate;

    public SilverMember(String memberName) {
        super(memberName);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    public SilverMember(String memberName, double discountRate, double pointsRate) {
        super(memberName);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;
    }

    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,
            String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.discountRate = 0.1;
        this.pointsRate = 1.2;
    }

    public SilverMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,
            String snack, double discountRate, double pointsRate) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.discountRate = discountRate;
        this.pointsRate = pointsRate;

    }

    public String returnMembershipRank() {
        return "Silver";
    }

    public String getMemberDetails() {
        return "" + super.getMemberDetails() + " " + "They have " + returnMembershipRank() + " membership";
    }

    public void printMemberBenefits() {

        System.out.println("Discount rate = " + this.discountRate * 100);
        System.out.println("Points gained per dollar = " + this.pointsRate);

    }

    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.showHour = showHour;
        this.showMinutes = showMinute;
        this.snack = snack;

        double priceWithDiscount = ticketPrice * (1 - discountRate);
        int pointsEarned = (int) (ticketPrice * this.pointsRate);

        System.out.println("The Movie " + nextMovie + " has been purchased by " + this.memberName + " for $"
                + priceWithDiscount + "and will be showing at " + showHour + ":" + showMinute + " with " + theatreType
                + " screening. They have earned " + pointsEarned + " points");
    }

}
