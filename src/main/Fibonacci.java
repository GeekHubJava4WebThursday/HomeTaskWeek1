package main;

/**
 * @author Sergiy Govorukhin
 */
public class Fibonacci {

    private int sequence[];

    public Fibonacci(int quantity) {
        sequence = new int[quantity];
        getFibonacciSequence();
    }

    /**
     *  Calculate Fibonacci sequence
     */
    private void getFibonacciSequence() {
        sequence[0] = 0;
        sequence[1] = 1;
        for (int i = 2; i < sequence.length; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
    }

    @Override
    public String toString() {
        String sequence = "";
        for (int i = 0; i < this.sequence.length; i++) {
            sequence += this.sequence[i] + " ";
        }
        return sequence;
    }
}





