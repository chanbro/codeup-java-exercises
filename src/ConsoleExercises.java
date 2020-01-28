import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        double pi = 3.14159;
//        System.out.format("\nThe value of pi is approximately %f. \n", pi);

        int i = 0;
        while (i != -1) { // enter -1 to break out of loop
            System.out.print("Enter an integer: ");
            i = scanner.nextInt();
            System.out.println("\nThe number is " + i + ".\n");
        }

//        System.out.print("Enter a word: ");
//        String userInput = scanner.next();
//        System.out.print("Enter three (3) words.");
//        String userInput = scanner.nextLine(); // enter more than one string
//        System.out.println("You entered: --> \"" + userInput + "\" <--");

//        Declarations
        String string1, string2, string3;
//        Prompts
        System.out.println("Enter three words.");
//        System.out.println("Separate each with a return.");
//        Read in values
        string1 = scanner.next();
        string2 = scanner.next();
        string3 = scanner.next();
//        System.out.println("You entered: ");
//        System.out.println(string1 + ", " + string2 + " and " + string3);
        System.out.printf("\n The words are \"%s\", \"%s\" and \"%s\".\n", string1, string2, string3);
        scanner.nextLine(); //break between next lines


//        String sentence;
//        System.out.println("Enter a sentence.");
//        scanner.useDelimiter("\n"); // acts as next line between scanners
//        sentence = scanner.next(); //only returns first word UNLESS using delimiter
////        sentence = scanner.nextLine(); // does not need delimiter
//        System.out.println("You entered: ");
//        System.out.println(sentence);


//        String length;
//        String width;
//        String height;
//        System.out.println("Finding area and perimeter...");
//        System.out.println("Enter a length, width and height. Do not put units.");
//        length = scanner.nextLine();
//        int length = Integer.parseInt(length.trim());
//        width = scanner.nextLine();
//        int width = Integer.parseInt(width.trim());
//        height = scanner.nextLine();
//        int height = Integer.parseInt(height.trim());
//        System.out.println("The area is: ");
//        System.out.println(length * width);
//        System.out.println("The perimeter is: ");
//        System.out.println(2* length + 2 * width);
//        System.out.println("The volume is: ");
//        System.out.println(length * width * height);

//scanner.useDelimiter("\n");
//System.out.print("\nEnter the width: ");
//String sWidth = scanner.nextLine();
//double width = Double.parseDouble(sWdith);
//System.out.print("\nEnter the length: ");
//String sLength = scanner.nextLine();
//double length = Double.parseDouble(sLength);
//System.out.printf("The dimensions are %f by %f. \nThe perimeter is %f and the area is %f.\n", length, width, 2*(length+width), length*width);
//
//scanner.useDelimiter("\n");
//System.out.print("\nEnter the width: ");
//double width =


//        double length;
//        double width;
//        double height;
//        System.out.println("Finding area and perimeter...");
//        System.out.println("Enter a length, width and height. Do not put units.");
//        length = scanner.nextDouble();
//        scanner.useDelimiter("\n");
////        length = Double.parseDouble(length);
//        width = scanner.nextDouble();
//        scanner.useDelimiter("\n");
////        width = Double.parseDouble(width);
//        height = scanner.nextDouble();
//        scanner.useDelimiter("\n");
////        height = Double.parseDouble(height);
//        System.out.println("The area is: ");
//        System.out.println(length * width);
//        System.out.println("The perimeter is: ");
//        System.out.println(2* length + 2 * width);
//        System.out.println("The volume is: ");
//        System.out.println(length * width * height);

    }
}

/*
System.out.format("The value of " + "the float variable is " +
     "%f, while the value of the " + "integer variable is %d, " +
     "and the string is %s", floatVar, intVar, stringVar);
*/
