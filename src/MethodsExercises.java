import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(3, 6));
        System.out.println("(9 == addition(3, 6)) = " + (9 == addition(3, 6))); // testing
        System.out.println(subtraction(10, 6));
        System.out.println(multiplication(3, 5));
//        System.out.println(division(5, 0)); // Infinity
        System.out.println(division(5, 2));
        System.out.println(modulus(10, 3));
        System.out.println(multiplication1(3, 5));
        System.out.println(multiplication1(5, 3));
        System.out.println(multiplication1(-1, 3));
        System.out.println(multiplication1(-1, -3));
        System.out.println(multiplication1(-1, 0));
        System.out.println(multiplication1(0, 0));
        System.out.println(multiplication1(0, 3));
        System.out.println(multiplication1(1, -3));
        System.out.println(multiplication2(3, 5));
        System.out.println(multiplication2(5, 3));
        System.out.println(multiplication2(5, 0));
        System.out.println(multiplication2(-1, 3));
        System.out.println(multiplication2(-1, -3));
        System.out.println(multiplication2(-4, -3));
        System.out.println(multiplication2(3, -1));

        askFactorial();
        rollDice();
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int multiplication1(int a, int b) {
        int result = 0;
        if (a < 0 && b < 0) {
            for (int i = 0; i < Math.abs(a); i++)
                result += Math.abs(b);
        } else if (a < 0 || b < 0) {
            for (int i = 0; i < Math.abs(a); i++)
                result += Math.abs(b);
            result = -result;
        } else {
            for (int i = 0; i < a; i++)
                result += b;
        }
        return result;
//        if (a < b)
//            for (int i = 0; i < a; i++)
//                result += b;
//        else
//            for (int i = 0; i < b; i++)
//                result += a;
    }

    public static int multiplication2(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        else if (b > 0)
            return multiplication2(a, b - 1) + a;
        else if (a > 0)
            return multiplication2(a - 1, b) + b;
        else
            return multiplication2(Math.abs(a), Math.abs(b) - 1) + Math.abs(a);
    }

    public static double division(int num1, int num2) {
        return (double) num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max)
            return userInput;

        return getInteger(min, max);
    }

    public static void askFactorial() {
        Scanner sc1 = new Scanner(System.in);
        int num = getInteger(1, 20);

//        factorial(num); // for loop method
        System.out.printf("%d! = %d%n", num, factorial1(num)); // recursion method

        System.out.println("continue? y/n");
        String userAnswer = sc1.next();
        if (userAnswer.equalsIgnoreCase("y"))
            askFactorial();
    }

    public static void factorial(int x) {
        long result = 1;
        for (int i = 1; i <= x; i++)
            result *= i;
        System.out.printf("%d! = %d%n", x, result);
    }

    public static int factorial1(int x) {
        if (x == 1)
            return 1;
        return factorial1(x - 1) * x;
    }

    public static void rollDice() {
        Scanner sc2 = new Scanner(System.in);
        int counter = 0;
        do {
            System.out.println("please roll the dice. y/n");
            String respond = sc2.next();
            if (respond.equalsIgnoreCase("n"))
                break;
            else {
                System.out.print("Enter a number for the sides of your dices: ");
                int userInput = sc2.nextInt();
                counter ++;
                int num1 = randomNumberGenerator(userInput);
                int num2 = randomNumberGenerator(userInput);
                System.out.printf("your dices are %d, %d.%n", num1, num2);
                System.out.printf("you played %d times.%n", counter);
            }
        } while (true);
    }

    public static int randomNumberGenerator(int num) {
        return (int) (1 + Math.random() * num);
    }
}
