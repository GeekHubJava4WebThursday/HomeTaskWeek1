import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
    private int numberOfTerms = 0;
    private List<Long> sequence = new ArrayList<Long>();

    public FibonacciSequence(int numberOfTerms) {
        this.numberOfTerms = numberOfTerms;
    }
    public void displaySequence() {
        sequence.add((long) 0);
        sequence.add((long) 1);
        for (int i = 2; i < numberOfTerms; i++) {
            sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
        }
        for (Long term : sequence) {
            System.out.println(term + " ");
        }
    }
}
