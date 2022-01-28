import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {

        // Declare new Vehicle reference variable myCar1 and instantiate object
        Vehicle myCar1;
        myCar1 = new Vehicle();
        Scanner keyboard = new Scanner(System.in);
        int milesToDrive;

        // Setting year, miles and mpg of myCar1
        myCar1.setYear(1997);
        myCar1.setMiles(187900);
        myCar1.setMpg(36.5);
        myCar1.setModel("Taurus");

        // Outputting myCar1 information
        myCar1.printInfo();

        // Receiving input from user for # of miles to be driven
        System.out.print("Please enter the miles to be driven in this vehicle: ");
        milesToDrive = keyboard.nextInt();

        // Calculating and outputting new miles value
        myCar1.drive(milesToDrive);
        System.out.println("Vehicle's Updated Mileage: " + myCar1.getMiles());
        System.out.println();

        // Declare new Vehicle reference variable myCar2 and instantiate object
        Vehicle myCar2 = new Vehicle();

        // Setting year, miles and mpg of myCar2
        myCar2.setYear(2008);
        myCar2.setMiles(78254);
        myCar2.setMpg(18.5);
        myCar2.setModel("G20");

        // Outputting myCar2 information
        myCar2.printInfo();

        // Receiving input from user for # of miles to be driven
        System.out.print("Please enter the miles to be driven in this vehicle: ");
        milesToDrive = keyboard.nextInt();

        // Calculating and outputting new miles value
        myCar2.drive(milesToDrive);
        System.out.println("Vehicle's Updated Mileage: " + myCar2.getMiles());
    }
}
