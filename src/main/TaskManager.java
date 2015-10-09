package main;

import java.util.Scanner;

/**
 * <p>Task Manager</p>
 *
 * @author Sergiy Govorukhin
 *
 */

public class TaskManager {

    private Scanner scanner;

    public TaskManager() {
        this.scanner = new Scanner(System.in);
        runTaskManager();
    }

    private void showMainMenu(){
        System.out.println("Select algorithm:");
        System.out.println("1 - Calculate Factorial");
        System.out.println("2 - Calculate Fibonacci Sequence");
        System.out.println("3 - Transform Numeral to Verbal Form");
        System.out.println("4 - Exit");
    }

    private void showFactorialMenu(){
        System.out.println("Select Factorial method: ");
        System.out.println("1 - Classical Naive");
        System.out.println("2 - Recursive ");
    }


    private void processFactorial() {
        System.out.println("Input n: ");
        int number = scanner.nextInt();
        long result = 0;
        showFactorialMenu();
        if (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    result = Factorial.getFactorial(number);
                    break;
                case 2:
                    result = Factorial.getFactorialRecursive(number);
                    break;
                default:
                    result = Factorial.getFactorial(number);
            }
        }
        if (result > 0) {
            System.out.println("Factorial of " + number + ": " + result);
        }
        // System.out.println("Please, input 1 or 2!");
    }


    private void processFibonacci() {
        System.out.println("Input n: ");
        int number = scanner.nextInt();
        String result = new Fibonacci(number).toString();
        System.out.println("Fibonacci Sequence of " + number + ": " + result);
    }


    private void processNumeral() {
        System.out.println("Input numeral (0..9): ");
        byte numeral = scanner.nextByte();
        String verbal = Numeral.toVerbal(numeral);
        if (!verbal.equalsIgnoreCase("0")) System.out.println("Verbal form of " + numeral + ": " + verbal);
    }

    private void runTaskManager() {
        showMainMenu();
        while (scanner.hasNextInt()) {
            switch (scanner.nextInt()) {
                case 1:
                    processFactorial();
                    break;
                case 2:
                    processFibonacci();
                    break;
                case 3:
                    processNumeral();
                    break;
                case 4:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Please, select only 1-4 option!");
            }
            showMainMenu();
        }
    }
}
