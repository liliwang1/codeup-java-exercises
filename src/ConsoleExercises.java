import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        System.out.print("Please enter an integer: ");
        int userInput = sc.nextInt();
        System.out.println("Your integer is: " + userInput);

        System.out.print("Enter three words: ");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        System.out.printf("Your input is: %s %s %s%n", word1, word2, word3);
        System.out.println("first word is " + word1);
        System.out.println("second word is " + word2);
        System.out.println("third word is " + word3);

        System.out.print("Enter a sentence: ");
        sc.nextLine();
        String userSentence = sc.nextLine();
        System.out.println("Your sentence is: " + userSentence);

        System.out.println("Please enter the length, width and height: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(num1 + " " + num2 + " " + num3);

        int a = parseInt("438");
//        int number1 = Integer.parseInt(sc.nextLine());
//        int number2 = Integer.parseInt(sc.nextLine());
//        int number3 = Integer.parseInt(sc.nextLine());
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

//        float length = Float.parseFloat(sc.next());
//        float width = Float.parseFloat(sc.next());
//        float height = Float.parseFloat(sc.next());
//        float area = length * width;
//        float perimeter = 2 * (length + width);
//        float volume = length * width * height;
////        System.out.println("the area is %.2f and the perimeter is %.2f", area, perimeter);
//        System.out.println("area is " + area + " perimeter is " + perimeter + " volume is " + volume);
    }
}
