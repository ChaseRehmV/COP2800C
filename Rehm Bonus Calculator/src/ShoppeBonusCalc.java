import java.util.ArrayList;

public class ShoppeBonusCalc {

    // ArrayList of bonuses that is used each time the IceCreamShoppeApp is run
    // each bonus calculated in IceCreamShoppeApp will be added to this list
    // when the IceCreamShoppeApp ends, it prints out the sum of all elements in this list then the list is cleared
    private static ArrayList<Integer> currentBonuses = new ArrayList<Integer>();

    // two-dimensional grid holding the configuration for bonus payouts
    private static int [][] shopBonusGrid = {
            {25,45,80,110,150},
            {50,75,90,120,180},
            {100,125,160,210,265},
            {160,190,225,275,340},
            {235,265,325,385,450},
            {300,360,420,480,600},
            {425,500,585,725,875}
    };

    // method for calculating the bonus; takes in the weeks an employee has worked and the positive reviews the employee has received
    // the weeksWorked and posReviews are used to determine which value of the shopBonusGrid should be returned
    public static int calcBonus(int weeksWorked, int posReviews) {
        int row = 0;
        int column = 0;

        if (posReviews > 3) {
            column = 4;
        } else {
            switch (posReviews) {
                case 3:
                    column = 3;
                    break;
                case 2:
                    column = 2;
                    break;
                case 1:
                    column = 1;
                    break;
                case 0:
                    column = 0;
                    break;
            }
        }

        if (weeksWorked > 5) {
            row = 6;
        } else {
            switch (weeksWorked) {
                case 5:
                    row = 5;
                    break;
                case 4:
                    row = 4;
                    break;
                case 3:
                    row = 3;
                    break;
                case 2:
                    row = 2;
                    break;
                case 1:
                    row = 1;
                    break;
                case 0:
                    row = 0;
                    break;
            }
        }

        return shopBonusGrid[row][column];
    }

    // method for adding bonuses to the currentBonuses ArrayList
    public static void addBonus(int bonus) {
        currentBonuses.add(bonus);
    }

    // method for getting the sum of the elements in currentBonuses ArrayList
    public static int getTotalBonus() {
        int sum = 0;
        for (int b: currentBonuses) {
            sum += b;
        }
        return sum;
    }

    // method for clearing the currentBonuses ArrayList after each run of the IceCreamShoppeApp
    public static void clearCurrentBonuses() {
        currentBonuses.clear();
    }
}
