package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανιζει επαναληπτικα ενα μενου 5 επιλογων
 * μεχρι ο χρηστης να δωσει 5 για τον τερματισμο
 * του προγραμματος.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNumber = 0;

        do {
            System.out.println("Διαλεξε μια απο τις παρακατω επιλογες:");
            System.out.println("1. Εισαγωγη");
            System.out.println("2. Διαγραφη");
            System.out.println("3. Ενημερωση");
            System.out.println("4. Αναζητηση");
            System.out.println("5. Εξοδος");

            inputNumber = in.nextInt();

            if (inputNumber <= 0 || inputNumber > 5) {
                System.out.println("Λαθος επιλογη.");
                continue;
            }

            if (inputNumber == 1) {
                System.out.println("Επιλεξατε Εισαγωγη.");
            } else if (inputNumber == 2) {
                System.out.println("Επιλεξατε Διαγραφη.");
            } else if (inputNumber == 3) {
                System.out.println("Επιλεξατε Ενημερωση.");
            } else if (inputNumber == 4) {
                System.out.println("Επιλεξατε Αναζητηση.");
            }else {
                System.out.println("Επιλεξατε Εξοδο.");
            }
        } while (inputNumber != 5);
    }
}
