import fibonacci.FibonacciSequencePrinter;

public class Main {

    public static void main(String args[]) {
        test();
    }

    private static void test() {
        // test Fibonacci's number sequence
        FibonacciSequencePrinter fibonacciSequencePrinter = new FibonacciSequencePrinter(10);
        fibonacciSequencePrinter.print();
        System.out.println("==================================================");
        fibonacciSequencePrinter.setLengthOfSequence(200);
        fibonacciSequencePrinter.print();
    }

}