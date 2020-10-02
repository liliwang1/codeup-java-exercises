import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        do {
//            System.out.println("Say something to Bob: ");
//            String userInput = sc.nextLine().trim();
//
//            if (userInput.endsWith("?"))
//                System.out.println("Sure.");
//            else if (userInput.endsWith("!"))
//                System.out.println("Whoa, chill out!");
//            else if (userInput.equals("")) // .isEmpty() .isBlank()
//                System.out.println("Fine. Be that way!");
//            else
//                System.out.println("Whatever.");
//
//            System.out.print("Continue? enter exit to end conversation ");
//            String answer = sc.next().toLowerCase();
//            sc.nextLine();
//            if (answer.equals("exit"))
//                break;
//        } while (true);

        do {
            System.out.println("Say something to Bob, you can stop the conversation by saying \"bye\".");
            String userInput = sc.nextLine().trim();

            if (userInput.endsWith("?"))
                System.out.println("Sure.");
            else if (userInput.endsWith("!"))
                System.out.println("Whoa, chill out!");
            else if (userInput.equals("")) // .isEmpty() .isBlank()
                System.out.println("Fine. Be that way!");
            else if (userInput.equalsIgnoreCase("bye"))
                break;
            else
                System.out.println("Whatever.");
        } while (true);
    }
}
