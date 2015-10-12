import java.io.IOException;
/**
 * Factorial
 */
public class Factorial {
    /**
     * @param number argument (factorial of this number)
     * @return factorial of argument
     */
    public static long find(long number) throws IOException{
        try {
            if (number < 0) {
                throw new IOException();
            }
            if (number == 1) {
                return 1;
            } else {
                return number * find(number - 1);
            }
        }
        catch (IOException exc) {
            System.err.println("Number must be positive (num > 0 )");
            throw exc;
        }

    }
}