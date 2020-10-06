package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo() {
        String userConfirmation = scanner.next();
        return userConfirmation.equalsIgnoreCase("y") || userConfirmation.equalsIgnoreCase("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        String userConfirmation = scanner.next();
        return userConfirmation.equalsIgnoreCase("y") || userConfirmation.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getInt(min, max);
    }

    public int getInt(int min, int max, String prompt) {
        System.out.print(prompt);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getInt(min, max);
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a float point number between " + min + " and " + max + ": ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getDouble(min, max);
    }

    public double getDouble(double min, double max, String prompt) {
        System.out.print(prompt);
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getDouble(min, max);
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }
}
