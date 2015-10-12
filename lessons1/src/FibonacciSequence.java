
public class FibonacciSequence {
    private  int[] fibonacciSequence;

    FibonacciSequence(int sequenceLength){
        fibonacciSequence = new int[sequenceLength];
        create();
    }

    private void create(){
        fibonacciSequence[0] = 1;
        fibonacciSequence[1] = 1;

        for(int i = 2; i < fibonacciSequence.length; i++){
            fibonacciSequence[i] = fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
    }

    public void outputFibonacciSequence(){
        System.out.print("First " + fibonacciSequence.length + " fibonacci number: ");
        for(int fibonacciNumber : fibonacciSequence){
            System.out.print(fibonacciNumber + " ");
        }
        System.out.println();
    }

    public int[] getFibonacciSequence() {
        return fibonacciSequence;
    }
}


