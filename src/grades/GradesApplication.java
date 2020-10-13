package grades;

import util.Input;

import java.util.*;

public class GradesApplication {
    static Input scanner = new Input();
    static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        students.put("lucy1", generateNewStudent("lucy")); // putIfAbsent
        students.put("zoe2", generateNewStudent("zoe"));
        students.put("anna3", generateNewStudent("anna"));
        students.put("kat@github", generateNewStudent("kat"));
        students.put("amy5", generateNewStudent("amy"));
        ArrayList<String> keysArrayList = new ArrayList<>(students.keySet());

        System.out.println(students.get("lucy1").getGradeAverage());
        System.out.println(students.get("lucy1").getGrades());
        System.out.println(students.get("lucy1").getAbsentDays());
//        System.out.println(students.get("lucy1").attendance);
        System.out.println(keysArrayList);
        System.out.println(keysArrayList.get(0));

        initiateCLI(keysArrayList);
    }

    public static void initiateCLI(ArrayList<String> keysArrayList) {
        System.out.println("Welcome!\nYou can view overall or individual stats of our students.");
        do {
            int userChoice = scanner.getInt(1, 2, "Enter 1 to choose overall stats, 2 to choose individual's: ");
            if (userChoice == 1)
                userValidationOfOverallStats(keysArrayList);
            else if (userChoice == 2)
                userValidationOfSingleStudent();
        } while (userConfirmation());
    }

    public static void userValidationOfOverallStats(ArrayList<String> keysArrayList) {
        scanner.getString();
        int userOverallStatsChoice = scanner.getInt(1, 3, "Enter 1 for grades of all students, 2 for class average grade, 3 for a full report:  ");
        if (userOverallStatsChoice == 1)
            allStudentsGrades();
        else if (userOverallStatsChoice == 2)
            classAverage();
        else if (userOverallStatsChoice == 3)
            csvFullReport(keysArrayList);
    }

    public static void allStudentsGrades() {
        scanner.getString();
        for (Student student : students.values())
            System.out.println(capitalizeFirstLetter(student.getName()) + ": " + student.getGrades());
    }

    public static void classAverage() {
        scanner.getString();
        double i = 0;
        for (Student student : students.values())
            i += student.getGradeAverage();
        System.out.println(i / students.size());
    }

    public static void csvFullReport(ArrayList<String> keysArrayList) {
        scanner.getString();
        System.out.printf("name, github_username, average_grade%n");
        for (String key : keysArrayList) {
//            System.out.printf("%-6s%-16s %s%n",
//                    capitalizeFirstLetter(students.get(key).getName()) + ",",
//                    key + ",",
//                    students.get(key).getGradeAverage());
            System.out.printf("%s, %s, %s%n",
                    capitalizeFirstLetter(students.get(key).getName()),
                    key,
                    students.get(key).getGradeAverage());
        }
    }

    public static void userValidationOfSingleStudent() {
        scanner.getString();
        System.out.println("Here are the GitHub usernames of our students: ");
        for (String i : students.keySet())
            System.out.printf("| %s |  ", i);
        String userValidation = scanner.getString("\nWhich student would you like to see more information on?\n").trim();
        if (!students.containsKey(userValidation))
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userValidation);
        else {
            displayStudentInfo(userValidation);
        }
        if (scanner.yesNo("see another student? y/yes"))
            userValidationOfSingleStudent();
        else
            scanner.getString();
    }

    public static void displayStudentInfo(String key) {
        System.out.printf("Name: %s  -  GitHub Username: %s%nCurrent Average: %.2f  -  Grades: %s%nAttendance Percentage: %.2f%%%n",
                capitalizeFirstLetter(students.get(key).getName()),
                key,
                students.get(key).getGradeAverage(), students.get(key).getGrades(),
                students.get(key).attendanceRate() * 100);
    }

    public static boolean userConfirmation() {
        String userConfirmation = scanner.getString("Would you like to see more stats? Enter y/yes to continue, n/no to leave: \n").trim().toLowerCase();
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
        addAttendanceToStudent(student, 5);
        return addGradesToStudent(student, 4);
    }

    public static Student addGradesToStudent(Student student, int gradeNumbers) {
        for (int i = 0; i < gradeNumbers; i++)
            student.addGrade(generateRandomNumber(60, 100));
        return student;
    }

    public static Student addAttendanceToStudent(Student student, int dateNumbers) {
        for (int i = 0; i < dateNumbers; i++) {
            String date = String.format("2020-9-%02d", generateRandomNumber(20, 30));
            String attendance = generateRandomNumber(1, 10) == 1 ? "A" : "P";
            student.recordAttendance(date, attendance);
        }
        return student;
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static String capitalizeFirstLetter(String str) {
        return str.substring(0, 1).toUpperCase().concat(str.substring(1).toLowerCase());
    }
}
