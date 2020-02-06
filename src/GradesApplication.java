import grades.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner;
        String userInput;

        GradesApplication app = new GradesApplication();

        Student student1 = new Student("Allen");
        student1.addGrade(80);
        student1.addGrade(96);
        student1.addGrade(70);
//        System.out.println(student1.getGradeAverage());

        Student student2 = new Student("Bella");
        student2.addGrade(74);
        student2.addGrade(76);
        student2.addGrade(88);
//        System.out.println(student2.getGradeAverage());

        Student student3 = new Student("Cathy");
        student3.addGrade(99);
        student3.addGrade(50);
        student3.addGrade(77);
//        System.out.println(student3.getGradeAverage());

        Student student4 = new Student("Derek");
        student4.addGrade(84);
        student4.addGrade(81);
        student4.addGrade(93);
//        System.out.println(student4.getGradeAverage());

        HashMap<String, String> students = new HashMap<>();
        students.put(student1.getName(), "peskystreet");
        students.put(student2.getName(), "darkhorse");
        students.put(student3.getName(), "crookedtree");
        students.put(student4.getName(), "hidingmeasles");
//        System.out.println(students);

        //Application

            System.out.println("Welcome!\n");
            System.out.println("Please type one of the following usernames to get information about the student:\n");
//            System.out.println("The collection is: " + students.values().toString());
            for (String student : students.values()) {
                System.out.println(student);
            }
        do {
            scanner = new Scanner(System.in);
            userInput = scanner.nextLine();
            for (String student : students.values()) {
                if (userInput.equalsIgnoreCase(student)) {
//                    System.out.println("Name:\t" + student.getName());
                    System.out.println("GitHub Username:\t" + student);
//                    System.out.println("Current Average:\t" + students.get(student).getGradeAverage().toString());
                } else {
                    System.out.println("Username \"" + student + "\" not found. Please input a username from the list.");
                }
            }
        } while (app.yesNo());

    }

    Scanner scanner;
    String userInput;


    public GradesApplication() {
        // making a scanner for each called instance
        this.scanner = new Scanner(System.in);
    }

//    public StringBuilder printUsername() {
//        System.out.println("\nWhich user would you like to see more information on?\n");
//        scanner = new Scanner(System.in);
//        userInput = this.scanner.next();
//        StringBuilder usernameList = new StringBuilder(" | ");
//        for (Student student : students.values()) {
//            usernameList.append(students.get(student)).append(" | ");
//        }
//        return usernameList;
//    }


    public boolean yesNo() {
        System.out.println("\nWould you like to see another student?");
        scanner = new Scanner(System.in);
        userInput = this.scanner.next();
        return userInput.charAt(0) == 'y';
    }

//    public void printStudentInfo() {
//        scanner = new Scanner(System.in);
//        userInput = scanner.nextLine();
//        for (String student : students.values()) {
//            if (userInput.equalsIgnoreCase(student)) {
//                System.out.println("Name:\t" + this.getName());
//                System.out.println("GitHub Username:\t" + this.values());
//                System.out.println("Current Average:\t" + this.getGradeAverage());
//            }
//            else {
//                System.out.println("Username \"" + this.values() + "\" not found. Please input a username from the list.");
//            }
//        }
//    }

}
