import java.util.Scanner;

public class MethodsExercises {
    //keep methods separated
    public static void main(String[] args) {
        System.out.println(addition(1, 2));
        subtraction(2, 1);
        System.out.println(multiplication(2, 2));
        division(6, 3);
        System.out.println(modulus(24, 6));
        System.out.println(multiAddition(7, 8));
        System.out.println(multiAdditionRecursive(7, 8));
        System.out.println(getInteger(1, 10));
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
                return getInteger(min, max);
            }
            return userInput;
    }

}