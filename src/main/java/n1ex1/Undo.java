package n1ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Undo {
    private static Undo instance;
    private List<String> commands;
    private Scanner scanner;


    private Undo() {
        this.commands = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void enterCommand() {
        String command = scanner.nextLine();
        this.commands.add(command);
        //sc.close();
    }

    public void removeCommand() {
        if (this.commands.size() > 0) {
            this.commands.remove(this.commands.size() - 1);
        } else {
            System.out.println("There are no commands in the history.");
        }
    }

    public void showHistory() {
        if (this.commands.size() > 0) {
            commands.forEach(System.out::println);
        } else {
            System.out.println("There are no commands in the history.");
        }
    }
}
