package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ergasia1ExceptionDeepSeek {
    private static final int MIN_CHOICE = 1;
    private static final int MAX_CHOICE = 5;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        while (true) {
            try {
                printMenu();
                choice = getChoice();
                System.out.println("You choose " + choice);
                if (choice == 5) break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage()); // Περισσότερες πληροφορίες
            }
        }
        System.out.println("Good bye...");
        in.close(); // Κλείσιμο Scanner
    }

    public static void printMenu() {
        System.out.println("Choose one of the followings.");
        System.out.println("Menu");
        System.out.println("1 choice.");
        System.out.println("2 choice.");
        System.out.println("3 choice.");
        System.out.println("4 choice.");
        System.out.println("5 Exit.");
    }

    public static int getChoice()  throws IllegalArgumentException {
        while (!in.hasNextInt()) {
            System.out.println("Please insert a number between 1-5.");
            in.nextLine(); // Καθαρισμός buffer
        }
        int choice = in.nextInt();
        in.nextLine();

        if (!isValidChoice(choice)) {
            throw new IllegalArgumentException("Error. The choice " + choice + " is invalid. Choose between 1-5.");
        }
        return choice;
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= MIN_CHOICE && choice <= MAX_CHOICE);
    }
}
