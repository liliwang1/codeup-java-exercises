import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Say something to Bob: ");
            String userInput = sc.nextLine();
            if (userInput.endsWith("?"))
                System.out.println("Sure.");
            else if (userInput.endsWith("!"))
                System.out.println("Whoa, chill out!");
            else if (userInput.equals(""))
                System.out.println("Fine. Be that way!");
            else
                System.out.println("Whatever.");
            System.out.print("Continue? enter exit to end conversation ");
            String answer = sc.next().toLowerCase();
            sc.nextLine();
            if (answer.equals("exit"))
                break;
        } while (true);
    }
}
