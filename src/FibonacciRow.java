/**
 *  This class calculates the number of the Fibonacci row.
 */
public class FibonacciRow {

    /**
     *  @param num - The number is less than that calculates Fibonacci row.
     *  @return fibonacciResult - String with Fibonacci row.
     */
    public static String fibonacciRow(int num) {
        String fibonacciResult = "";
        int fibonacciNumber = 0;

        for (int i = 1; i<num ; i=i+fibonacciNumber) {
            fibonacciNumber+=i;
            fibonacciResult = fibonacciResult + i + " ";
            if (fibonacciNumber<num) {
                fibonacciResult = fibonacciResult + fibonacciNumber + " ";
            }
        }

        return fibonacciResult;
    }

    public static void main(String argv[]){
        int fibonacciTest = 1000;
        System.out.println("Fibonacci Row less than " + fibonacciTest + " is " + fibonacciRow(fibonacciTest));
    }
}
