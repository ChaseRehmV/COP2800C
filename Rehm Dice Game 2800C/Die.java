import java.util.Random;

public class Die {
    Random randGen = new Random();

    private int dieNum;

    /**
     * Default constructor. Creates a Die object and
     * sets this object's dieNum field to a random
     * number between 1 and 6 inclusive.
     */
    public Die () {
        // default constructor
        this.dieNum = randGen.nextInt(6) + 1;
    }

    /**
     * Generates a random number between 1 and 6 inclusive.
     * Returns that random number and sets this objects dieNum
     * field with that number as well.*/
    public int rollDie() {
        this.dieNum = randGen.nextInt(6) + 1;
        return this.dieNum;
    }

    /**
     * Returns this Die object's dieNum field.
     *
     */
    public int getDieNum() {
        return this.dieNum;
    }


}
