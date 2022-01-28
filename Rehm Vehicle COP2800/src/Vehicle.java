// Read over the provided code. Reflect on the purpose of each block.
// Do not change or delete any provided code.
// Create a new class in the same project to hold your main() method.
// Interact with this class from your main() method.

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAmount;

public class Vehicle {

    // private fields / internal data

    // year the vehicle was manufactured
    private int year;
    // miles on the total odometer
    private int miles;
    // miles per gallon the vehicle gets
    private double mpg;
    // model of the vehicle
    private String model;


    // public methods / operations
    // constructor - used to create an object from the class
    public Vehicle() {
        // this one is empty; we'll see constructors with code soon!
    }

    // setters (mutators) and getters (accessors)
    public int getYear() {
        // return THIS object's year value
        return year;
    }

    public void setYear(int year) {
        // set THIS object's year to argument (year) value
        this.year = year;
    }

    public int getMiles() {
        // return THIS object's miles value
        return miles;
    }

    public void setMiles(int miles) {
        // set THIS object's miles to argument (miles) value
        this.miles = miles;
    }

    public double getMpg() {
        // return THIS object's mpg value
        return mpg;
    }

    public void setMpg(double mpg) {
        // set THIS object's mpg to argument (mpg) value
        this.mpg = mpg;
    }

    public String getModel() {
        // return THIS object's model name
        return model;
    }

    public void setModel(String model) {
        // set THIS object's model name to argument (model) String value
        this.model = model;
    }

    // instance methods
    public void drive(int miles) {
        // add argument miles value to THIS object's miles
        this.miles += miles;
    }

    public void printInfo() {
        // print out all the properties of THIS object
        System.out.println("--- VEHICLE INFORMATION ---");
        System.out.println("Year of Manufacture: " + this.getYear());
        System.out.println("Model Name: " + this.getModel());
        System.out.println("Mileage: " + this.getMiles());
        System.out.println("Miles Per Gallon: " + this.getMpg());
    }

    public String nextOilChange(String date) {
        LocalDate lastOilChange = LocalDate.parse(date);
        LocalDate nextOilChange = lastOilChange.plus(Period.ofMonths(3));
        String output = ("Your next oil change should take place on: " + nextOilChange.toString());
        return output;
    }
}
