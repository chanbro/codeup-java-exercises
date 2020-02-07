package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    // do not set new scanner in class; this will be applied for each method
    private Scanner scanner;

    // create object instance
    public Input() {
        // making a scanner for each called instance
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Input input = new Input();
//
//        System.out.println(input.getInt(3, 10));
        System.out.println(input.getInt());
//        System.out.println(input.getDouble(77, 77.7));
//        System.out.println(input.getInt("Enter an integer please"));

    }

    // create methods to apply to object instance
    public String getString() {
        String answer;
        System.out.println("Enter something");
        answer = this.scanner.next();
        return answer;
    }

    public boolean yesNo(String prompt) {
        String answer;
        System.out.println(prompt);
        answer = this.scanner.next();
        return answer.charAt(0) == 'y';
    }

    public boolean yesNo() {
        String answer;
        System.out.println("Enter yes or no");
        answer = this.scanner.next();
        return answer.charAt(0) == 'y';
    }

//    public int getInt(int min, int max) {
//        int answer;
//        do {
//            System.out.println("Enter an integer between " + min + " and " + max);
//            answer = this.scanner.nextInt();
//        } while (answer > max || answer < min);
//        return answer;
//    }

    public String getInt() {
        String s = "";
        try {
            System.out.println("Enter an integer.");
            Integer.valueOf(s = this.scanner.next());
        } catch (NumberFormatException ex) {
            System.out.println("Number Format Exception");
//            ex.printStackTrace();
        }
        return s;
    }

//    public int getInt() {
//        int answer;
//        System.out.println("Enter an integer");
//        answer = this.scanner.nextInt();
//        return answer;
//    }

    public int getInt(String prompt) {
        int answer;
        System.out.println(prompt);
        answer = this.scanner.nextInt();
        return answer;
    }

    public double getDouble(double min, double max) {
        double answer;
        do {
            System.out.println("Enter a double between " + min + " and " + max);
            answer = this.scanner.nextDouble();
        } while (answer > max || answer < min);
        return answer;
    }


//    public double getDouble(double min, double max) {
//        double answer;
//        do {
//            System.out.println("Enter a double betweeen " + min + " and " + max +": ");
//            answer = this.scanner.nextDouble();
//        } while (answer < min || answer > max);
//        return answer;
//    }

    public double getDouble(String prompt, double min, double max) {
        double answer;
        do {
            System.out.println(prompt);
            answer = this.scanner.nextDouble();
        } while (answer < min || answer > max);
        return answer;
    }

    public double getDouble() {
        return getDouble("Enter a double: ");
    }

    public double getDouble(String prompt) {
        double answer;
        System.out.println(prompt);
        answer = this.scanner.nextDouble();
        return answer;
    }


}