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
}
