package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        String str = scanner.nextLine();
//        scanner.nextLine();
        return str;
    }

    public boolean yesNo() {
        return scanner.next().equalsIgnoreCase("y") || scanner.next().equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getInt(min, max);
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.print("Enter a float point number between " + min + " and " + max + ": ");
        double userInput = scanner.nextDouble();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getDouble(min, max);
    }

    public double getDouble() {
        return scanner.nextDouble();
    }

}
