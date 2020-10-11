package grades;

import java.util.*;

public class GradesApplication {
    static Scanner scanner = new Scanner(System.in);
    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        students.put("lucy1", generateNewStudent("lucy"));
        students.put("zoe2", generateNewStudent("zoe"));
        students.put("anna3", generateNewStudent("anna"));
        students.put("kat@github", generateNewStudent("kat"));
        students.put("amy5", generateNewStudent("amy"));

        System.out.println(students.get("lucy1").getGradeAverage());
        System.out.println(students.get("lucy1").getGrades());
        ArrayList<String> keysArrayList = new ArrayList<>(students.keySet());
        System.out.println(keysArrayList);
        System.out.println(keysArrayList.get(0));

        initiateCLI();
    }

    public static void initiateCLI() {
        System.out.println("Welcome!\nHere are the GitHub usernames of our students: \n");
        do {
            for (String i : students.keySet())
                System.out.printf("| %s |  ", i);
            System.out.println("\nWhich student would you like to see more information on? ");
            userValidation();
        } while (userConfirmation());
    }

    public static void userValidation() {
        String userValidation = scanner.next().trim();
        if (!students.containsKey(userValidation))
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userValidation);
        else {
            displayStudentInfo(userValidation);
        }
    }

    public static void displayStudentInfo(String key) {
        System.out.printf("Name: %s  -  GitHub Username: %s%nCurrent Average: %.2f  -  Grades: %s%n",
                capitalizeFirstLetter(students.get(key).getName()),
                key,
                students.get(key).getGradeAverage(), students.get(key).getGrades());
    }

    public static boolean userConfirmation() {
        System.out.println("Would you like to see another student? Enter y/yes to continue, n/no to leave: ");
        String userConfirmation = scanner.next().trim().toLowerCase();
        if (userConfirmation.equals("y") || userConfirmation.equals("yes"))
            return true;
        else if (userConfirmation.equals("n") || userConfirmation.equals("no")) {
            System.out.println("Goodbye, have a wonderful day!");
            return false;
        } else {
            System.out.println("Sorry, I don't understand that.");
            return userConfirmation();
        }
    }

    public static Student generateNewStudent(String name) {
        Student student = new Student(name);
        return addGradesToStudents(student, 4);
    }

    public static Student addGradesToStudents(Student student, int gradeNumbers) {
        for (int i = 0; i < gradeNumbers; i++)
            student.addGrade(generateRandomGrade());
        return student;
    }

    public static int generateRandomGrade() {
        return (int) (Math.random() * 41 + 60);
    }

    public static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1).toLowerCase());
    }
}
