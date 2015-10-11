
public class Factorial {
    private int numberToCalculate = 0;

    public Factorial(int numberToCalculate) {
        this.numberToCalculate = numberToCalculate;
    }

    public long calculate() {
        long result = 1;
        for (int i = 1; i <= numberToCalculate; i++) {
            result *= i;
        }
        return result;
    }
}
