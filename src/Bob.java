import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String saySomething;
        String userInput;
//        int emptyString;
        do {
            System.out.println("Say something to Bob, the lackadaisical teenager.");

            saySomething = scanner.nextLine();
//            int emptyString = saySomething.length();

            if (saySomething.endsWith("?")) {
                System.out.println("Sure.\n");
                System.out.println("Wow! You actually got him to chill out.\n\nWanna try to talk to him again?");
            } else if (saySomething.endsWith("!")) {
                System.out.println("Whoa, chill out!\n");
                System.out.println("Yikes! Maybe watch your tone...\n\nWanna try to get him to say something else?");
            } else if (saySomething.equals(" ") || saySomething.isEmpty()) {
                System.out.println("Fine. Be that way!\n");
                System.out.println("So he doesn't want to be left alone now??\n\nWanna try to get him to say something else?");
            } else {
                System.out.println("Whatever.\n");
                System.out.println("Apathy is better than anger, right?\n\nWanna try to get him to say something else?");
            }
            userInput = scanner.nextLine();
        } while (userInput.equals("yes"));

    }
}
