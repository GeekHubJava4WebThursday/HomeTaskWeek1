
public class Factorial {

    private static final int MAX_NUMBER = 20;

    public static long getFactorial(int number){
        if(number > MAX_NUMBER) {
            System.out.println("Number must be in the range [0, " + MAX_NUMBER +"].");
        }
        else if(number <  0){
            System.out.println("Number must be positive");
        }
        else{
            return calculateFactorial(number);
        }
        return 0;
    }

    private static long calculateFactorial(int number){
        if(number == 0){
            return 1;
        }
        else {
            return number * calculateFactorial(number - 1);
        }
    }
}
