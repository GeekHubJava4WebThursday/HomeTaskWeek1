package main;

/**
 * @author Sergiy Govorukhin
 */
public class Factorial {
    /*
     *  MAX_NUMBER - maximum allowed number, which Factorial less then Long.MAX_VALUE
     */
    public static final byte MAX_NUMBER = 20;

    /**
     *  Checks the number
     *  @param number - must be between 0 and MAX_NUMBER
     */
    private static boolean isNumberCorrect(long number) {
        if (number > MAX_NUMBER) {
            System.out.println("Number must be less then " + MAX_NUMBER + "!");
            return false;
        } else if (number < 0) {
            System.out.println("Number must be positive!");
            return false;
        } else
            return true;
    }

    /**
     *  Recursive method
     */
    public static long getFactorialRecursive(long number) {
        if (isNumberCorrect(number)) {
            return (number > 1) ? number * getFactorialRecursive(number - 1) : 1;
        }
        return 0;
    }

    /**
     *  Classic naive method
     */
    public static long getFactorial(long number) {
        if (isNumberCorrect(number)) {
            long result = 1;
            for (long i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
        return 0;
    }
}
