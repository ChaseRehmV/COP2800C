public class GameMechanics {

    private static String bannerChar = "*";
    private static String spaceChar = " ";

    public static void printPlayerSwitch(int playerScore, int computerScore) {
        for (int i = 0; i < 5; ++i) {
            if (i != 2) {
                System.out.println(bannerChar.repeat(50));
            } else {
                System.out.print(bannerChar.repeat(15));
                System.out.print(" !!Switch Players!! ");
                System.out.println(bannerChar.repeat(15));
                System.out.println(spaceChar.repeat(6)+ "Player score: " + playerScore + spaceChar.repeat(4) + "Computer score: " + computerScore + spaceChar.repeat(4));
            }
        }
    }

    public static void printVictory(String name) {
        for (int i = 0; i < 5; ++i) {
            if (i != 2) {
                System.out.println(bannerChar.repeat(50));
            } else {
                System.out.print(bannerChar.repeat(18));
                System.out.print(" !! Winner !! ");
                System.out.println(bannerChar.repeat(18));
                System.out.println(spaceChar.repeat(6)+ "Congratulations " + name + "!" + spaceChar.repeat(7) + "You won!");
            }
        }
    }

    public static void printMatadorInstructions() {
        System.out.println("In this dice game, you will play against a computer opponent.");
        System.out.println("On each player's turn, that player will choose a number between 2 and 6.");
        System.out.println("The player then rolls two dice:");
        System.out.println("If a 1 appears on both dice, the player's score is reduced by 25 and it becomes the other's turn.");
        System.out.println("If a 1 appears on only one die, nothing is added to the player's score and it becomes the other's turn.");
        System.out.println("If a 1 does not appear on either die, the sum of the two dice is added to the player's score.");
        System.out.println("    - if their chosen number appears on only one die, they roll again.");
        System.out.println("    - if their chosen number appears on both dice, they win.");
        System.out.println("    - if their chosen number did not appear on either die, it becomes the other's turn.");
        System.out.println();
    }

    public static void printMatadorWelcome() {
        for (int i = 0; i < 6; ++i) {
            if (i != 2) {
                System.out.println(bannerChar.repeat(50));
            } else {
                System.out.print(bannerChar.repeat(14));
                System.out.print(" !Welcome to Matador! ");
                System.out.println(bannerChar.repeat(14));
            }
        }
        System.out.println();
    }

    public static void printGuessInstructions() {
        System.out.println("First, choose a number between 2 and 12. Then you will roll a pair of dice 3 times.");
        System.out.println("If the sum of the dice equals your number within the 3 rolls, you win! Good luck!");
        System.out.println();
    }

    public static void printGuessWelcome() {
        for (int i = 0; i < 6; ++i) {
            if (i != 2) {
                System.out.println(bannerChar.repeat(50));
            } else {
                System.out.print(bannerChar.repeat(11));
                System.out.print(" Welcome to the 3 Roll Bet! ");
                System.out.println(bannerChar.repeat(11));
            }
        }
        System.out.println();

    }
}
