/**
 *  This class calculates factorial of the number.
 */
public class Factorial {

    /**
     *  Not recursive method to calculates the factorial.
     *  @param num - The number for calculates factorial.
     *  @return factorialResult - Factorial for this number.
     */
    public static int factorialUnRecursive(long num) {
        int factorialResult=1;

        for (; num > 0; factorialResult *= num--);

        return factorialResult;
    }

    /**
     *  Recursive method to calculates the factorial.
     *  @param num - The number for calculates factorial.
     *  @return Factorial for this number.
     */
    public static int factorialRecursive(int num) {
          return (num == 0) ? 1 : num * factorialRecursive(num - 1);
    }


    public static void main(String argv[]){
        long factorialTest = 10;
        System.out.println("Factorial " + factorialTest + " is " + factorialUnRecursive(factorialTest));

        int factorialTest2 = 10;
        System.out.println("Factorial " + factorialTest + " is " + factorialRecursive(factorialTest2));
    }


}


