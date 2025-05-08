package gr.aueb.cf.ch3;

import java.util.Scanner;

/** Ελέγχει αν ένα έτος είναι δίσεκτο.
 * Δίσεκτο είναι ένα έτος αν διαιρείται με το 4
 * και είτε δε διαιρείται με το 100 ή διαιρείται με το 100 και το 400.
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeapYear = false;

        System.out.println("Please give me the year (integer number):");
        inputYear = in.nextInt();

        /*
        if (inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0)) {
            isLeapYear = true;
        }
        */

        isLeapYear = inputYear % 4 == 0 && (inputYear % 100 != 0 || inputYear % 400 == 0);

        System.out.printf("The year %d is a leap year: %b", inputYear, isLeapYear);

    }
}
