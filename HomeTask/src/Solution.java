import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String argv[]) throws IOException {
        System.out.println("Hello! What do you want to do?");
        System.out.println("1: calculate the factorial of a number");
        System.out.println("2: display the Fibonacci sequence");
        System.out.println("3: display digit as a string");
        System.out.println("4: nothing");

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        byte requiredAction;
        try {
            requiredAction = Byte.parseByte(consoleReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a digit!");
            return;
        }

        switch (requiredAction) {
            case 1:
               calculateFactorial();
                break;
            case 2:
                displayFibonacciSequence();
                break;
            case 3:
                convertDigitToString();
                break;
            case 4:
                System.out.println("Good bye");
                break;
            default:
                throw new IllegalArgumentException("Digit must be between 1 and 4");
        }
    }
    
    private static void convertDigitToString() throws IOException {
        System.out.println("Enter what digit do you want to convert");
        
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        byte digitToConvert;
        try {
            digitToConvert = Byte.parseByte(consoleReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a digit!");
            return;
        }

        DigitToStringConverter converter = new DigitToStringConverter(digitToConvert);
        converter.convert();
    }

    private static void displayFibonacciSequence() throws IOException {
        System.out.println("Enter the number of terms of the sequence");

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTerms;
        try {
            numberOfTerms = Integer.parseInt(consoleReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a number!");
            return;
        }

        FibonacciSequence fibonacciSequence = new FibonacciSequence(numberOfTerms);
        fibonacciSequence.displaySequence();
    }

    private static void calculateFactorial() throws IOException {
        System.out.println("Enter the number to calculate");

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        int numberToCalculate;
        try {
            numberToCalculate = Integer.parseInt(consoleReader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("You must enter a number!");
            return;
        }

        Factorial factorial = new Factorial(numberToCalculate);
        factorial.calculate();
    }
}
