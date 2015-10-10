package jkord.lesson1;

import java.util.*;

import jkord.lesson1.handler.Command;
import jkord.lesson1.util.*;

public class Main
{
    static ConsoleApp app = new ConsoleApp("Lesson 1");

    public void addCommands()
    {
        List<Command> commands = new ArrayList<>();

        commands.add(new Command("Factorial", () -> factorialApp()));
        commands.add(new Command("Fibonacci sequence", () -> sequenceFibonacci()));
        commands.add(new Command("Numbers in words", () -> verbalNumber()));

        app.addSubApp(commands);
    }

    private void factorialApp() {
        app.printLn("   Factorial");
        app.printLn("Enter n: ");
        app.printLn("Result: " + ExtraMath.factorial(app.read()));
    }

    private void sequenceFibonacci() {
        app.printLn("   Sequence Fibonacci");
        app.printLn("Enter n: ");
        app.printLn("Result: " + Arrays.toString(ExtraMath.sequenceFibonacci(app.read())));
    }

    private void verbalNumber() {
        app.printLn("   Numbers in words");
        app.printLn("Enter Number: ");

        app.printLn("Result: " + new VerbalNumber().toString(app.read()));
    }

    public static void main(String[] args)
    {
        new Main().addCommands();
        app.processing();
    }
}