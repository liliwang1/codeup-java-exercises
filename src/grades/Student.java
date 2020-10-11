package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

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
