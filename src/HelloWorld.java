import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//        System.out.print("Hello,");
//        System.out.println(" World!");
        /* Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.

Create a String variable named myString and assign a string value to it, then print the variable out to the console.

Change your code to assign a character value to myString. What do you notice?
Change your code to assign the value 3.14159 to myString. What happens?

Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
Change your code to assign the value 3.14 to myNumber. What do you notice?
Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
Change your code to assign the value 123 to myNumber.
Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

Copy and paste the following code blocks one at a time and execute them
int x = 5;
System.out.println(x++);
System.out.println(x);

int x = 5;
System.out.println(++x);
System.out.println(x);
What is the difference between the above code blocks? Explain why the code outputs what it does.

Try to create a variable named class. What happens?

Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
String theNumberThree = "three";
Object o = theNumberThree;
int three = (int) o;
Copy and paste the code above and then run it. Does the result match with your expectation?
How is the above example different from the code block below?
int three = (int) "three";
What are the two different types of errors we are observing?

Rewrite the following expressions using the relevant shorthand assignment operators:
int x = 4;
x = x + 5;

int x = 3;
int y = 4;
y = y * x;

int x = 10;
int y = 2;
x = x / y;
y = y - x;

What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
 */
        // Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 68;
        System.out.println(myFavoriteNumber);
        // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        // Change your code to assign a character value to myString. What do you notice?
        // Change your code to assign the value 3.14159 to myString. What happens?
        String myString = "3.1415";
        System.out.println(myString);
        // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        // Change your code to assign the value 3.14 to myNumber. What do you notice?
        // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        // Change your code to assign the value 123 to myNumber.
        // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
        // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber = 3.14F;
        float myNumber1 = (float)3.14;
        System.out.println(myNumber);
        System.out.println(myNumber1);
        // Copy and paste the following code blocks one at a time and execute them
        //int x = 5;
        //System.out.println(x++);
        //System.out.println(x);
        //
        //int x = 5;
        //System.out.println(++x);
        //System.out.println(x);
        //What is the difference between the above code blocks? Explain why the code outputs what it does.
        int x = 5;
        System.out.println(x++);
        System.out.println(x);
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
        // Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;
        //Copy and paste the code above and then run it. Does the result match with your expectation?
        //How is the above example different from the code block below?
        //int three = (int) "three";
        //What are the two different types of errors we are observing?
        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);
//        int three = (int) o; //* error: Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        int three = (int) "three"; // error: incompatible types: java.lang.String cannot be converted to int
        byte z = 127;
        z += 130;
        System.out.println(z);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        int testNumber = 100_000;
        System.out.println(testNumber);
        int[] numbers = { 4, 2, 7 };
        String result = Arrays.toString(numbers);
        System.out.println(numbers);
        System.out.println(result);
        double output = (double)10 / (double)3;
        float output1 = (float)10 / (float) 3;
        System.out.println(output);
        System.out.println(output1);
    }
}
