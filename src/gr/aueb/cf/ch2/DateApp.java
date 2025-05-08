package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Προγραμμα οπου διαβαζει απο τον χρηστη 3 ακεραιους αριθμους
 * και τους εμφανιζει σε μορφη ΗΗ/ΜΜ/ΕΕ (ημερομηνια)
 */
public class DateApp {

    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;
        int editedYear = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me 3 integers for day, month, year: ");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        editedYear = year % 100;
        System.out.printf("%02d/%02d/%d", day, month, editedYear);
    }
}
