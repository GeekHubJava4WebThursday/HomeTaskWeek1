import java.util.ArrayList;
/**
 * Fibbonachi
 */
public class Fibbonachi {
    /**
     * @param count amount of fibbonachies numbers
     * @return sequence of fibbonachies numbers
     */
    public static ArrayList<Integer> findSequence(int count) {
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

    /**
     * @param count number of fibbonachies numbers
     * @return fibbonachies number
     */
    public static int findNumber(int count) {
        if (count == 1) {
            return 0;
        }
        else {
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
}
