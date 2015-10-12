import factorial.FactorialCalculator;
import fibonacci.FibonacciSequencePrinter;
import numbersWriter.NumbersWriterInWords;

public class Main {

    public static void main(String args[]) {
        tests();
    }

    private static void tests() {
        // test Fibonacci's number sequence
        FibonacciSequencePrinter fibonacciSequencePrinter = new FibonacciSequencePrinter(10);
        fibonacciSequencePrinter.print();
        System.out.println("--------------------------------------------------");
        fibonacciSequencePrinter.setLengthOfSequence(200);
        fibonacciSequencePrinter.print();

        System.out.println("==================================================");

        // test factorial calculator
        int testFactorialCalculateArray[] = {5, 50};
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        for (int x : testFactorialCalculateArray) {
            System.out.println("Factorial of " + x + " is "
                    + factorialCalculator.calculate(x));
        }

        System.out.println("==================================================");

        // test writing number in words
        long[] testWriteInWordsArray = {4587l, -505l, 1000000000000001l, 30,
                -1234567890l, 5278234857329573485l, 30109005l, 0};
        NumbersWriterInWords numbersWriterInWords = new NumbersWriterInWords();
        for (long number : testWriteInWordsArray) {
            System.out.print("\nNumber " + number + " read as: ");
            numbersWriterInWords.printNumberInWords(number);
        }
    }

}