public class ArrElementCalc {

    // method for
    public static double calcAvg(double[] array) {
        double avg;
        double sum = 0;
        double numOfElements = (double) array.length;

        for (double element: array) {
            sum += element;
        }

        return sum / numOfElements;
    }

    public static int calcAvg(int[] array) {
        int avg;
        int sum = 0;
        int numOfElements = array.length;

        for (double element: array) {
            sum += element;
        }

        return sum / numOfElements;
    }

}
