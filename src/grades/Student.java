package grades;

import java.util.ArrayList;

public class Student {
    public static void main(String[] args) {
        Student student = new Student("Test");
        System.out.println(student.name);
        student.addGrade(90);
        student.addGrade(95);
        student.addGrade(92);
        System.out.println(student.getGradeAverage());

    }

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

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (double grade : grades)
            total += grade;
        return total / grades.size();
    }


}
