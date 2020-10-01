import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // a. while
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        // b. do while
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while(num <= 100);

//        int num1 = 100;
//        do {
//            System.out.println(num1);
//            num1 -= 5;
//        } while(num1 >= -10);

        // overflow, causing infinite loop, change to data type long
//        long num2 = 2;
//        do {
//            System.out.println(num2);
//            num2 *= num2;
//        } while(num2 <= 1_000_000L);

//        int num2 = 2;
//        do {
//            System.out.println(num2);
//            num2 = (int) Math.pow(num2, 2);
//        } while(num2 <= 1_000_000);

        // c. for loop
//       for (int i = 5; i <= 15; i++)
//           System.out.println(i);

//       for (int i = 0; i <= 100; i += 2)
//           System.out.println(i);

//       for (int i = 100; i >= -10; i -= 5)
//           System.out.println(i);

//       for (int i = 1; i < 17; i *= 2) {
//           int num = 2;
//           System.out.println((int) Math.pow(num, i));
//       }

//        for (long num = 2; num < 1_000_000; num *= num)
//            System.out.println(num);

        // FizzBuzz
//        for (int i = 1; i <= 100; i++) {
//            if (i % 15 == 0)
//                System.out.println("FizzBuzz");
//            else if (i % 3 == 0)
//                System.out.println("Fizz");
//            else if (i % 5 == 0)
//                System.out.println("Buzz");
//            else
//                System.out.println(i);
//        }

        // table of powers
//        Scanner sc = new Scanner(System.in);
//        while (true) {
//            System.out.print("Please enter an integer: ");
//            int userInput = sc.nextInt();
//            System.out.println("\nHere is your table:\n");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++)
//                System.out.println(i + "      | " + i * i + "       | " + i * i * i);
//            System.out.println("Do you want to continue? Enter no if don't wish to continue");
//            String answer = sc.next().toLowerCase();
//            if (answer.equals("no")) {
//                System.out.println("Ok, bye~~");
//                break;
//            }
//        }

//        boolean userContinues = true;
//        do {
//            System.out.print("what number would you like to go up to?");
//            int userInput = sc.nextInt();
//            System.out.println("\nhere is your table\n");
//            System.out.println("number | squared | cubed\n------ | ------- | -----");
//            for (int i = 1; i <= userInput; i++)
//                System.out.printf("%-6d | %-7d | %d%n", i, i * i, i * i * i);
//            System.out.println("Continue?[Y/N]");
//            String userAnswer = sc.next();
//            if (!userAnswer.equalsIgnoreCase("y"))
//                userContinues = false;
//        } while (userContinues);

        // grade converter
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.print("What is your grade(in number)? ");
            int numericGrade = sc1.nextInt();
            gradeConvert(numericGrade);
            System.out.print("Do you wish to continue? [Y/N] ");
            String answer = sc1.next().toLowerCase();
            if (answer.equals("n"))
                break;
        }
    }

    public static void gradeConvert(int grade) {
        if (grade > 100 || grade < 0)
            System.out.println("It's not a valid grade number.");
        else if (grade >= 88)
            System.out.println("Your grade is: A");
        else if (grade >= 80)
            System.out.println("Your grade is: B");
        else if (grade >= 67)
            System.out.println("Your grade is: C");
        else if (grade >= 60)
            System.out.println("Your grade is: D");
        else
            System.out.println("Your grade is: F");
    }

}
