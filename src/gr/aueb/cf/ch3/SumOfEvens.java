package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των αρτιων απο το 2
 * μεχρι ενα οριο που δινει ο χρηστης.
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = scanner.nextInt();

        while (i <= inputNum) {
            sum  += i;
            i += 2;
        }

        System.out.println("The sum of even number up to " + inputNum + " is: " + sum);
    }
}
