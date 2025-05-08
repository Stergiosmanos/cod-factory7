package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ο χρηστης δινει το πληθος των n stars
 * και κανουμε διαφορετικες εκτυπωσεις αναλογως.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputStars;

        System.out.println("PLease give the number of stars:");
        inputStars = scanner.nextInt();

        // Εκτυπωνει n οριζοντια αστερακια
        for (int i = 1; i <= inputStars; i++) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.println();

        // εκτυπωνει n καθετα αστερακια
        for (int i = 1; i <= inputStars; i++) {
            System.out.println("*");
        }
        System.out.println();

        // εκτυπωνει n επι n
        for (int i = 1; i <= inputStars; i++) {
            for (int j = 1; j <= inputStars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // εκτυπωνει απο 1 εως n
        for (int i = 1; i <= inputStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // εκτυπωνει απο n εως 1
        for (int i = 1; i <= inputStars; i++) {
            for (int j = inputStars; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // εκτυπωνει απο n εως 1 ΔΕΥΤΕΡΟΣ ΤΡΟΠΟΣ
        for (int i = inputStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
