/**Created by: Jigishaben Pragnesh Padhiyar */
/**Task:Final displaying class MovieMembershipTest.java */

public class MovieMembershipTest {
    public static void main(String[] args) {
        SilverMember mySilver = new SilverMember("Camille", "Jumanji", "AnyCanDo", 03, 50, "Popcorn");
        GoldMember myGold = new GoldMember("Caroline", "Fast5", "AnyCanDo", 02, 55, "Soda");
        IMAXMember myIMAX = new IMAXMember("Stuart", "Love Hard", "IMAX", 16, 50, "Biscuits");

        MovieMembership[] movieMembershipArray = { mySilver, myGold, myIMAX };

        for (MovieMembership member : movieMembershipArray) {
            System.out.println("Member name : " + member.getMemberName());
            System.out.println("Member rank: " + member.returnMembershipRank());
            System.out.println("Next Movie: " + member.getNextMovie());
            System.out.println("points : " + member.getPoints());
            System.out.println("Theatre Type: " + member.getTheatreType());
            System.out.println("Snack: " + member.getSnacks());
            System.out.println("Showtime: " + member.displayShowTime());
            System.out.println("Member Details: " + member.getMemberDetails());
            member.printMemberBenefits();

          

        }

        for (MovieMembership member2 : movieMembershipArray) {
            member2.purchaseMovieTicket(6.99, "The Matrix 4", "standard,", 11, 25, "Sour Keys");
            member2.getMemberDetails();
        }

        myGold.accessVIPLounge();
        System.out.println(myGold.purchaseAlcohol());
       
        System.out.println(myGold.getMemberDetails());
 

        mySilver.purchaseMovieTicket(7.89, "Suicide Squad", "standard", 14, 25, "Smarties");
        System.out.println(mySilver.getMemberDetails());
       

        myGold.purchaseMovieTicket(15.98, "The Big Short", "standard", 13, 50, "Kitkat");
        System.out.println(myGold.getMemberDetails());
        System.out.println(" ");

        myIMAX.purchaseMovieTicket(14.50, "Godzilla vs Kong", "IMAX", 15, 0, "Gummies");
        System.out.println(myIMAX.getMemberDetails());
       

    }
}
