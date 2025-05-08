package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Ergasia1Exception {
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
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println("Good bye...");
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

    public static int getChoice()throws IllegalArgumentException {
        int choice;

        while (!in.hasNextInt()) {
            System.out.println("Please insert between 1-5.");
            in.nextLine();
        }
        choice = in.nextInt();
        in.nextLine();

        try {
            if (!isValidChoice(choice)) {
                throw new IllegalArgumentException("Error. The choice " + choice + " you choose is invalid.Choose between 1-5.");
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }
        return choice;
    }

    public static boolean isValidChoice(int choice) {
        return (choice >= 1 && choice <= 5);
    }
}
