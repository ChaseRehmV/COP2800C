import java.util.Random;
import java.util.Scanner;

public class Matador {

    public static void main(String[] args) {

        // utility objects
        Random randGen = new Random();
        Scanner keyboard = new Scanner(System.in);

        // player objects
        Player player1 = new Player();
        Player cpuPlayer = new Player("Computer");
        Die gameDie1 = new Die();
        Die gameDie2 = new Die();

        // ActivePlayer enum to change game state between players
        enum ActivePlayer {human, computer}

        // variables for storing values from die and player objects
        int cpuPlayerNum;
        int playerNum;
        int die1;
        int die2;
        int diceSum;

        // continueKey for stopping the game if the user wishes
        String continueKey = "y";

        // activePlayer object from the ActivePlayer enum
        // the activePlayer starts as 'human' since the game always lets the human roll first
        ActivePlayer activePlayer;
        activePlayer = ActivePlayer.human;

        // matador welcome message
        GameMechanics.printMatadorWelcome();

        // game rules explanation
        GameMechanics.printMatadorInstructions();

        // beginning of game. any win or lose condition breaks the loop.
        // any condition where the player switches or the player gets to roll again continues the loop
        // any condition where the player switches results in the activePlayer enum being changed
        System.out.println("***** GAME START *****");
        System.out.print("Enter Player 1's name: ");
        player1.setName(keyboard.next());
        while (!continueKey.equals("n")) {
            if (activePlayer == ActivePlayer.human) {
                playerNum = GameMechanics.playerSelectNumber(player1);
                die1 = gameDie1.rollDie();
                die2 = gameDie2.rollDie();
                diceSum = die1 + die2;
                if (die1 == playerNum && die2 == playerNum) {
                    System.out.println("You rolled your number on both die! Congratulations, " + player1.getName() + ", you win the game!");
                    GameMechanics.printVictory(player1.getName());
                    break;
                } else if (die1 == 1 && die2 == 1) {
                    System.out.println("You rolled a 1 on both die. You lose 25 points. It is now the computer's turn.");
                    player1.decreaseScore(25);
                    activePlayer = ActivePlayer.computer;
                    GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    continue;
                } else if (die1 == 1 || die2 == 1) {
                    System.out.println("You rolled a 1 on one of the die. You gain no points. It is now the computer's turn.");
                    activePlayer = ActivePlayer.computer;
                    GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    continue;
                } else {
                    player1.increaseScore(diceSum);
                    System.out.println("You didn't roll a 1! Your score increased by " + diceSum + ". Your current score is " + player1.getOverallScore());
                    if (player1.getOverallScore() > 98) {
                        System.out.println("Your score has reached or surpassed 99! You win!");
                        break;
                    } else if (die1 == playerNum || die2 == playerNum) {
                        System.out.print("You rolled " + die1 + " and " + die2 + ". Since you rolled your number on one die, you get to roll again! Enter 'n' to quit, any other letter to continue: ");
                        continueKey = keyboard.next();
                        if (continueKey.equals("n")) {
                            System.out.print("Boo! You let the computer win!");
                        }
                    } else {
                        System.out.println("You rolled " + die1 + " and " + die2 + ". Since you rolled your number on neither die, it is now the computer's turn.");
                        activePlayer = ActivePlayer.computer;
                        GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    }
                }
            } else {
                System.out.println("The computer will now begin rolling.");
                cpuPlayerNum = randGen.nextInt(5) + 2;
                die1 = gameDie1.rollDie();
                die2 = gameDie2.rollDie();
                diceSum = die1 + die2;
                if (die1 == cpuPlayerNum && die2 == cpuPlayerNum) {
                    System.out.println("The computer rolled their number on both die! Sorry, " + player1.getName() + ", you lose the game!");
                    break;
                } else if (die1 == 1 && die2 == 1) {
                    System.out.println("The computer rolled a 1 on both die. It loses 25 points. It is now your turn.");
                    cpuPlayer.decreaseScore(25);
                    activePlayer = ActivePlayer.human;
                    GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    continue;
                } else if (die1 == 1 || die2 == 1) {
                    System.out.println("The computer rolled a 1 on one of the die. The computer gains no points. It is now your turn.");
                    activePlayer = ActivePlayer.human;
                    GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    continue;
                } else {
                    cpuPlayer.increaseScore(diceSum);
                    System.out.println("The computer didn't roll a 1! Its score increased by " + diceSum + ". The computer's current score is " + cpuPlayer.getOverallScore());
                    if (cpuPlayer.getOverallScore() > 98) {
                        System.out.println("The computer's score has reached or surpassed 99! You lose!");
                        break;
                    } else if (die1 == cpuPlayerNum || die2 == cpuPlayerNum) {
                        System.out.println("The computer rolled " + die1 + " and " + die2 + ". Since it rolled its number one one die, it gets to roll again!");
                    } else {
                        System.out.println("The computer rolled " + die1 + " and " + die2 + ". Since it rolled its number on neither die, it is now your turn.");
                        activePlayer = ActivePlayer.human;
                        GameMechanics.printPlayerSwitch(player1, cpuPlayer);
                    }
                }
            }
        }
    }
}
