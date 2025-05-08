package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * IO in Strings.
 */
public class IOStrApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1;      // εδώ ο δείκτης είναι null.
        String s2 = ""; // έχει length 0.

        System.out.println("Please insert two strings");
        s1 = in.next();      // Διαβάζει μέχρι να βρεί whitespace (spaces, \t, \n)
        s2 = in.nextLine();  // Διαβάζει τα πάντα μέχρι να βρει \n.

        System.out.printf("s1: %s\n", s1);
    }
}
