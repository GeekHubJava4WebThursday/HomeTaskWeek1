package jkord.lesson1.handler;

public class Command
{
    private String name;
    private Action action;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Command(String name) {
        this.name = name;
    }

    public Command(String name, Action action) {
        this.name = name;
        this.action = action;
    }

    public void run() {
        if (action != null)
            action.run();
    }
}