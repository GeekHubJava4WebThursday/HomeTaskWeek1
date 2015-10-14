/**
 * Created by Andrey Harkusha on 13.10.15.
 */
public class Digits {
    private static String[] digitArray = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
    };
            public static void digitToString(int digit){
                try{
                    System.out.println("Your digit " + digit + " is " + digitArray[digit]);
                }
                catch(IndexOutOfBoundsException e){
                    System.out.println("Your input is not a simple digit. Try use (0,...,9).");
                                    }
            }

            public static void main(String argv[]){
                // right use
                digitToString(5);

                //wrong use
                digitToString(4566);
            }
}