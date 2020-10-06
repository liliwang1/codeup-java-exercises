package shapes;

import util.Input;

public class CircleApp {
    private static int counter;

    public static void displayCounter() {
        System.out.println("you have created " + counter + " circles.");
    }

    public static void main(String[] args) {
        Input input = new Input();

        do {
            System.out.print("Enter a number for the radius of a circle: ");
            double userInputRadius = input.getDouble();
            counter++;
            Circle circle1 = new Circle(userInputRadius);

            System.out.println("area of your circle is: " + circle1.getArea());
            System.out.println("circumference of your circle is: " + circle1.getCircumference());

            System.out.println("Enter y/yes to continue.");
            if (!input.yesNo()) {
                displayCounter();
                break;
            }
        } while (true);
    }
}
