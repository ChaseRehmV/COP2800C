public class ArrPlayground {
    public static void main(String[] args) {

        // element from the assignment instructions
        String[] names = {"alice", "bob", "carl", "donald", "ella", "felicia"};

        // calling the printElements method with ArrElementDisplay class with the assignment String array
        ArrElementDisplay.printElements(names);

        // creating two int array of varying sizes
        int[] intArrOne = {1, 6, 93, 76, 90, 35, 76, 22};
        int[] intArrTwo = {86, 94, 18, 5, 786, 34567, 190, 400000, 876, 543, 98, 12, 87, 39};

        // printing the returned value of the calcAvg method on both int arrays
        System.out.println(ArrElementCalc.calcAvg(intArrOne));
        System.out.println(ArrElementCalc.calcAvg(intArrTwo));

        // creating two double arrays of varying sizes
        double[] doubleArrOne = {78.4, 45.6, 9056.43, 43.56789, 20.7685, 435893.2, 987.9, 34.9, 23.76, 45.87};
        double[] doubleArrTwo = {9865.90, 356.4, 3.5, 76.9, 352.9, 87.87, 90.4};

        // print the returned value of the calcAvg method on both double arrays
        System.out.println(ArrElementCalc.calcAvg(doubleArrOne));
        System.out.println(ArrElementCalc.calcAvg(doubleArrTwo));
    }
}
