/**
 *  This class output a digit in verbal form.
 */
public class Digits {

    // Array of digit's verbal form.
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

            /**
             *  Method make digit in verbal form.
             *  @param digit - Digit for translate.
             *  @return Answer with digit in digital and verbal forms.
             */
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