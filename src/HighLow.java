import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        System.out.println("\nWe have selected a random number between 1 and 100.\n");
        System.out.println("Can you guess that number in 10 attempts or less?\n");
        System.out.println(guessingGame(9));
    }

    // using static creates constant variable outside of method that can be called in another method
    static int randomNumber = (int) (Math.random() * 100) + 1;
    public static int guessingGame(int limit) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int userGuess;
        System.out.println("Guess the number:\t");
        userGuess = scanner.nextInt();

        if (limit == 0) {
            System.out.println("GAME OVER!\n");
            System.out.println("The number was\t" + randomNumber);
            System.out.println("Chances remaining:\t");
            return counter;
        } else if (userGuess > randomNumber) {
            System.out.println("LOWER\n");
            ++counter;
            System.out.println("Chances remaining:\t" + (limit -= counter));
            return guessingGame(limit);
        } else if (userGuess < randomNumber) {
            System.out.println("HIGHER\n");
            ++counter;
            System.out.println("Chances remaining:\t" + (limit -= counter));
            return guessingGame(limit);
        } else {
            System.out.println("GOOD GUESS!\n");
            System.out.println("Chances used to guess number:\t");
            return 10-limit;
        }

    }
}
