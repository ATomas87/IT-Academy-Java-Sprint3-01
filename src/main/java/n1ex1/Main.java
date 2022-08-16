package n1ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("1 - Enter a new command");
            System.out.println("2 - Undo");
            System.out.println("3 - Show commands history");
            System.out.println("0 - Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter a command:");
                    undo.enterCommand();
                    break;
                case 2:
                    undo.removeCommand();
                    break;
                case 3:
                    undo.showHistory();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid option");
            }
        } while (true);
    }
}
