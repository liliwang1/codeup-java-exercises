import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        do {
            int randomNumber = (int) (1 + Math.random() * 100);
            System.out.println("randomNumber = " + randomNumber);
            int counter = 1;
            userValidation(randomNumber, counter);
        } while (userConfirmation());
    }

    public static boolean userConfirmation() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("continue? y/n");
        String userRespond = sc1.next();
        return userRespond.equalsIgnoreCase("y");
    }

    public static void userValidation(int randomNum, int counter) {
        Scanner sc = new Scanner(System.in);
        if (counter > 5)
            System.out.println("Sorry, you have maxed 5 guessing times...");
        else {
            System.out.print("Enter your guess(a number between 1 and 100): ");
            int userNumber = sc.nextInt();
            if (userNumber < randomNum) {
                System.out.println("HIGHER");
                userValidation(randomNum, counter + 1);
            } else if (userNumber > randomNum) {
                System.out.println("LOWER");
                userValidation(randomNum, counter + 1);
            } else {
                System.out.println("GOOD GUESS!");
                System.out.println("you guessed " + counter + " times.");
            }
        }
    }
}
