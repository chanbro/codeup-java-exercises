import java.util.Scanner;
/**An Example of Analysis
 Problem: Using the grade assessment scale to compute
 a course grade as a weighted average of two tests and one final
 exam.     Item :               Percentage of Final Grade

 Test 1                  25%

 Test 2                  25%

 Capstone Exam              50%

 CourseGrade Output      80.25

 program asks the user for data, the program can be used later to compute course grades for
 many students with any set of grades. So let’s decide on and  create names for the values that must
 be input. To determine courseGrade, three values are required:  test1, test2, and finalExam.


 The first three analysis activities are now complete:
 1. Problem understood.

 2. Information to be output: courseGrade.

 3. Data to be input: test1, test2, finalExam, courseGrade.**/   public class Methods {
    public String Test1;
    public String Test2;
    public String finalExam;
    public String courseGrade;
    public Integer test1Percent;
    public Integer test2percent;
    public Integer capStone;
    int sum;//This is the beginning of the JavaCrash Course


    public String getTest1() {
        return Test1;
    }

    public void setTest1(String test1) {
        this.Test1 = test1;
    }

    public String getTest2() {
        return Test2;
    }

    public void setTest2(String test2) {
        this.Test2 = test2;
    }

    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public Integer getTest1Percent() {
        return test1Percent;
    }

    public void setTest1Percent(Integer test1Percent) {
        this.test1Percent = test1Percent;
    }

    public Integer getTest2percent() {
        return test2percent;
    }

    public void setTest2percent(Integer test2percent) {
        this.test2percent = test2percent;
    }

    public Integer getcapStone() {
        return capStone;
    }
    public void setCapStone(Integer capStone) {
        this.capStone = capStone;
    }

    /**This is the beginning of your Java Crash Course
     //We will start with the basics.
     //Currently owned by Oracle and contains a huge developer community. Java is platform Independent language write once run on a number of different platforms can fit needs of a of  virtually any types of application.*/


    //Methods
//    public static void addTwoInt(int a, int b){
//
//
//        sum = a + b;
//
//
//
//    }

    public static int addTwoInt(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        System.out.println("This program computes a course grade when");
        System.out.println("you have entered three requested values.");
        // Input test1, test2, and finalExam.
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first test: ");
        double test1 = keyboard.nextDouble();
        System.out.print("Enter second test: ");
        double test2 = keyboard.nextDouble();

        System.out.print("Enter final exam: ");
        double finalExam = keyboard.nextDouble();
        // Process
        double courseGrade = (0.25 * test1) + (0.25 * test2) + (0.50 * finalExam);
        // Output the results
        System.out.println("Course Grade: " + courseGrade + "%");

        //This is the beginning of the Java Crash Course
        System.out.println(addTwoInt(6,3));
    }
}