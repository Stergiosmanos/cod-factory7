package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Δίσεκτο είναι ένα έτος αν διαιρείται με το 4
 * και είτε δε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYearApp2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = 0;

        System.out.println("Please give me the year (integer number):");
        inputYear = in.nextInt();

        if (inputYear % 4 != 0) {
            System.out.println("The year: " + inputYear + " is not leap.");
            System.exit(1);
        }

        if (inputYear % 100 != 0) {
            System.out.println("The year: " + inputYear + " is leap.");
            System.exit(0);
        }

        if (inputYear % 400 != 0) {
            System.out.println("The year: " + inputYear + " is not leap.");
            System.exit(1);
        }

        System.out.printf("The year %d is a leap year! Congrats.", inputYear);
    }
}
