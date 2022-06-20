/**Created by: Jigishaben Pragnesh Padhiyar */
/**Task:IMAXMember class for discount and points rate */

public class IMAXMember extends MovieMembership {
    double discountRate;
    double pointsRate;

    public IMAXMember(String memberName) {
        super(memberName);
        this.discountRate = 0.5;
        this.pointsRate = 1.3;
        this.points = 25;
    }

    public IMAXMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,
            String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.points = 25;
        this.pointsRate = 1.3;
        this.points = 25;
    }

    public String returnMembershipRank() {
        return "IMAX";
    }

    public String getMemberDetails() {
        return "" + super.getMemberDetails() + " " + "They have " + returnMembershipRank() + " membership";
    }

    public void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack) {
        if (this.theatreType == "IMAX") {
            this.nextMovie = nextMovie;
            this.theatreType = theatreType;
            this.showHour = showHour;
            this.showMinutes = showMinute;
            this.snack = snack;

            double priceWithDiscount = ticketPrice * (1 - discountRate);
            int pointsEarned = (int) (ticketPrice * this.pointsRate);

            System.out.println("The Movie " + nextMovie + " has been purchased by " + this.memberName + " for "
                    + priceWithDiscount + "and will be showing at " + showHour + ":" + showMinute + " with "
                    + theatreType + " screening. They have earned " + pointsEarned + " points");
        }
    }

    public void printMemberBenefits() {
        System.out.println("Discount rate = " + this.discountRate * 100);
        System.out.println("Points gained per dollar = " + this.pointsRate);
    }

}
