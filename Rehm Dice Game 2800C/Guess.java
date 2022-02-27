import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        // variables used in the game. numOfRolls is initialized with 1 because the user starts with their first roll
        int userGuess;
        int diceSum;
        int numOfRolls = 1;

        // creating two independent dice objects
        Die die1 = new Die();
        Die die2 = new Die();

        // new Scanner object for accepting user input
        Scanner keyboard = new Scanner(System.in);

        // bannerChar for welcome message and continueKey for main while loop sentinel value
        String bannerChar = "*";
        String continueKey = "y";

        // welcome banner message
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

        // game rules explanation
        System.out.println("First, choose a number between 2 and 12. Then you will roll a pair of dice 3 times.");
        System.out.println("If the sum of the dice equals your number within the 3 rolls, you win! Good luck!");
        System.out.println();

        // user chooses their number
        System.out.print("You must choose a number between 2 and 12: ");
        userGuess = keyboard.nextInt();

        // while loop that forces a user to choose an int between 2 and 12 inclusive
        while (userGuess < 2 || userGuess > 12) {
            System.out.print("That's not a valid number! Please try again: ");
            userGuess = keyboard.nextInt();
        }

        // main while loop of the game. the loop will exit if the user hits their number, if the numOfRolls hits 3, or if the user quits (boooooo)
        while ( !continueKey.equals("n") ) {
            diceSum = die1.rollDie() + die2.rollDie();
            System.out.println("Roll " + numOfRolls + " was a " + diceSum + ".");
            if (diceSum == userGuess) {
                System.out.print("You rolled your number! Congratulations, you win the game!");
                break;
            } else if (numOfRolls == 3){
                System.out.print("You didn't roll your number within 3 rolls. You lose, house wins!");
                break;
            } else {
                System.out.print("That's not your number, try again? Enter 'n' to quit, any other letter to continue: ");
                ++numOfRolls;
                continueKey = keyboard.next();
            }
        }

        // added incentive to not quit next time
        if (continueKey.equals("n")) {
            System.out.println("Nobody likes a quitter.");
        }
    }
}
