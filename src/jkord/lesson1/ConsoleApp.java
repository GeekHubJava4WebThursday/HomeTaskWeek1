package jkord.lesson1;

import enigma.console.Console;
import enigma.core.Enigma;
import java.util.*;

import jkord.lesson1.handler.Command;

public class ConsoleApp
{
    private Console sConsole;
    private String title;

    private ArrayList<Command> commands;
    private int maxStrIndexCommand;

    public ConsoleApp(String title) {
        sConsole = Enigma.getConsole(title);

        this.title = title;
        this.commands = new ArrayList<>();

        //colorText = new TextAttributes(Color.BLUE, Color.WHITE);
        //colorRestText = new TextAttributes(Color.WHITE, Color.BLACK);
    }

    public void addSubApp(List<Command> items) {
        commands.addAll(items);
        commands.add(new Command("Exit (Esc)", () -> close()));

        maxStrIndexCommand = maxStrList();
    }

    public int maxStrList() {
        int max = 0;
        for (int i = 0; i < commands.size(); i++)
            if (commands.get(max).getName().length() < commands.get(i).getName().length())
                max = i;

        return commands.get(max).getName().length();
    }

    public void print(String text) {
        System.out.print(text);
    }
    public void printLn(String text) {
        System.out.println(text);
    }
    public void enter() {
        System.out.println();
    }
    public int read() {
        while (true) {
            try {
                return Integer.parseInt(sConsole.readLine());
            } catch (Exception e) {
                System.out.println("Invalid input! Try again");
            }
        }
    }

    private void clearFirstStep() {
        for (int i = 0; i < 20; i++)
            enter();
    }

    private void clearSecondStep() {
        for (int i = 0; i < 20; i++)
            printLn(".");
    }

    public void drawPart() {
        print(" ");
        for (int i = 0; i < maxStrIndexCommand + 4; i++)
            print("-");
        enter();
    }

    public void drawLines() {
        clearFirstStep();

        for (int j = 0; j <= (maxStrIndexCommand + 4 - title.length()) / 2; j++)
           print(" ");
        print(title);

        enter();
        drawPart();

        int i = 0, index = 1;
        for (Command command : commands)
        {
            //if (i == selectIndex)
               // sConsole.setTextAttributes(colorText);

            if (command.getName() != "-") {
               print("| " + index +" ");
               print(command.getName());

                for (int j = 0; j < maxStrIndexCommand - command.getName().length(); j++)
                   print(" ");
                printLn(" |");
                index++;
            } else {
                drawPart();
            }

            //sConsole.setTextAttributes(colorRestText);
            i++;
        }

        drawPart();
    }

    public void processing() {
        while (true) {
            drawLines();
            print("Choose: ");
            int index = read() - 1;
            if (index > 0 && index < commands.size())
                commands.get(index).run();
            else
                printLn("Command not found!");
        }
    }

    public void close() {
        System.exit(0);
    }
}