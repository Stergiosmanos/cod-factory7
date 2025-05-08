package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {

        // ΕΝΔΙΑΦΕΡΟΝ ΜΟΡΦΗ ΤΗΣ FOR
        for (int b = 1, p = 1; b<= 10; b++, p++) {
            System.out.printf("%d\n", pow(b, p));
        }

        Scanner scanner = new Scanner(System.in);
        long a;
        long n;
        long result;

        System.out.println("Please enter two integers");
        a = scanner.nextLong();
        n = scanner.nextLong();

        result = pow(a, n);
        System.out.printf("The factorial number of %d ^ %d is %d",a ,n, result );
    }

    /**
     * Calculates a^n.
     * Delegation / Forwarding.
     *
     * @param a the base.
     * @param n the power.
     * @return the base raised to the power.
     */
    public static long pow(long a, long n) {
//        long result = 1;
//
//        for (int i = 1; i <= n; i++) {
//            result *= a;
//        }
//        return result;
        return (long) Math.pow(a, n);
    }

}
