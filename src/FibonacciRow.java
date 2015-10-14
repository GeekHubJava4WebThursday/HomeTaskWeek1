/**
 * Created by Admin on 15.10.15.
 */
public class FibonacciRow {

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
