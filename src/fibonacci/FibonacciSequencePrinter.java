package fibonacci;

import java.math.BigInteger;

/**
 * Class for printing first n members of Fibonacci's sequence
 * @version 1.0
 * @author Morhun N.
 */
public class FibonacciSequencePrinter {

    /** the point of transition from long to BigInteger */
    private static final long TRANSITION_POINT = 92;

    private long lengthOfSequence;

    public FibonacciSequencePrinter(long lengthOfSequence) {
        setLengthOfSequence(lengthOfSequence);
    }

    public void setLengthOfSequence(long lengthOfSequence) {
        if (lengthOfSequence < 2) {
            throw new IllegalArgumentException("Fibonacci's sequence must have at least two members!");
        }
        this.lengthOfSequence = lengthOfSequence;
    }

    /**
     * Prints sequence of fibonacci's numbers to {@code lengthOfSequence}
     */
    public void print() {
        // print two first Fibonacci's numbers
        System.out.println("1 : 1");
        System.out.println("2 : 1");
        // print rest
        if (lengthOfSequence < TRANSITION_POINT) {
            printUsingLong();
        } else {
            printUsingBigInteger();
        }
    }

    private void printUsingLong() {
        long prev1 = 1;
        long prev2 = 1;
        long current;
        for (long counter = 3; counter <= lengthOfSequence; counter++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
            System.out.println(counter + " : " + current);
        }
    }

    private void printUsingBigInteger() {
        BigInteger prev1 = BigInteger.ONE;
        BigInteger prev2 = BigInteger.ONE;
        BigInteger current;
        for (long counter = 3; counter <= lengthOfSequence; counter++) {
            current = prev1.add(prev2);
            prev2 = prev1;
            prev1 = current;
            System.out.println(counter + " : " + current);
        }
    }

}
