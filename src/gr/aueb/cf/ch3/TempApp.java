package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * λαμβανει μια θερμοκρασια απο τον χρηστη
 * και εμφανιζει καταλληλο μηνυμα.
 */
public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBeloweeZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBeloweeZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBeloweeZero);
    }
}
