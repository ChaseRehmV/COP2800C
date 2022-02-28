import java.util.Random;
import java.util.Scanner;

public class Matador {

    public static void main(String[] args) {
        Random randGen = new Random();
        Scanner keyboard = new Scanner(System.in);
        Player player1 = new Player();
        Player cpuPlayer = new Player("Computer");
        enum ActivePlayer {human, computer}
        int cpuPlayerNum;
        int playerNum;
        int cpuPlayerScore = 0;
        int playerScore = 0;
        int currentTurnScore = 0;
        int die1;
        int die2;
        int diceSum;
        Die playerD1 = new Die();
        Die playerD2 = new Die();
        Die cpuPlayerD1 = new Die();
        Die cpuPlayerD2 = new Die();
        String bannerChar = "*";
        String continueKey = "y";
        ActivePlayer activePlayer;
        activePlayer = ActivePlayer.human;



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

        // game rules explanation
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


        System.out.println("***** GAME START *****");
        System.out.print("Enter Player 1's name: ");
        player1.setName(keyboard.next());
        while (!continueKey.equals("n")) {
            if (player1.getOverallScore() > 98 || cpuPlayer.getOverallScore() > 98) {
                if (player1.overallScore > cpuPlayer.getOverallScore()) {
                    System.out.println("Your score has reached or surpassed 99! You win!");
                    GameMechanics.printVictory(player1.getName());
                } else {
                    System.out.println("The computer's score has reach or surpassed 99! You lose!");
                }
            } else if (activePlayer == ActivePlayer.human) {
                System.out.print(player1.getName() + ", please choose your number between 2 and 6 for this turn: ");
                playerNum = keyboard.nextInt();
                while (playerNum < 2 || playerNum > 6) {
                    System.out.println("That's not a valid number! Please try again: ");
                    playerNum = keyboard.nextInt();
                }
                die1 = playerD1.rollDie();
                die2 = playerD2.rollDie();
                diceSum = die1 + die2;
                if (die1 == playerNum && die2 == playerNum) {
                    System.out.println("You rolled your number on both die! Congratulations, " + player1.getName() + ", you win the game!");
                    GameMechanics.printVictory(player1.getName());
                    break;
                } else if (die1 == 1 && die2 == 1) {
                    System.out.println("You rolled a 1 on both die. You lose 25 points. It is now the computer's turn.");
                    currentTurnScore = 0;
                    player1.decreaseScore(25);
                    activePlayer = ActivePlayer.computer;
                    GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    continue;
                } else if (die1 == 1 || die2 == 1) {
                    System.out.println("You rolled a 1 on one of the die. You gain no points. It is now the computer's turn.");
                    currentTurnScore = 0;
                    activePlayer = ActivePlayer.computer;
                    GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    continue;
                } else {
                    player1.increaseScore(diceSum);
                    System.out.println("You didn't roll a 1! Your score increased by " + diceSum + ". Your current score is " + player1.getOverallScore());
                    if (die1 == playerNum || die2 == playerNum) {
                        System.out.print("You rolled " + die1 + " and " + die2 + ". Since you rolled your number on one die, you get to roll again! Enter 'n' to quit, any other letter to continue: ");
                        continueKey = keyboard.next();
                        if (continueKey.equals("n")) {
                            System.out.print("Boo! You let the computer win!");
                        }
                    } else {
                        System.out.println("You rolled " + die1 + " and " + die2 + ". Since you rolled your number on neither die, it is now the computer's turn.");
                        activePlayer = ActivePlayer.computer;
                        GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    }
                }
            } else {
                System.out.println("The computer will now begin rolling.");
                cpuPlayerNum = randGen.nextInt(5) + 2;
                die1 = playerD1.rollDie();
                die2 = playerD2.rollDie();
                diceSum = die1 + die2;
                if (die1 == cpuPlayerNum && die2 == cpuPlayerNum) {
                    System.out.println("The computer rolled their number on both die! Sorry, " + player1.getName() + ", you lose the game!");
                    break;
                } else if (die1 == 1 && die2 == 1) {
                    System.out.println("The computer rolled a 1 on both die. It loses 25 points. It is now your turn.");
                    cpuPlayer.decreaseScore(25);
                    activePlayer = ActivePlayer.human;
                    GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    continue;
                } else if (die1 == 1 || die2 == 1) {
                    System.out.println("The computer rolled a 1 on one of the die. The computer gains no points. It is now your turn.");
                    activePlayer = ActivePlayer.human;
                    GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    continue;
                } else {
                    cpuPlayer.increaseScore(diceSum);
                    System.out.println("The computer didn't roll a 1! Its score increased by " + diceSum + ". The computer's current score is " + cpuPlayer.getOverallScore());
                    if (die1 == cpuPlayerNum || die2 == cpuPlayerNum) {
                        System.out.println("The computer rolled " + die1 + " and " + die2 + ". Since it rolled its number one one die, it gets to roll again!");
                    } else {
                        System.out.println("The computer rolled " + die1 + " and " + die2 + ". Since it rolled its number on neither die, it is now your turn.");
                        activePlayer = ActivePlayer.human;
                        GameMechanics.printPlayerSwitch(player1.getOverallScore(), cpuPlayer.getOverallScore());
                    }
                }
            }


        }
    }
}


/*cpuPlayerNum = randGen.nextInt(5) + 2;*/
