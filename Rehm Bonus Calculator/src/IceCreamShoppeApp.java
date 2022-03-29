import java.util.Scanner;

public class IceCreamShoppeApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int weeksWorked;
        int posReviews;
        String sentinelKey = "y";

        while (sentinelKey.equalsIgnoreCase("y")) {
            System.out.print("Please enter the number of weeks worked: ");
            weeksWorked = keyboard.nextInt();
            while (weeksWorked < 0 ) {
                System.out.print("That's not a valid number for weeks worked. Please enter a positive number: ");
                weeksWorked = keyboard.nextInt();
            }
            System.out.print("Please enter the number of positive reviews received: ");
            posReviews = keyboard.nextInt();
            while (posReviews < 0) {
                System.out.print("That's not a valid number for reviews received. Please enter a positive number: ");
                posReviews = keyboard.nextInt();
            }
            System.out.print("Bonus earned will be: $");
            int output = ShoppeBonusCalc.calcBonus(weeksWorked, posReviews);
            System.out.println(output);
            ShoppeBonusCalc.addBonus(output);
            System.out.print("Would you like to calculate another bonus? Enter y to continue, enter any other key to stop: ");
            sentinelKey = keyboard.next();
        }

        System.out.println("Total bonuses paid is: $"+ ShoppeBonusCalc.getTotalBonus());
        System.out.println("Thanks for using our Bonus Calculator! Goodbye!");
        ShoppeBonusCalc.clearCurrentBonuses();
    }
}
