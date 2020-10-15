package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
//        System.out.println(input.getString());
//        System.out.println(input.getString("Enter a string: "));
//        System.out.println(input.getString("Enter another string: "));
//        System.out.println(input.getInt());
//        System.out.println(input.getDouble());
//        System.out.println(input.getInt(1, 20));
//        System.out.println(input.getDouble(1, 15.5));
//        System.out.println(input.yesNo());
//        input.getInt("Enter an integer: ");
//        input.getInt(1, 10, "Enter an integer: ");
//        System.out.println(input.getString());
//        System.out.println(input.getString());
//        System.out.println(input.getString("Enter a string: "));
//        System.out.println(input.getString("Enter another string: "));
//        String str1 = input.getString("Enter string 1: ");
//        String str2 = input.getString("Enter string 2: ");
//        System.out.println(str1);
//        System.out.println(str2);

        System.out.println(input.getInt("Enter an integer: "));
        System.out.println(input.getDouble("Enter a Double: "));
        System.out.println(input.getBinary());
        System.out.println(input.getHex());
//        Scanner sc = new Scanner(System.in);
//        System.out.println(sc.nextInt()); //InputMismatchException
    }
}
