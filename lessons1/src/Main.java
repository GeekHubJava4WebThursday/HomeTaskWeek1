import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String menu = "\nEnter number to select operation " +
                "\n  1. Calculate the factorial " +
                "\n  2. Output the Fibonacci sequence " +
                "\n  3. Convert digit to word" +
                "\n Press another number for exit";

        while(true){
            System.out.println(menu);
            switch (scanner.nextInt()){
                case 1:
                    System.out.print("Enter the number in the range [0, 20]: ");
                    int number = scanner.nextInt();
                    System.out.println(number + "! = " + Factorial.getFactorial(number));
                    break;
                case 2:
                    System.out.print("Enter the size of Fibonacci sequence: ");
                    new FibonacciSequence(scanner.nextInt()).outputFibonacciSequence();
                    break;
                case 3:
                    System.out.print("Enter the digits: ");
                    Digits.toWord(scanner.nextInt());
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}
