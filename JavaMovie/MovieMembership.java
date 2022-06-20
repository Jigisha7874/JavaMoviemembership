/**Created by: Jigishaben Pragnesh Padhiyar */
/**Task:The SilverMember class is a subclass of MovieMembership and represents members with a rank of Silver */


abstract class MovieMembership {
    String memberName;
    String nextMovie;
    String theatreType;
    int showHour;
    int showMinutes;
    String snack;
    int points;

    public MovieMembership(String memberName) {
        this.memberName = memberName;
        this.nextMovie = "unknown";
        this.theatreType = "standard";
        this.showHour = 0;
        this.showMinutes = 0;
        this.snack = "unknown";
        this.points = 0;
    }

    public MovieMembership(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,
            String snack) {
        this.memberName = memberName;
        this.nextMovie = nextMovie;
        this.theatreType = theatreType;
        this.showHour = showHour;
        this.showMinutes = showMinutes;
        this.snack = snack;
        this.points = 0;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public String getNextMovie() {
        return this.nextMovie;
    }

    public int getPoints() {
        return this.points;
    }

    public String getSnacks() {
        return this.snack;
    }

    public String getTheatreType() {
        return this.theatreType;
    }

    public void setNextMovie(String nextMovie) {
        this.nextMovie = nextMovie;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public void setTheatreType(String theatreType) {
        this.theatreType = theatreType;
    }

    public void setShowtime(int hour, int minute) {
        this.showHour = hour;
        this.showMinutes = minute;
    }

    public String displayShowTime() {
        return "" + this.showHour + ":" + this.showMinutes;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public String getMemberDetails() {
        return "This membership card belongs to " + this.memberName + " They have " + this.points + "points. "
                + "Their next movie is " + this.nextMovie + " at " + this.showHour + ":" + this.showMinutes
                + " They will be having " + this.snack + " as a snack ";
    }

    abstract String returnMembershipRank();

    abstract void printMemberBenefits();

    abstract void purchaseMovieTicket(double ticketPrice, String nextMovie, String theatreType, int showHour,
            int showMinute, String snack);

}