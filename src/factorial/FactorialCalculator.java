package factorial;

import java.math.BigInteger;

/**
 * Class for calculating factorials
 * @version 1.0
 * @author Morhun N.
 */
public class FactorialCalculator {

    /** the point of transition from long to BigInteger */
    private static final long TRANSITION_POINT = 20;

    /**
     * Calculates factorial function.
     * If result can be placed in {@code long} its used,
     * otherwise {@code BigInteger} is used.
     * @param arg factorial function argument
     * @return factorial of argument
     */
    public Number calculate(int arg) {
        return factorialFactory(arg).calculate(arg);
    }

    private Factorial<?> factorialFactory(int arg) {
        if (arg < 0) {
            throw new IllegalArgumentException("Factorial argument must be non negative");
        }
        Factorial<?> factorial;
        if (arg < TRANSITION_POINT) {
            factorial = new FactorialLong();
        } else {
            factorial = new FactorialBigInteger();
        }
        return factorial;
    }

    private abstract class Factorial<T extends Number> {

        public Number calculate(int arg) {
            T result = initResult();
            for (int counter = 1; counter <= arg; counter++) {
                result = nextIteration(result, counter);
            }
            return result;
        }

        protected abstract T initResult();
        protected abstract T nextIteration(T currentResult, int currentIterator);
    }

    private class FactorialLong extends Factorial<Long> {

        @Override
        protected Long initResult() {
            return 1l;
        }

        @Override
        protected Long nextIteration(Long currentResult, int currentIterator) {
            return currentResult * currentIterator;
        }
    }

    private class FactorialBigInteger extends Factorial<BigInteger> {

        @Override
        protected BigInteger initResult() {
            return BigInteger.ONE;
        }

        @Override
        protected BigInteger nextIteration(BigInteger currentResult, int currentIterator) {
            return currentResult.multiply(BigInteger.valueOf(currentIterator));
        }
    }

}
