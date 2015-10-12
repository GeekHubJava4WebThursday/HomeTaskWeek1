/**
 * Factorial
 */
public class Factorial {
    /**
     * @param number argument (factorial of this number)
     * @return factorial of argument
     */
    public static long find(long number) {
        if (number == 1) {
            return 1;
        }
        else {
            return number * find(number - 1);
        }
    }
}