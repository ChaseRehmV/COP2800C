import java.util.ArrayList;

public class ShoppeBonusCalc {

    private static ArrayList<Integer> currentBonuses = new ArrayList<Integer>();

    private static int [][] shopBonusGrid = {
            {25,45,80,110,150},
            {50,75,90,120,180},
            {100,125,160,210,265},
            {160,190,225,275,340},
            {235,265,325,385,450},
            {300,360,420,480,600},
            {425,500,585,725,875}
    };

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

    public static void addBonus(int bonus) {
        currentBonuses.add(bonus);
    }

    public static int getTotalBonus() {
        int sum = 0;
        for (int b: currentBonuses) {
            sum += b;
        }
        return sum;
    }

    public static void clearCurrentBonuses() {
        currentBonuses.clear();
    }
}


//if (posReviews == 3) {
//        column = 3;
//        } else if (posReviews == 2) {
//        column = 2;
//        } else if (posReviews == 1) {
//        column = 1;
//        } else {
//        column = 0;
//        }
