import java.io.IOException;
import java.util.Scanner;

/**
 * Class for testing methodsK
 */
public class Main {
    public static void main(String argv[]) throws IOException{
       test();
    }
    private static void test() throws IOException{
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What do you wanna do?");
            System.out.println("1 - calculate the factorial");
            System.out.println("2 - get Fibonacci number");
            System.out.println("3 - get Fibonacci sequence");
            System.out.println("4 - convert numeral in the word");
            System.out.print("option : ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Calculate factorial of : ");
                    int factorial = sc.nextInt();
                    System.out.println(factorial + "!" + " = " + Factorial.find(factorial));
                    break;
                case 2:
                    System.out.print("Input the index number of Fibonacci numbers : ");
                    int number = sc.nextInt();
                    System.out.println(number + " Fibonacci number = " + Fibonacci.findNumber(number));
                    break;
                case 3:
                    System.out.print("Input amount of Fibonacci numbers : ");
                    int amount = sc.nextInt();
                    System.out.println(amount + " Fibonacci number = " + Fibonacci.findSequence(amount));
                    break;
                case 4:
                    System.out.print("Input the numeral : ");
                    int numeral = sc.nextInt();
                    System.out.println(numeral + " - " + Numerals.getWord(numeral));
                    break;
                default:
                    break;
            }
        } while (choice() == true);
    }

    /**
     * @return your choise, else try input again
     */
    private static boolean choice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Try again?(y/n) : ");
        String  stop = sc.nextLine();
        if (stop.equals("y") || stop.equals("Y")) {
            return true;
        }
        else if (stop.equals("n") || stop.equals("N")) {
            return false;
        }
        else {
            System.out.println("Incorrect input");
            return choice();
        }
    }
}
