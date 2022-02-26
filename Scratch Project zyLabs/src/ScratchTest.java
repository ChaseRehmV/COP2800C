import java.util.Random;
import java.util.Scanner;

public class ScratchTest {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        String simonPattern;
        String userPattern;
        int userScore;
        int i;

        userScore = 0;

        simonPattern = scnr.next();
        userPattern  = scnr.next();

        for (i = 0; i < userPattern.length(); ++i) {
            if (simonPattern.charAt(i) == userPattern.charAt(i)) {
                userScore++;
            } else {
                break;
            }
        }

        System.out.println("userScore: " + userScore);

        return;
    }
}
