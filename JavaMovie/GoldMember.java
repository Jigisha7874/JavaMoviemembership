/**Created by: Jigishaben Pragnesh Padhiyar */
/**Task: creatin gold member with subclass silvermember */


import java.util.Scanner;

public class GoldMember extends SilverMember implements VIPPrivilege {

    boolean validCredentials;

    public GoldMember(String memberName) {
        super(memberName);
        this.discountRate = 0.25;
        this.pointsRate = 2.5;
        this.points = 50;
        this.validCredentials = false;
    }

    public GoldMember(String memberName, String nextMovie, String theatreType, int showHour, int showMinutes,
            String snack) {
        super(memberName, nextMovie, theatreType, showHour, showMinutes, snack);
        this.validCredentials = false;
        this.points = 50;

    }

    public String returnMembershipRank() {
        return "Gold";
    }

    public String getMemberDetails() {
        return "" + super.getMemberDetails() + " " + "They have " + returnMembershipRank() + " membership"
                + " and have VIP privileges ";
    }

    public void accessVIPLounge() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        int password = input.nextInt();

        if (password == VIPPrivilege.PASSWORD) {
            this.validCredentials = true;
            System.out.println("Access granted!");

        }

    }

    public String purchaseAlcohol() {
        if (this.validCredentials == true) {
            this.setSnack("alchohol");
            return " Enjoy your beverage ";

        }
        return "cannot purchase bevarage with invalid credentials";

    }

    public void printMemberBenefits() {
        System.out.println("Discount rate = " + this.discountRate * 100);
        System.out.println("Points gained per dollar = " + this.pointsRate);
    }
}
