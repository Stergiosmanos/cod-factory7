package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης θα δινει:
 * 1. τους συνολικους βαθμους των μαθηματων
 * 2. το πληθος των μαθηματων
 *
 * θα υπολογιζει τον μεσο ορο των μαθηματων και θα χαρακτηριζει
 * 'Αριστα' αν ο μο ειναι >=9
 * 'Πολυ καλα' αν ο μο ειναι >= 7
 * 'Καλως' αν ο μο ειναι >= 5 και
 * 'Αποτυχια' αν ο μο ειναι <5
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks.");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be negative or zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count.");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses must not be negative or zero.");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if  (average > 10) {
            System.out.println("The average must be less or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent!!");
        } else if (average >= 7) {
            System.out.println("Very good!");
        } else if (average >= 5) {
            System.out.println("Good.");
        }else {
            System.out.println("Failure.");
        }

    }
}
