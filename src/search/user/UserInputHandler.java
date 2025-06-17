package search.user;

import java.util.Scanner;

public class UserInputHandler {
    private final Scanner scanner = new Scanner(System.in);

    public int chooseOption() {
        System.out.println("=== Menu ===");
        System.out.println("1. Find a person");
        System.out.println("2. Print all people");
        System.out.println("0. Exit");
        return Integer.parseInt(scanner.nextLine());
    }

    public String chooseStrategy() {
        System.out.println("Select a matching strategy: ALL, ANY, NONE");
        return scanner.nextLine().toLowerCase();
    }

    public String[] inputWordsToSearch() {
        System.out.println("Enter a name or email to search all suitable people.");
        return scanner.nextLine().toLowerCase().split(" ");
    }
}
