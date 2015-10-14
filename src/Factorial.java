/**
 * Created by Andrey Harkusha on 13.10.15.
 */
public class Factorial {

    public static int factorialUnRecursive(long num) {
        int factorialResult=1;

        for (; num > 0; factorialResult *= num--);

        return factorialResult;
    }

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


