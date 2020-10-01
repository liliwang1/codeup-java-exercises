public class StringExercise {
    public static void main(String[] args) {
        // string basics
        String str1 = "We don't need no education";
        System.out.println(str1 + "\n" + str1.replace("education", "thought control"));

        String str2 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(str2);

        String str3 = "In windows, the main drive is usually C:\\";
        System.out.println(str3);

        String str4 = "I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!";
        System.out.println(str4);

        String str5 = "I can do backslashes \\, double backslashes \\\\,\nand the amazing triple backslash \\\\\\!";
        System.out.println(str5);
    }
}
