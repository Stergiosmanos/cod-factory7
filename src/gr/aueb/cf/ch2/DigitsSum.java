package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * να λαμβανει ως input απο τον χρηστη ενα διψηφιο
 * ακεραιο και να υπολογιζει και να εκτυπωνει
 * το αθροισμα των ψηφιων του.
 * Για παραδειγμα, αν ο χρηστης δωσει τον ακεραιο 15,
 * θα πρεπει το αποτελεσμα να ειναι
 * 1 + 5 = 6.
 */
public class DigitsSum {

    public static void main(String[] args) {
        //δηλωσεις μεταβλητων και αρχικοποιησεις
        int inputNum;
        int leftDigit;
        int rightDigit;
        int sum;
        Scanner in = new Scanner(System.in);

        //Εντολες
        System.out.println("Δωσε εναν διψηφιο ακεραιο:");
        inputNum = in.nextInt();
        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        //Αποτελεσματα πραξεων και εκτυπωση
        System.out.printf("Το αθροισμα των ψηφιων %d + %d ειναι: %d", leftDigit, rightDigit, sum);
    }
}
