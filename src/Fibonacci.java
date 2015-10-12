import java.io.IOException;
import java.util.ArrayList;
/**
 * Fibonacci
 */
public class Fibonacci {
    /**
     * @param count amount of "fibonacci numbers"
     * @return sequence of "fibonacci numbers"
     */
    public static ArrayList<Integer> findSequence(int count) throws IOException{
        try {
            if (count < 0) {
                throw new IOException();
            }
            else if (count == 0) {
                return new ArrayList<>(0);
            }
            else if (count == 1) {
                ArrayList<Integer> arrayList = new ArrayList<>();
                arrayList.add(0);
                return arrayList;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(0);
            arrayList.add(1);
            for (int i = 0, a = 0, b = 1; i < count - 2; i++) {
                arrayList.add(a + b);
                int c = a + b;
                a = b;
                b = c;
            }
            return arrayList;
        }
        catch (IOException exc) {
            System.err.println("Sequence must be bigger than 0 (num > 0)");
            throw exc;
        }
    }
    /**
     * @param count sequence number of "fibonacci numbers"
     * @return "fibonacci number"
     */
    public static int findNumber(int count) throws IOException{
        try {
            if (count <= 0) {
                throw new IOException();
            }
            else if (count == 1) {
                return 0;
            } else {
                int a = 0;
                int b = 1;
                for (int i = 0, c; i < count - 2; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                return b;
            }
        }
        catch (IOException exc) {
            System.err.println("Number must be bigger than 0 (num > 0)");
            throw exc;
        }
    }
}
