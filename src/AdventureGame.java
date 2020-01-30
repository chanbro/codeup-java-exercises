import java.util.Scanner;

public class AdventureGame {

    public static void main(String[] args) {
        System.out.println("   ▄████████    ▄████████    ▄███████▄         ▄██████▄   ▄██████▄  ████████▄  \n" +
                "  ███    ███   ███    ███   ███    ███        ███    ███ ███    ███ ███   ▀███ \n" +
                "  ███    ███   ███    ███   ███    ███        ███    █▀  ███    ███ ███    ███ \n" +
                " ▄███▄▄▄▄██▀   ███    ███   ███    ███       ▄███        ███    ███ ███    ███ \n" +
                "▀▀███▀▀▀▀▀   ▀███████████ ▀█████████▀       ▀▀███ ████▄  ███    ███ ███    ███ \n" +
                "▀███████████   ███    ███   ███               ███    ███ ███    ███ ███    ███ \n" +
                "  ███    ███   ███    ███   ███               ███    ███ ███    ███ ███   ▄███ \n" +
                "  ███    ███   ███    █▀   ▄████▀             ████████▀   ▀██████▀  ████████▀  ");
        System.out.println("\n\nReady to become the greatest? [yes/no]");
        gameStart();
    }

    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);
        String ready;
        ready = scanner.next();
        if (ready.equals("no")) {
            System.out.println("Scrub.");
        } else {
            System.out.println("\n*Feel Good Inc. laughs* You ain't ready.");
            getName();
            pickStats();
//            levelSelect();
            kanye();
        }
    }

    static String rapName;
    static String homeTown;

    public static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your rap name lil homie?");
        rapName = scanner.nextLine();
        System.out.println(rapName + ". Hope you still like that when it's on a marquee.");
        System.out.println("\nWhat city do you rep, " + rapName + "?");
        homeTown = scanner.nextLine();
        System.out.println(rapName + " from " + homeTown + ". Welcome to the game.");
    }

    static int cred;
    static int rap;
    static int diss;
    static int flex;

    public static void pickStats() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWhat's your strongest rap skill, " + rapName + "?");
        System.out.println("\nRap:\tYour bars are so impeccable they call you the Shakespeare of " + homeTown + "\nDiss:\tYou leave people so salty they need to get their sodium levels checked\nFlex:\tMoney is power, make it rain on dem");
        String userInput = scanner.nextLine().toLowerCase();

        switch (userInput) {
            case "rap":
                cred = 10;
                rap = 3;
                diss = 2;
                flex = 1;
                break;
            case "diss":
                cred = 10;
                rap = 1;
                diss = 3;
                flex = 2;
                break;
            case "flex":
                cred = 10;
                rap = 2;
                diss = 1;
                flex = 3;
                break;
            default:
                System.out.println("You ain't never gonna make it in the game if you don't pay attention, fool!");
                pickStats();
        }
    }

//    public static void levelSelect() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Select a rap battle level between 1 and 4, or enter random to go against a random rapper");
//        int level = scanner.nextInt();
//
//        switch (level) {
//            case 1:
//                lilB();
//                break;
//            case 2:
//                drake();
//                break;
//            case 3:
//                missy();
//                break;
//            case 4:
//                kanye();
//                break;
//            case 5:
//                tupac();
//                break;
//            case 6:
//                int randomSelect = (int) (Math.random() * 5) + 1;
//                switch (randomSelect) {
//                    case 1:
//                        supaHotFire();
//                        break;
//                    case 2:
//                        drake();
//                        break;
//                    case 3:
//                        missy();
//                        break;
//                    case 4:
//                        kanye();
//                        break;
//                    case 5:
//                        eminem();
//                        break;
//                    case 6:
//                        // code block
//                        break;
//                    case 7:
//                        tupac();
//                        break;
//                }
//        }
//    }
//
//

    static int baseCred = 5;
    static int kanyeCred = baseCred * 2;
    static int kanyeAttack = (int) (Math.random() * 3) + 1;

    public static void kanye() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your opponent:\tKanye West\n");
        System.out.println("Enter \"options\" to view battle options.");
//        Enter "hint" at any point for a tip on how to decrease Kanye's cred.
        String userInput = scanner.nextLine();
//        if (userInput.equals("hint")) {
//            System.out.println("Strength:\tSick beats\nWeakness:\tEgo");
//            kanye();
//        } else
            if (userInput.equals("options")) {
            System.out.println("Rap:\tThrow down some rhymes\nDiss:\tInsult your opponent\nFlex:\tFlaunt your assets");
            kanye();
        } else if (kanyeCred <= 3) {
            System.out.println("You know you had to do it to em... time to spitfire" + rapName);
            System.out.println("Poopy-di scoop\nScoop-diddy-whoop\nKanye is nincompoop\nGet in my face it's going down\nDon't step up to a ninja from " + homeTown.charAt(0) + "-town");
            System.out.println("\nYou won the battle homes.");
            flex += 2;
            System.out.println("Your flex increased by 2!");
            gameStart();
        } else if (userInput.equalsIgnoreCase("rap")) {
            kanyeCred -= rap;
            System.out.println("Your damage: " + rap + "\nKanye's cred: " + kanyeCred);
            System.out.println("\nKanye:\tRock Forever 21 but just turned thirtayyy\nThe crowd goes wild.");
            cred -= kanyeAttack;
            System.out.println("Kanye's damage: " + kanyeAttack + "\nYour cred: " + cred);
            kanye();
        } else if (userInput.equalsIgnoreCase("diss")) {
            kanyeCred -= diss;
            System.out.println("Your damage: " + diss + "\nKanye's cred: " + kanyeCred);
            System.out.println("\nKanye:\tI miss the old Kanye, straight from the go Kanye");
            cred -= kanyeAttack;
            System.out.println("Kanye's damage: " + kanyeAttack + "\nYour cred: " + cred);
            kanye();
        } else if (userInput.equalsIgnoreCase("flex")) {
                kanyeCred -= flex;
                System.out.println("Your damage: " + flex + "\nKanye's cred: " + kanyeCred);
                System.out.println("Kanye:\tIN A FRENCH ASS RESTAURANT, HURRY UP WITH MY DAMN CROISSANT");
                cred -= kanyeAttack;
                System.out.println("Kanye's damage: " + kanyeAttack + "\nYour cred: " + cred);
                kanye();
            } else {
                kanye();
            }
    }

}
