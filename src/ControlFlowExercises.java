/*

Operator	    Name                    Difference btwn JS
==	            Equality                NO ===; Can't compare things with different types; FOR OBJECTS compares location, use .equals() instead
!=	            Inequality              NO !==; No truthy or falsey, must be true or false
>	            Greater Than
<	            Less Than
>=	            Greater Than Or Equal
<=	            Less Than Or Equal

Operator	Name	Description
&&	        And	    Returns a true value if both expressions are true. This operator only evaluates the second expression if necessary.
||	        Or	    Returns a true value if either expression is true. This operator only evaluates the second expression if necessary.
&	        And	    Returns a true value if both expressions are true. This operator always evaluates both expressions. (Bitwise)
|	        Or	    Returns a true value if either expressions is true. This operator always evaluates both expressions. (Bitwise)
!	        Not	    Reverses the value of the expression.

* Switch statements- all variables must have same type, be literal or final variables
* Byte, short, char, int
* Falling through can be strategic to group values that have the same output
* Do loops if you want body of code to loop at least once (While loops do not do this if false)



 */

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int i = 5;
//        while (i < 15) {
//            System.out.println("i is " + i);
//            i++;
//        };

//        int i = 0;
//        int i = 100;
//        long i = 2;
//        do {
//            System.out.println("i is " + i);
//            i+=2;
//            i-=5;
//            i *= i;
//        } while (i <= 100);
//        } while (i >= 0);
//        } while (i < 1000000);

//        for (int i = 2; i <= 100; i+=2) {
//        for (int i = 100; i >= 0; i-=5) {
//        for (long i = 2; i < 1000000; i *= i) {
//            System.out.println("i is " + i);
//        }

//        for (int i = 1; i <= 100; ++i) {
//            if (i % 15 == 0) {
//                System.out.println("Fizzbuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        int i;
//        String userInput;
//        int baseInt;
//        int maxInt;
//        do {
//            System.out.println("Enter an integer.");
//            baseInt = scan.nextInt();
//            System.out.println("What number would you like to go up to?");
//            maxInt = scan.nextInt();
//            System.out.print("number | squared | cubed\n" +
//                    "---- | ----- | ---\n");
//            for (i = baseInt; i <= maxInt; ++i){
//                System.out.print(i + "\t| " + (i * i) + "\t| " + (i * i * i) + "\n");
//        }
//            System.out.println("\nWould you like to continue? [yes/no]");
//            userInput = scan.next();
//            ++i;
//        } while (userInput.equals("yes"));

//        int numberGrade;
//        String userInput;
//        do {
//            System.out.println("\nEnter a numerical grade from 0 to 100.");
//            numberGrade = scan.nextInt();
//            if (numberGrade <= 59) {
//                System.out.println("Your letter grade is: F");
//            } else if (numberGrade <= 66) {
//                System.out.println("Your letter grade is: D");
//            } else if (numberGrade <= 79) {
//                System.out.println("Your letter grade is: C");
//            } else if (numberGrade <= 87) {
//                System.out.println("Your letter grade is: B");
//            } else if (numberGrade <= 100) {
//                System.out.println("Your letter grade is: A");
//            } else {
//                System.out.println("Error, please enter a number between 0 and 100");
//            }
//            System.out.println("\nWould you like to continue? [yes/no]");
//            userInput = scan.next();
//        } while (userInput.equals("yes"));

    }
}
