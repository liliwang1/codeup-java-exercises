package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance = new HashMap<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // returns the student's grades
    public String getGrades() {
        String result = "";
        for (int i : grades)
            result += i + ", ";
        return result.substring(0, result.length() - 2);
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    public void recordAttendance(String date, String value) {
//        if (value.equals("A") || value.equals("P"))
            attendance.put(date, value);
    }

    public double attendanceRate() {
        int presentDay = 0;
        for (String s : attendance.values()) {
            if (s.equals("P"))
                presentDay++;
        }
        return (double) presentDay / attendance.size();
    }

    public ArrayList<String> getAbsentDays() {
        ArrayList<String> absentDatesList = new ArrayList<>();
        ArrayList<String> attendanceKey = new ArrayList<>(attendance.keySet());
        for (String key : attendanceKey) {
            if (attendance.get(key).equals("A"))
                absentDatesList.add(key);
        }
        return absentDatesList;
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (int i : grades)
            total += i;
//        for (int i = 0; i < grades.size(); i++)
//            total += grades.get(i);
        return total / grades.size();
    }

    public static void main(String[] args) {
        Student student1 = new Student("lucy");
        student1.addGrade(60);
        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(90);
        System.out.println(student1.getGradeAverage());
//        System.out.println(student1.grades.get(1));
//        System.out.println(student1.grades.size());
    }
}
