package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * 1. Εφαρμογή όπου εμφανίζει ενα μενού 6 επιλογών όπου ο χρήστης
 * επιλεγεί και τερματίζει εαν επιλέξει το 6.
 *
 * 2. Μέθοδος οπού δέχεται θερμοκρασία σε βαθμούς Κελσίου
 * και τη μετατρεπει σε Φαρενάιτ.
 *
 * 3. Μέθοδος οπού δέχεται απο τον χρήστη έναν ακέραιο και
 * επιστρέφει το τετράγωνο του.
 *
 * 4. Μέθοδος όπου δέχεται έναν ακέραιο και επιστρέφει true εαν είναι
 * πρώτος αλλιώς επιστρέφει false.
 *
 * 5. Μέθοδος όπου δέχεται 3 ακεραίους αριθμούς και επιστρέφει τον
 * μεγαλύτερο από αυτούς.
 */
public class Askisi1Ch5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int n;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Please give a valid number.");
                continue;
            }

            if (choice == 6) {
                System.out.println("Exit...");
                break;
            }

            System.out.println("Δώσε αριθμό για αστεράκια");
            n = scanner.nextInt();
            doOnChoice(choice, n);

        } while (choice != 6);
    }

    // Horizontal Stars
    public static void 	horizontallyStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }

    // Vertical Stars
    public static void 	verticallyStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("* ");
        }
        System.out.println();
    }

    // Stars NxN
    public static void 	nxnStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontallyStars(n);
            System.out.println();
        }
        System.out.println();
    }

    // Ascending Stars
    public static void 	ascendingStars(int n) {
        for (int i = 1; i <= n; i++) {
            horizontallyStars(i);
            System.out.println();
        }
        System.out.println();
    }

    // Descending Stars
    public static void 	descendingStars(int n) {
        int tmp = n;
        for (int i = 1; i <= n; i++) {
            horizontallyStars(tmp);
            System.out.println();
            tmp --;
        }
    }

    // Εκτυπώνει το μενού επιλογών
    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
        System.out.println("Δώσε επιλογή:");
    }

    public static boolean isChoiceValid(int choice) {
        return  choice >= 1 && choice <= 6;
    }

    public static void doOnChoice(int choice, int n) {
        switch (choice) {
            case 1:
                horizontallyStars(n);
                System.out.println();
                System.out.println();
                break;
            case 2:
                verticallyStars(n);
                break;
            case 3:
                nxnStars(n);
                break;
            case 4:
                ascendingStars(n);
                break;
            case 5:
                descendingStars(n);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

}
