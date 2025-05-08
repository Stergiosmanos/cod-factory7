package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τριαδικος τελεστης!!!
 * Calculates the absolute of an int,
 * that is abs(num) = num ,If num is positive.
 * or -num if num is negative.
 */
public class TernaryApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        int abs;

        System.out.println("Please insert a num");
        num1 = in.nextInt();

        // Διαφορετικη απεικονιση του if χωρις αγγιστρα
        // μονο αν ειναι μια εντολη (χωρις nested if)
        if (num1 >= 0) abs = num1;
        else abs = -num1;

        // Ternary Operator
        abs = (num1 >= 0) ? num1 : -num1;

        System.out.printf("Abs of %d is %d", num1, abs);

    //    Ενας διαφορετικος τροπος!!
    //    System.out.printf("Abs of %d is: %d", num1, (num1 > 0) ? num1 : -num1);
    }
}
