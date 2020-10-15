package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner; //final? static?

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return getString();
    }

    public boolean yesNo() {
        String userConfirmation = scanner.nextLine().toLowerCase();
        return userConfirmation.equals("y") || userConfirmation.equals("yes");
    }

    public boolean yesNo(String prompt) {
        System.out.println(prompt);
        return yesNo();
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
        try {
            return Integer.parseInt(getString().trim());
        } catch (NumberFormatException e) {
            System.out.println("\033[0;31m" + e.toString() + "\033[0m");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            return getInt("Error, Enter an integer: ");
        }
    }

//    public int getInt() {
//        return Integer.parseInt(getString());
//    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
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
        try {
            return Double.parseDouble(getString().trim());
        } catch (NumberFormatException e) {
            System.out.println("\033[0;31m" + e.toString() + "\033[0m");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            return getDouble("Error, Enter a float point number: ");
        }
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public int getBinary() {
        System.out.println("Enter a binary number: ");
        try {
            return Integer.parseInt(getString().trim(), 2);
        } catch (NumberFormatException e) {
            System.out.println("\033[0;33m" + e.toString() + "\033[0m");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("Error");
            return getBinary();
        }
    }

    public int getHex() {
        System.out.println("Enter a hexadecimal number: ");
        try {
            return Integer.parseInt(getString().trim(), 16);
        } catch (NumberFormatException e) {
            System.out.println("\033[0;35m" + e.toString() + "\033[0m");
//            System.out.println(e.getMessage());
//            e.printStackTrace();
            System.out.println("Error");
            return getHex();
        }
    }
}
