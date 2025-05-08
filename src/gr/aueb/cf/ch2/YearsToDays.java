package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Convert years (ages) to days.
 */
public class YearsToDays {

    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        //Εντολες
        System.out.println("Please insert your age:");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        //Εκτυπωση των αποτελεσματων
        System.out.printf("the total days of the age you gave me is: %d",days);
    }
}
