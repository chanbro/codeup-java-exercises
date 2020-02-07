import java.util.Scanner;

public class Sandbox {
    public static void main(String[] args) {
        Sandbox a = new Sandbox();
        boolean moveOn = false;
        do {
            try {
                System.out.println(a.getInt());
                moveOn = true;
            } catch (Exception ex) {
                System.out.println("That's not what we asked for ");
            }
        } while (!moveOn);
    }

    private Scanner scanner;

    public Sandbox() {
        this.scanner = new Scanner(System.in);
    }

    public int getInt() {
        int answer;
        System.out.println("Enter an integer");
        answer = this.scanner.nextInt();
        return answer;
    }
}
