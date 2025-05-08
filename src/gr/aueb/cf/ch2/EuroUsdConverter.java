package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρεπει ευρω σε USD και cents.
 * Η ισοτιμια 99 cents = 1 euro
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        //Δηλωσεις και αρχικοποιησεις
        int numEuros = 0;
        int numDollars = 0;
        int numCents = 0;
        int totalUSD = 0;
        final int PARITY = 99;
        Scanner scannerEuros = new Scanner(System.in);

        //Εντολες
        System.out.println("please give me the amount of euros you wanna convert to dollars");
        numEuros = scannerEuros.nextInt();

        totalUSD = numEuros * PARITY;
        numDollars = totalUSD / 100;
        numCents = totalUSD % 100;

        //Εκτυπωση
        System.out.printf("the ammount of dollars from euros is: %d dollars and %d cents ", numDollars, numCents);
    }
}
