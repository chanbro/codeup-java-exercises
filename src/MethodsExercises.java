import java.util.Scanner;

public class MethodsExercises {
    //keep methods separated
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
//        subtraction(2, 1);
//        System.out.println(multiplication(2, 2));
//        division(6, 3);
//        System.out.println(modulus(24, 6));
//        System.out.println(multiAddition(7, 8));
//        System.out.println(multiAdditionRecursive(7, 8));
//        System.out.println(getInteger(1, 10));
//        System.out.println(factorial());
        System.out.println(dice());
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static void division(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }

    public static int multiAddition(int base, int multiplier) {
        int total = 0;
        for (int i = 0; i < multiplier; i++) {
            total += base;
        }
        return total;
    }

    public static long multiAdditionRecursive(int base, int multiplier) {
        if (multiplier == 0 || base == 0) {
            return 0;
        }
        return base + multiAdditionRecursive(base, multiplier - 1);
    }

    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput > 10 || userInput < 1) {
            System.out.print("Please enter a valid number.\n");
            return getInteger(min, max);
        }
        System.out.print("You picked: ");
        return userInput;
    }

    //long can store up to 2^63 bytes; maximum value is 49 because 50! has 10^64
    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        long recalculate;
        do {
            System.out.print("Enter an integer between 1 and 49: ");

            long userInput = scanner.nextInt();
            long total = 1;
            for (long i = 1; i < userInput; i++) {
                if (userInput < 50) {
                    total *= i;
                } else {
                    System.out.println("Please enter a valid number");
                    return factorial();
                }
            }
            System.out.print(userInput + "! total is: " + (userInput * total));
            System.out.println("\nEnter 1 to calculate another factorial, or 0 to exit.");
            recalculate = scanner.nextInt();
        } while (recalculate == 1);
        return recalculate;
    }

    public static int dice() {
        Scanner scanner = new Scanner(System.in);
        int sides;
        int ready;
        int die1;
        int die2;
        int reroll;

        do {
            System.out.println("Let's roll a pair of dice!\n");
            System.out.println("Enter the number of sides on the die: ");
            sides = scanner.nextInt();
            System.out.println("\nReady to roll? Enter 1 for yes and 0 to exit.");
            ready = scanner.nextInt();
            die1 = (int) (Math.random() * sides) + 2;
            die2 = (int) (Math.random() * sides) + 2;
            System.out.println("First die: " + die1);
            System.out.println("Second die: " + die2);
            System.out.println("Total: " + (die1 + die2));
            System.out.println("\nWould you like to roll again? Enter 1 for yes and 0 to exit.");
            reroll = scanner.nextInt();
        } while (reroll == 1);
        return reroll;
    }
}
