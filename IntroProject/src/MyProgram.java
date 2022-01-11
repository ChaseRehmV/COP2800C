import java.util.Scanner;

public class MyProgram {
    public static void main(String[] args) {

        int first;
        int second;
        int sum;
        int doubleSum;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number.");
        first = keyboard.nextInt();
        System.out.println("Please enter another number.");
        second = keyboard.nextInt();
        sum = first + second;
        doubleSum = sum * 2;
        System.out.println("Your first number was " + first + " and your second number was " + second + ". The sum of your numbers is " + sum + ". Your sum doubled is " + doubleSum + ".");
    }
}
